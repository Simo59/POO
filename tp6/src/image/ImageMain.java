package image;

import image.util.*;
import image.color.*;

public class ImageMain {
  public static void main(String[] args) {
    if (args.length < 3 ) {
System.out.println("java -classpath classes ImageMainn <nom de l'image> <int> <int(doit etre le resultat d une puissance de 2)>");
System.exit(0); // arrˆete l’execution
}
else{

  Image im= new Image(200,150);
  im.fillRectangle(20, 30, 30, 50, GrayColor.BLACK);
  GrayColor co1 = new GrayColor(128);
  GrayColor co2 = new GrayColor(200);
  im.fillRectangle(50,100,40,40,co1);
  im.fillRectangle(90,20,70,50,co2);

  ImageDisplayer displayer = new ImageDisplayer();

  displayer.display(im,"Question 6" , 800,500 );


  Image imgInitial = ImageLoader.loadPGM(args[0]);
  Image imgNegative = imgInitial.negative();
  Image imgEdge= imgInitial.edgeExtraction(Integer.parseInt(args[1]));
  Image imgLevelGray= imgInitial.decreaseNbGrayLevels(Integer.parseInt(args[2]));
  displayer.display(imgInitial,"original dans le fichier" , 800,100 );
  displayer.display(imgNegative,"negative" , 450,100 );
  displayer.display(imgEdge,"edge",100,100);
  displayer.display(imgLevelGray,"ngraylevel",300,400);

}
}
}
