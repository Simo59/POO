package factory;
import factory.util.*;
public class RobotMain {

    public static void main(String[] args) {

	System.out.println("beginning of main from robot.Robot");	

	Robot robbie = new Robot();
	ConveyerBelt belt1 = new ConveyerBelt(50);
	ConveyerBelt belt2 = new ConveyerBelt(150);
	Box box10 = new Box(10);
	Box box15 = new Box(15);
	Box box100 = new Box(100);
	Box box60 = new Box(60);

	robbie.take(box10);
	robbie.putOn(belt1);
	robbie.take(box15);
	robbie.putOn(belt1);
	robbie.take(box100);
	robbie.putOn(belt2);

	belt1.display();

	System.out.println("end of main from robot.Robot");
    }

}
