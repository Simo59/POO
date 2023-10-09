# tp4 POO    

## nom LAKROUT  HACHOUR.  
  
## prenom  HAKIM  MOHAMMED OURAMDANE.  

### objectif of tp4:  
this tp has for objectif: to use javadoc to create the documentation of a classe and we have used also java -jar to run tests in java classes .
we completed the classes given and we verified our code with the tests given at the end we had 0 errors in JUNIT.


### presentation of tp4:
In this tp we manipulate an hotel with classe Hotel after.This hotel has the a name,a status and rooms .we manipulate rooms with the classe Room given.  
With this classe hotel we can rent a room,get the numbers of rooms,get the name of te hotel ,get its status,get the number of the first frr room and we can get the number of free rooms .
we have in the folder tp4 ,the folder src where we find the classes that we coded and the folder test where we have the wlasses of tests to our tp.  
We created a new classe HotelMain where we have the main methodes to this tp that we can run wuth the terminal with the commands that we have wrote below and when we run this methode main it take a parametre which is the number of the room that we want to rent and then  free  in the hotel named California. 


#### 1- Documentation:  
To generate the documentation we have to open a terminal in folder tp4 and use the command bellow:  
 command javadoc with a parameter wich is the classe that we want the documentation and we have two options with this command :  
 * -sourcepath :this option procurate the sources for the different classes .this command has for parametre the folder where e find the necessary sources
 * -d :this option  has a name the folder where the documentation generated must be saved  
  Example: javadoc src/Hotel.java -sourcepath src -d docs  
  
#### 2-compilation:
To compilate the classes of the tp we open a terminal in folder tp4 and we use the command bellow:  
command javac with a parameter wich is the classe that we want to compile and two options with this command:  
 * -sourcepath :this option procurate the sources for the different classes .this command has for parametre the folder where we find the necessary sources
 * -d :this option  has the  name of the folder where the files .class  generated must be saved  
 Exemple: javac src/Room.java -sourcepath src -d classes  
 

#### 3-executing the tests:
To execute the tests we have first to compile the tests in the folder test with the mthod explained in tests adding to the parametre of sourcepath the folder test4poo.jar wich is the necessary folder to the tsets then to execute thes testes we use te command java with this options:
* -jar : take for parametre the folder test4poo.jar and the  calsse test we want to run after compiling it .  
Exemple:java -jar test4poo.jar RoomTest  

#### 4-executing the classes :
To execute the classes we exuceute the methode HotelMain in which we have the methode main after copiling all the classes we need in src  Room , Status , Hotel and HotelMain. To execute HoteMain we have to open a terminal in tp 4 and we use the command:    
java -classpath classes HotelMain param

