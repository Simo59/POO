# tp8(goosegame)  POO   

## nom LAKROUT  HACHOUR.  

## prenom  HAKIM  MOHAMMED OURAMDANE.  

### objectif of tp8:
The objectif of this tp is to develope a version of goosegam with the classical board given .  
This board is made of dfferent type of  Cells(goose -trap-waiting...).  
To do this tp we started by creating the different types of the cells by using an interface Cells than we made the class board which is the class representing the board on which we play ,than we created ClassicalBoard which is the board given in the subject (63 cells and the specified types of the cells)  
After that we made the class game in which we play the game .First we create Players than we add them to the game we had made than with the method play defined in the class Game we can play one game with the players added before.  
To code this class game we started with the algorithm that we did in the td of the past weaks than we have found the methodes to play the game like :  
- reached():this methode find the cell reached by the player at each dice Throw  
Than we coded the displayer that display the result ofeach round and the state of the players at each round.  
For the turns of the players we used an iterrator to change the player at each round .  
the rules of this game and the system of playing is avalaible on this link:  
[goosegame](https://www.fil.univ-lille1.fr/%7Eroutier/enseignement/licence/poo/tdtp/jeu_de_loie.pdf)  

At the end of our tp we had made tests for different classes of this tp.  
### REMARQUES:
A la fin de ce tp on a le jeu qui marche ,mais a l'affichage a chaque appel de system.out.println on a un retour a la ligne donc la trace est un plus grande que le resultat souhaité. 
### Commands :
#### documentation :  
```bash
javadoc -sourcepath src -d docs -subpackages goosegame
```

#### test:
* compilation:  
```bash
javac -classpath test4poo.jar test/goosegame/*.java
```
* execution
```bash
 java -jar test4poo.jar goosegame.<the name of the class of tests to execute>
```
#### compilation and execution of the main program:  
* compilation:
```bash
javac -sourcepath src -d classes src/goosegame/*.java
```

* execution:  
there is two ways of execution:  
* first:  
```bash
jar cvfe GooseMain.jar goosegame.GooseMain -C classes goosegame
java -jar GooseMain.jar <name of the players>
```

* second:  
```bash
java -classpath classes goosegame.GooseMain <name of the Players>
```
