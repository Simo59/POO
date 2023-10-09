package goosegame;
public class TeleportCell extends BasicCell{
  protected int teleportIndex;
/**
* create the teleportation cell
* @param the index of the cell
*/
  public TeleportCell(int index,int teleportIndex){
    super(index);
    this.teleportIndex=teleportIndex;
  }

/**
   * @see goosegame.Cell#bounce(int diceThrow)
  */
  public int bounce(int diceThrow){
   return this.teleportIndex;

  }

  public String toString(){
    return super.toString() + "(teleport to "+ teleportIndex + ")";
  }
}
