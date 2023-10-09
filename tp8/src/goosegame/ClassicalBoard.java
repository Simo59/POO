package goosegame;
public class ClassicalBoard extends Board{
  private static final int ORIGINAL_BOARD_CELLS = 63;
/**
* create the classical board with 63 Cells
*/
  public ClassicalBoard(){
    super(ORIGINAL_BOARD_CELLS);
  }

/**
* initialize the cells of the classical board with there types
*/
public void initBoard(){
  for (int i=0;i<=ORIGINAL_BOARD_CELLS;i++){
    if(i==0){
      this.theCells[i]=new StartCell();
    }
    else if( i%9==0 && i<63){
      theCells[i]=new GooseCell(i);
    }
    else if(i==31||i==52){
      theCells[i]=new TrapCell(i);
    }
    else if(i==19){
      theCells[i]=new WaitingCell(i,2);
    }
    else if(i==6) {
      theCells[i]=new TeleportCell(i,12);
    }
    else if(i==42){
      theCells[i]=new TeleportCell(i,30);
    }
    else if(i==58){
      theCells[i]=new TeleportCell(i,1);
    }
    else{
      this.theCells[i]=new BasicCell(i);
    }

  }
}

}
