package goosegame;
public abstract class Board{
protected final int NB_OF_CELLS;
protected Cell[] theCells;


public Board(int nbOfCells){
    this.NB_OF_CELLS=nbOfCells;
    this.theCells=new Cell[this.NB_OF_CELLS+1];
    this.initBoard();
}
/**
* initialize the board
*/
public abstract void initBoard();

/**
* get tthe cell with the index given
* @param the index of the cell
* @return the cell with the index given
*/
public Cell getCell(int index){
    return this.theCells[index];
}

/**
* get the number of the cells of the board
* @return the number of cells
*/
public int getNbOfCell(){
    return this.NB_OF_CELLS;
}

}
