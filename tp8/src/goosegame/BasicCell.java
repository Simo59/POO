package goosegame;
public class BasicCell implements Cell{
    protected Player player;
    protected final int index;


    public BasicCell(int index){
        this.index=index;
    }
    /**
     * @see goosegame.Cell#getIndex()
    */
    public int getIndex(){
        return this.index;
    }
    /**
     * @see goosegame.Cell#getPlayer()
    */
    public Player getPlayer(){
      return this.player;
    }
    /**
     * @see goosegame.Cell#isBusy()
    */
    public boolean isBusy(){
      return ( this.player != null);
    }
    /**
     * @see goosegame.Cell#bounce(int diceThrow)
    */
  public int bounce(int diceThrow ){
    return 0;
  }
  /**
   * @see goosegame.Cell#canBeLeft()
  */
    public boolean canBeLeft(){
      return true;
    }

    /**
     * @see goosegame.Cell#handleOnComing(Player p )
    */
    public void handleOnComing(Player p){
    
      this.player=p;
    }

    public String toString(){
      String res="cell "+this.index;
      return res ;
    }


}
