import org.junit.*;
import static org.junit.Assert.*;

import factory.Robot;   
import factory.util.*;   

public class RobotTest {	


    @Test
    public void robotCarryNoBoxWhenCreated() {
	Robot robbie = new Robot();
	assertFalse(robbie.carryingBox());
    }
    @Test
    public void robotCanTakeBoxIfNotCarrying(){
   	Robot ruby = new Robot();
	Box boite1= new Box(10);
	
	assertFalse(ruby.carryingBox());
	ruby.take(boite1);
	assertTrue(ruby.carryingBox());
	assertSame(boite1,ruby.getCarriedBox());	
    }
    @Test
    public void robotCannotTakeBoxIfAlreadyCarrying(){
       Robot ruby =new Robot();
       Box boite1 = new Box(10);
       ruby.take(boite1);
       assertSame(boite1,ruby.getCarriedBox());
       Box boite2 = new Box(2);
       ruby.take(boite2);
       assertSame(ruby.getCarriedBox(),boite1);
    
    
    }
    @Test
    public void robotCanTakeBoxAndPutOnBox(){
    Robot ruby = new Robot();
    Box boite1 = new Box(20);
    ConveyerBelt tapis = new ConveyerBelt(50);
    ruby.take(boite1);
    assertTrue(ruby.carryingBox());
    assertTrue(ruby.putOn(tapis));
    ruby.putOn(tapis);
    assertFalse(ruby.carryingBox());
    }
    
    @Test
    public void robotDontTakeBox(){
    Robot ruby = new Robot();
    ConveyerBelt tapis = new ConveyerBelt(50);
    assertFalse(ruby.carryingBox());
    assertFalse(tapis.isFull());
    assertFalse(ruby.putOn(tapis));
    ruby.putOn(tapis);
    assertFalse(ruby.carryingBox());
    }
    
    @Test
    public void robotTakeHeavyBox(){
    Robot ruby = new Robot();
    Box boite1 = new Box(60);
    ConveyerBelt tapis = new ConveyerBelt(50);
    ruby.take(boite1);
    assertTrue(ruby.carryingBox());
    assertFalse(tapis.isFull());
    assertFalse(ruby.putOn(tapis));
    ruby.putOn(tapis);
    assertSame(ruby.getCarriedBox(),boite1);
    }
    
    @Test
    public void robotTakeBoxAndConveyerBeltIsFull(){
    Robot ruby= new Robot();
    ConveyerBelt tapis = new ConveyerBelt(30);
    Box boite1 = new Box(10);
    Box boite2 = new Box(10);
    ruby.take(boite1);
    ruby.putOn(tapis);
    ruby.take(boite2);
    ruby.putOn(tapis);
    assertTrue(tapis.isFull());
    Box boite3 = new Box(20);
    assertTrue(tapis.accept(boite3));
    ruby.take(boite3);
    assertTrue(ruby.carryingBox());
    assertEquals(ruby.getCarriedBox(),boite3);
    assertFalse(ruby.putOn(tapis));
    ruby.putOn(tapis);
    assertTrue(ruby.carryingBox());
    assertEquals(ruby.getCarriedBox(),boite3);
    }




    
    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }

}
