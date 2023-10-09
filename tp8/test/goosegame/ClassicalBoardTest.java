package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;



public class ClassicalBoardTest{
  private Board board;

  @Before
  public void before(){
    this.board=new ClassicalBoard();
  }

  @Test
  public void initBoardTest(){

assertTrue(board.getCell(0) instanceof StartCell);
assertTrue(board.getCell(1) instanceof BasicCell);
assertTrue(board.getCell(2) instanceof BasicCell);
assertTrue(board.getCell(3) instanceof BasicCell);
assertTrue(board.getCell(9) instanceof GooseCell);
assertTrue(board.getCell(18) instanceof GooseCell);
assertTrue(board.getCell(27) instanceof GooseCell);
assertTrue(board.getCell(36) instanceof GooseCell);
assertTrue(board.getCell(45) instanceof GooseCell);
assertTrue(board.getCell(54) instanceof GooseCell);
assertTrue(board.getCell(31) instanceof TrapCell);
assertTrue(board.getCell(52) instanceof TrapCell);
assertTrue(board.getCell(6) instanceof TeleportCell);
assertTrue(board.getCell(42) instanceof TeleportCell);
assertTrue(board.getCell(58) instanceof TeleportCell);
assertTrue(board.getCell(19) instanceof WaitingCell);

  }
  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(goosegame.ClassicalBoardTest.class);
  }

}
