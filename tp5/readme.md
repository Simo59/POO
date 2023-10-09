# tp5 POO    

## nom LAKROUT  HACHOUR.  
  
## prenom  HAKIM  MOHAMMED OURAMDANE.  

### objectif of tp5:  
this tp has for objectif to write our first tests and execute them also it has for objectif how to create an executable archive(.jar)for a classe in this tp class main to run it from the folder tp5. Also in this tp we used the packeges and learned how to define them and how we do to import packages and classes in our Project  


### presentation of tp5
in this tp we have to manupulate a robot which has many methodes and this robot take a box and put them on a convyer belt its like the working of a factory .This robot can take only a box and put it on a conveyer belt if this box isn t heavy than the convoyer belt and if its not full   
we have in the folder tp5 a folder src where we find the other folders and classes like the Folder factory who is representing the package Factory in this folder we find the code of our classes and the class main which we execute .we have also the folder test where we have the classes of tests .its where we wrote our tests to verify the code given in src espicially the methodes for classe Robot.we can generate other folders folders with many commands like the folder for documentation  

#### 1- Documentation:  
To generate the documentation we have to open a terminal in folder tp5 and use the command bellow:  
 command javadoc with a parameter which is the classe and the package that we want the documentation also it has many options the command is:  
 javadoc -sourcepath src -d docs -subpackages factory : with this command we generate the documentation for the package factory where we have all the classes to this tp  
 
#### 2-compilation:
To compilate the classes of the tp we open a terminal in folder tp5 and we use the command bellow:  
command javac with a parameter wich is the classe that we want to compile and two options with this command:  
javac -sourcepath src -d classes src/factory/*.java
this command will compile all the code in the package factory

#### 3-executing the tests:
To execute the tests we have first to compile the tests in the folder test with the mthod explained in tests adding to the parametre of sourcepath the folder test4poo.jar wich is the necessary folder to the tsets then to execute the testes we use the command java with this options:
* -jar : take for parametre the folder test4poo.jar and the  classe test we want to run after compiling it .  
for this tp we use this command:  
* javac -classpath test4poo.jar test/*.java :to compile all the classes of tests   
* java -jar test4poo.jar BoxTest (or RobotTest ) : to run the test after copiling them.

#### 4-executing the classes:
to execute this tp we execute the classe RobotMain .we open a terminal in folder tp 5 and enter the commands below:  
* javac -sourcepath src -d classes src/factory/RobotMain.java (to compile RobotMain)
* java -classpath classes factory.RobotMain (to execute the methode main in RobotMain)  
or we can create an executable archive to the classe RobotMain then execute it ,to do this we enter the command below in the terminal opened in folder tp5:
* jar cvfe factory.jar factory.RobotMain -C classes factory : this command must be after the compilation of all the classes in the package factory  
then we execute the new archive factory.jar with this command:  
* java -jar factory.jar  

to see what we have in this archive factory.jar we use :  
* jar tvf factory.jar  


we can also create an executable folder using the file manifeste given with this command :  
* jar cvfm factory.jar manifest-factory -C classes factory  
with this command we add the file manifeste to the new archive to create it from the file manifeste given

