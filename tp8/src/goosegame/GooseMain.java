package goosegame;
import java.util.*;


public class GooseMain{

  public static void main(String[]args){

    Board b = new ClassicalBoard();
    Game partie = new Game(b);
    for(int i=0;i<args.length;i++){
      partie.addPlayer(new Player(args[i]));
    }
    partie.play();

  }
}
