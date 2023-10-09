package image;
import image.color.GrayColor;
public class Image implements ImageInterface{
  private Pixel [][] pixels;
  private int width;
  private int height;

/**
* create an image with width and height given in parametre
* @param height of the image
* @param width of the image
*/
  public Image(int width,int height){
    this.width=width;
    this.height=height;
    this.pixels = new Pixel[width][height];
    for (int x=0;x<width;x++){
      for(int y=0;y<height;y++){
        this.pixels[x][y]=new Pixel(GrayColor.WHITE);
      }
    }
  }
  /**
  * @see ImageInterface
  *  */
public int getWidth(){
  return this.width;
}

/**
* @see ImageInterface
 */
public int getHeight(){
  return this.height;
}

/**
* change the color of the pixel given in parametre with the color given
* @param x coordinate of the axes of x
* @param y cordinate of the axes of y
* @param color new color of the pixel
* @exception UnknownPixelException rise the UnknownPixelException if the pixel doesn't exist
*/
  public void changeColorPixel(int x, int y, GrayColor color) throws UnknownPixelException{
    this.getPixel(x,y).setColor(color);
  }


/**
* set the new color for the pixels for the Rectangle given in parametre
* @param x the coordinate x of the begin of the Rectangle
* @param y the coordinate y of the begin of the Rectangle
* @param  width of the Rectangle
* @param  height of the Rectangle
* @param color the new color we want set to the pixels in Rectangle
* @throws UnknownPixelException exception is raised when the pixel dosen t exist in the image
*/
  public void fillRectangle(int x, int y, int width, int height, GrayColor color) throws UnknownPixelException{
  for (int i =x;i<width+x;i++){
   for (int j=y;j<height+y;j++){
   this.changeColorPixel(i,j,color);
   }
  }
  }


/**
 * @see ImageInterface
*/
public Pixel getPixel(int x, int y) throws UnknownPixelException{
  try{
    return this.pixels[x][y];}
  catch (ArrayIndexOutOfBoundsException e){
    throw new UnknownPixelException();}

}
/**
 * create new image from the initial image by changing each graylevel of the pixel
 * with 255-its nbGrayLevel
 * @return the image with the new graylevels
*/

public Image negative(){
  Pixel px;
  Image image=new Image(this.width, this.height);
  for (int i=0; i<this.width; i++){
    for(int j=0; j<this.height; j++){
      px=this.getPixel(i,j);
      image.changeColorPixel(i,j,new GrayColor(255-px.getColor().getGrayLevel()));
    }
  }
  return image;
}

/**
* create new image from the initial image by extraction of outlines
* @param threshold to change the pixel
* @return the new edge image
*/
public Image edgeExtraction(int threshold){
  Image imageRes=new Image(this.getWidth(),this.getHeight());
  for (int i=0;i<(this.getWidth()-1);i++){
    for (int j=0;j<(this.getHeight()-1);j++){
      Pixel p=this.getPixel(i,j);
      Pixel p1=this.getPixel(i+1,j);
      Pixel p2=this.getPixel(i,j+1);
      int diff1 =p.colorLevelDifference(p1);
      int diff2 =p.colorLevelDifference(p2);

      if(diff1>threshold||diff2>threshold){
        imageRes.changeColorPixel(i,j,GrayColor.BLACK);
      }
    }
  }
   return imageRes;
}


/**
* create new image from initial image by decrase the gray level
* @param nbGrayLevels the number of graylevels in the new image
* @return the new image
*/
public Image decreaseNbGrayLevels(int nbGrayLevels){

  Image imageRes= new Image(this.getWidth(),this.getHeight());
  int t = 256/nbGrayLevels;
  for (int i=0;i<(this.getWidth());i++){
    for (int j=0;j<(this.getHeight());j++){
      GrayColor c= new GrayColor((this.getPixel(i,j).getColor().getGrayLevel()/t)*t);
      imageRes.changeColorPixel(i,j,c);
    }}
    return imageRes;
}














}
