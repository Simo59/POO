package goosegame;
public class StartCell implements Cell{


  /**
   * @see goosegame.Cell#getIndex()
  */
public int getIndex(){
  return 0;
}
/**
 * @see goosegame.Cell#getPlayer()
*/
public Player getPlayer(){
  return null;
}
/**
 * @see goosegame.Cell#bounce(int diceThrow)
*/
public int bounce(int diceThrow){
   return 0;
}
/**
 * @see goosegame.Cell#isBusy()
*/
public boolean isBusy(){
  return false;
}
/**
 * @see goosegame.Cell#canBeLeft()
*/
public boolean canBeLeft(){
return true;
}
/**
 * @see goosegame.Cell#handleOnComing()
*/
 public void handleOnComing(Player p){

 }

 public String toString(){
   return " start cell ";
 }


}
