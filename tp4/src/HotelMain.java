public class HotelMain{


public static void main(String [] args){
if (args.length < 1 ) {
System.out.println("java -classpath classes HotelMain <unEntier>");
System.exit(0); // arrˆete l’execution
}
else{
 Hotel hot1= new Hotel("California",Status.PREMIUM,100);
 System.out.println("the number of rooms is "+hot1.numberOfRooms());
 Room r=hot1.rentRoom(Integer.parseInt(args[0]));
 System.out.println(r);
 System.out.println("the number of free rooms is "+ hot1.numberOfFreeRooms());
 hot1.leaveRoom(Integer.parseInt(args[0]));
 System.out.println("the number of free rooms is "+ hot1.numberOfFreeRooms());


}
}

}
