package image;
import image.color.GrayColor;

public class Pixel{
  private GrayColor color;

/**
 * create a pixel with a color given on parametre
 * @param c the color of the pixel
*/
  public Pixel(GrayColor c){
    this.color = c;
  }

/**
 * set the new color of the pixel
 * @param c the color of the pixel
*/
   public void setColor(GrayColor c){
     this.color = c;
   }

/**
 * get the colotr of the pixel
 * @return the color of the pixel
*/
   public GrayColor getColor(){
     return this.color;
   }

/**
* calculate the differnce between two level color
* @param p the pixel we want calculate its difference
* @return the difference of the gray level between the two levels
*/
   public int colorLevelDifference(Pixel p){
     return Math.abs(this.color.getGrayLevel()-p.color.getGrayLevel());
   }

/**
* two pic=xels are equals if they have the same colorLevelDifference
* @param o the object we want to compare
* @return true if they are equals, false else
*/
   public boolean equals(Object o){
     if (o instanceof Pixel){
       Pixel other = (Pixel) o;
       return this.color.equals(other.color);
     }
     return false;
   }

}
