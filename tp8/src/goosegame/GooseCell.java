package goosegame;
public class GooseCell extends BasicCell{
 /**
 * create the goose Cell
 * @param the index of the cell
 */
  public GooseCell(int index){
    super(index);
  }

  /**
   * @see goosegame.Cell#bounce(int diceThrow)
  */
  public int bounce(int diceThrow){
    return    diceThrow;
  }

  public String toString(){
    return super.toString() + "(goose)";
  }
}
