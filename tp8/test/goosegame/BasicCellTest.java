package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;



public class BasicCellTest{
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
public void getIndexTest(){
  assertTrue(c1.getIndex()==ind1);
}

@Test
public void handleOnComingTest(){
  assertTrue(c1.getPlayer()==null);
  c1.handleOnComing(p1);
  assertSame(c1.getPlayer(),p1);
}


@Test
public void getPlayerTest(){
  assertSame(c1.getPlayer(),null);
  c1.handleOnComing(p1);
  assertSame(c1.getPlayer(),p1);
}

@Test
public void bounceTest(){
  assertSame(c1.bounce(6),0);

}














// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(goosegame.BasicCellTest.class);
	}}
