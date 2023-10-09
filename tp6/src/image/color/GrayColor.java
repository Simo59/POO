package image.color;
public class GrayColor{
  public static final GrayColor WHITE =  new GrayColor(255);
  public static final GrayColor BLACK = new GrayColor(0);
  private int grayLevel;
  private double alpha;

  /**
  * create a color with a gray level given in parametre
  * @param level of gray of the GrayColor
  */
  public GrayColor(int level){
   this.grayLevel=level;
   this.alpha=1;
 }

/**
  * get the level of grey
  * @return the level of gray
*/
 public int getGrayLevel(){
   return this.grayLevel;
 }

/**
 * get the value of the alpha canal
 * @return the value of the lpha canal
 */
 public double getAlpha(){
   return this.alpha;
 }

/**
  * set the value of canal alpha with a number given in parametre
 * @param a the new value of alpha*/
 public void setAlpha(double a){
   this.alpha=a;
 }

/**
 * two GrayColors are equals if they have same grayLevel and same canal alpha
 * @param o the object we want to compare
 * @return true if they are equals, false else
*/
 public boolean equals(Object o){
   if (o instanceof GrayColor){
     GrayColor other = (GrayColor) o;
     return this.grayLevel==other.getGrayLevel() && this.alpha == other.getAlpha();
   }
   return false;
 }



}
