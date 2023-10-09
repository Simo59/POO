package goosegame;
public class WaitingCell extends BasicCell{
  protected int waitingTime;
  protected int waitingDuration;

  public WaitingCell(int index, int waitingDuration){
    super(index);
    this.waitingDuration= waitingDuration;
    this.waitingTime=0;
  }

  /**
   * @see goosegame.Cell#canBeLeft()
  */
  public boolean canBeLeft(){
    if( this.waitingDuration == this.waitingTime){
      return true;
    }
    else{
      this.waitingTime+=1;
      return false;
    }
  }


/**
 * @see goosegame.Cell#handleOnComing(Player p)
*/
  public void handleOnComing(Player p){
    super.handleOnComing(p);
    waitingTime=0;
    }

    public String toString(){

      return super.toString()+" (waiting for "+this.waitingDuration+" turns)";
    }


}
