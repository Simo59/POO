package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PlayerTest{
  private Cell c1;
  private Cell c2;
  private Player p1;
  private int ind1 ;
  private int ind2  ;
  private String name;

  @Before
  public void before(){
   this.ind1=2;
   this.ind2=4;
   this.c1=new BasicCell(ind1);
   this.c2=new BasicCell(ind2);
   this.name="frodo";
   this.p1=new Player(name);
  }

  @Test
public void getCellTest(){
  assertSame(p1.getCell(),null);
  this.p1.setCell(c1);
  assertSame(p1.getCell(),c1);
}

@Test
public void setCellTest(){
  assertSame(p1.getCell(),null);
  this.p1.setCell(c1);
  assertSame(p1.getCell(),c1);
  this.p1.setCell(c2);
  assertSame(p1.getCell(),c2);
}

@Test
public void twoDiceThrowTest(){
  assertTrue(this.p1.twoDiceThrow()<=12 && this.p1.twoDiceThrow()>=0);
}








  // ---Pour permettre l'execution des tests ----------------------
  	public static junit.framework.Test suite() {
  		return new junit.framework.JUnit4TestAdapter(goosegame.PlayerTest.class);
  	}



}
