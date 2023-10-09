package goosegame;
public class TrapCell extends BasicCell {


  public TrapCell(int index){
    super(index);
  }
  /**
   * @see goosegame.Cell#canBeLeft
  */
public boolean canBeLeft(){
   return false;
}

public String toString(){
return super.toString() + "(trap)";
}

}
