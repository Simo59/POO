/**
 * An Hotel has a name and some rooms continuously numbered from 1
 *
 */
public class Hotel {

   private final String name;
   private final Status status;
   private Room[] rooms;

   /** build an Hotel with given name, status and number of rooms
    * @param name this hotel name
    * @param status this hotel status
    * @param numberOfRooms number of rooms of this hotel
    */
   public Hotel(String name, Status status, int numberOfRooms) {
      this.name = name;
      this.status = status;
      this.rooms  = new Room [numberOfRooms];
      for (int i=0;i<numberOfRooms;i++){
      this.rooms[i] = new Room(i+1);
      }
   }

    /** return this hotel name
    * @return this hotel name
    */
   public String getName() {
      return this.name;
   }
   /** this hotel status
    * @return this hotel status
    */
   public Status getStatus() {
      return this.status;
   }

   /**  return the number of rooms for this hotel
    * @return the number of rooms for this hotel
    */
   public int numberOfRooms() {
      return this.rooms.length;
   }

   /** provide the room corresponding to given number, first room has number 1,
    * number must not be greater than <code>this.numberOfRooms()</code>
    * @param number number of the room, from 1 to this.numberOfRooms()
    * @return the room with given number
    */
   public Room getRoom(int number) {

      return this.rooms[number-1];
   }

   /** provide the room corresponding to given number if this number is compatible and rent it if its free and return this room
    *else it return null
    *@param number number of the room to rent
    *@return the room rented or null
    */
   public Room rentRoom(int number) {
       if (number>0 && number<=this.rooms.length && this.rooms[number-1].isRent()==false){
       this.rooms[number-1].rent();
       return this.rooms[number-1];
       }
       return null;


   }

   /** free the selected room by number given in param
    * @param number of the room to free
    */
   public void leaveRoom(int number) {

       this.rooms[number-1].free();
   }


   /** calculate the number of free rooms and return it
    * @return the of number of free rooms
    */
   public int numberOfFreeRooms() {
       int res=0;
       for(int i=0;i<this.rooms.length;i++){
         if (this.rooms[i].isRent()==false){
         res=1+res;}
       }
       return res;
   }

   /** provide the number of the first free room
    * @return the number of the first free room
    */
   public int firstFreeNumber() {
       boolean trouve = false;
       int res=0;
       int i=0;
       while (i<this.rooms.length && trouve==false){
         if (this.rooms[i].isRent()==false){
          res=i+1;
          trouve=true;

         }
       i=i+1;}
       return res;

   }


}
