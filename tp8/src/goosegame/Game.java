package goosegame;
import java.util.*;
public class Game{

protected List<Player> thePlayers;
protected Board board;
protected Iterator<Player>it;

/**
* create the game to play
* @param the board on which the players will play
*/
public Game(Board board){
    this.board=board;
    this.thePlayers=new ArrayList<>();

}
/**
* add a player to the liste of the players
* @param p the player to add
*/
public void addPlayer(Player p){
    this.thePlayers.add(p);
    this.board.getCell(0).handleOnComing(p);
    p.setCell(this.board.getCell(0));
}

/**
* verify if the player can play this turn
* @param the player to verify if he can play
* @return true if the player can play else false
*/

public boolean canPlay(Player p){
  return p.getCell().canBeLeft();
}

/**
* display the name and the current cell of the player
* @param the player to display
*/
private void displayNameAndCurrentCell(Player p){
  System.out.println(p +" is in  " + p.getCell()+",");
}

/**
 * display the dice dice throw and the player who throws it
 * @param p the player who throws the dice
 * @param th the result of the throw
*/
private void displayDice(Player p,int th){
  System.out.println(p+ " throws " + th+"," );
}


/**
* display the cell reached without counting the bounce of the cell
* @param pl the player who reach the cell
* @param p the index of the cell reached
*/
private void afficheCelleDarriverSansRebond(Player pl,int p){
  System.out.println(pl+" reaches "+this.board.getCell(p));
}



/**
* display the cell reached with the bounce of the cell
* @param pl the player who reach the cell
* @param p the index of the cell reached
*/
private void displayApresRebond(Player pl,int p ){
System.out.println( " and jumps to "+this.board.getCell(p)+".");
}


/**
* change the player who is playing at each turn
* @return the player who will play
*/
private Player nextPlayer(){
        if(it==null || (!it.hasNext())){
            it = this.thePlayers.iterator();
        }
        return it.next();
    }




/**
* find the reached cell of the player after the dice throw and display the mouvements
* @param p the player who is playing
* @param th the dice throw
* @return the cell reached by the player with the dice throw
*/
private Cell reachedCell(Player p,int th){
  int indexOrigin = p.getCell().getIndex();
  Cell cellOrigin = this.board.getCell(indexOrigin);
  cellOrigin.handleOnComing(null);
  int indexAtteint=indexOrigin+th;
  if(indexAtteint>this.board.getNbOfCell()){
    int recul = indexAtteint-this.board.getNbOfCell();
    indexAtteint  = this.board.getNbOfCell()-recul;
  }
  Cell atteinte = this.board.getCell(indexAtteint);
  int rebond = atteinte.bounce(th);
  int res;

  if (rebond ==0){

    res=indexAtteint;
    if(res>this.board.getNbOfCell()){
      int recul = res-this.board.getNbOfCell();
      res  = this.board.getNbOfCell()-recul;
    }
    afficheCelleDarriverSansRebond(p,res);
  }
  else if(rebond == th){

    res=indexAtteint+th;
    if(res>this.board.getNbOfCell()){
      int recul = res-this.board.getNbOfCell();
      res  = this.board.getNbOfCell()-recul;
    }
    afficheCelleDarriverSansRebond(p,indexAtteint);
    displayApresRebond(p,res);
  }
  else{

    res=rebond;

    if(res>this.board.getNbOfCell()){
      int recul = res-this.board.getNbOfCell();
      res  = this.board.getNbOfCell()-recul;
    }
    afficheCelleDarriverSansRebond(p,indexAtteint);
    displayApresRebond(p,res);
  }
 Cell resf=this.board.getCell(res);
 return resf;
}




/**
*the method play wich play the all game (une partie)
*/
public void play(){
  boolean winner= false;
  Player pl = null;
 while(!winner){
   pl=this.nextPlayer();
  displayNameAndCurrentCell(pl);
  if(this.canPlay(pl)){
    int diceThrow = pl.twoDiceThrow();
    int originIndex = pl.getCell().getIndex();
    Cell originCell = this.board.getCell(originIndex);
    // afficher la cell actuel et le lance
    displayDice(pl,diceThrow);
    Cell reach=this.reachedCell(pl,diceThrow);


    if(reach.isBusy()){
      System.out.println("cell is busy ,");
      Player sent = reach.getPlayer();
      sent.setCell(originCell);
      originCell.handleOnComing(sent);

      System.out.println(sent +" is sent to " + originCell +".");
    }
    pl.setCell(reach);
    reach.handleOnComing(pl);
    if(pl.getCell().getIndex()==this.board.getNbOfCell()){
      System.out.println(pl+" has won ");
      winner=true;
    }

  }

  else{
   System.out.println(pl+" cannot play ");
  }
}

}



}
