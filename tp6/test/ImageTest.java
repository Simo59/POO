import static org.junit.Assert.*;

import org.junit.Test;
import image.*;
import image.color.*;


public class ImageTest{

  @Test
  public void getWidthTest(){
    Image im= new Image(2,3);
    assertSame(im.getWidth(), 2);
  }

  @Test
  public void getHeightTest(){
    Image im= new Image(2,3);
    assertSame(im.getHeight(), 3);
  }
 @Test (expected = UnknownPixelException.class)
 public void changeColorPixelLeveUneExeption() throws UnknownPixelException {
   Image im = new Image(10,12);
   assertSame(im.getWidth(),10);
   assertSame(im.getHeight(),12);
   GrayColor color = new GrayColor(24);
   im.changeColorPixel(11,14,color);
}

@Test
public void changeColorPixelChangeLaColeurQuandLesCoordoneesSontValides() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  GrayColor color = new GrayColor(24);
  int x=1 ,y=2;
  assertSame(im.getPixel(x,y).getColor(),GrayColor.WHITE);
  im.changeColorPixel(x,y,color);
  assertSame(im.getPixel(x,y).getColor(),color);
}

@Test (expected = UnknownPixelException.class)
public void getPixelLeveLexceptionLorsqueXNestPasValide() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  im.getPixel(11,10);

}

@Test (expected = UnknownPixelException.class)
public void getPixelLeveLexceptionLorsqueYNestPasValide() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  im.getPixel(10,13);

}

@Test (expected = UnknownPixelException.class)
public void getPixelLeveLexceptionLorsqueXEstNegative() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  im.getPixel(-1,11);

}

public void getPixelLeveLexceptionLorsqueYEstNegative() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  im.getPixel(9,-2);

}

@Test
public void getPixelMarcheAvecDesCoordoneesValid() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  Pixel p = im.getPixel(0,0);
  assertSame(p,im.getPixel(0,0));
}


@Test(expected = UnknownPixelException.class)
public void fillRectangleLeveLexeption() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  GrayColor color = new GrayColor(24);
  im.fillRectangle(1,3,11,13,color);

}

@Test
public void fillRectangleMarcheAvecDesCoodonneesValide() throws UnknownPixelException{
  Image im = new Image(10,12);
  assertSame(im.getWidth(),10);
  assertSame(im.getHeight(),12);
  GrayColor color = new GrayColor(24);
  int x =2,y=3,wid=8,hei=7;
  // verfication que tous les pixel sont blanc
  for(int i = 0;i<im.getWidth();i++){
    for (int j= 0 ;j<im.getHeight();j++){
      assertSame(im.getPixel(i,j).getColor(),GrayColor.WHITE);
    }
  }
  im.fillRectangle(x,y,wid,hei,color);
  // verifecation que le rectance a ete construit
  for (int i =x ;i<wid+x;i++){
    for (int j=y;j<hei+y;j++){
      assertSame(im.getPixel(i,j).getColor(),color);
    }
  }

// verifaction que les pixel qui n'appartient pas au rectangle n'ont pas changé
  for (int i =0 ;i<x;i++){
    for (int j =0;j<y;j++){
      assertSame(im.getPixel(i,j).getColor(),GrayColor.WHITE);
    }
  }
  for (int i =wid+x ;i<im.getWidth();i++){
    for (int j =hei+y;j<im.getHeight();j++){
      assertSame(im.getPixel(i,j).getColor(),GrayColor.WHITE);
    }
  }}


  @Test
    public void negativtest() {
      Image im = new Image(10,12);
      assertSame(im.getWidth(),10);
      assertSame(im.getHeight(),12);
      for(int i =0 ;i<im.getWidth();i++){
        for (int j=0;j<im.getHeight();j++){
           assertSame(im.getPixel(i,j).getColor(),GrayColor.WHITE);
        }
      }
      Image imRes = im.negative();
      for(int i =0 ;i<im.getWidth();i++){
        for (int j=0;j<im.getHeight();j++){
          assertSame(imRes.getPixel(i,j).getColor().getGrayLevel(),255-im.getPixel(i,j).getColor().getGrayLevel());
            }
           }


    }









  // ---Pour permettre l'exécution des test----------------------
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(ImageTest.class);
  }




}
