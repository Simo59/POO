public class Rectangle{
  private double width;
  private double height;
/**the constructor of the class Rectangle
@param the width of the rectangle
@param the height of the rectangle
*/
  public Rectangle (double w,double h){
    this.width=w;
    this.height=h;
  }

  /**get the width of the rectangle
  @return the width of the rectangle */
  public double getWidth(){
    return this.width;
  }

/** get the height of the rectangle
@return the height of the rectangle*/
  public double getHeight(){
    return this.height;
  }

/** calculate the area of the rectangle
@return the area of the rectangle*/
  public double area(){
    return this.width * this.height;
  }

/** calculate the perimiter of the rectangle
@return the perimeter of the rectangle*/
  public double perimiter(){
    return (this.width + this.height)*2;
  }

/** verify if the rectangle is a square
@return true if the rectangle is a square else its fals*/
  public boolean isSquare(){
    return this.width==this.height;
  }

/**verify of two rectangles are equals
 return true if the two rectangles are equals else false*/
  public boolean equals(Object o){
    if ( !(o instanceof Rectangle))
      return false;
    else{
      Rectangle  other=(Rectangle)o;
      return (this.width == other.width && this.height == other.height) ;
    }
  }
/**the methode toString descripe the square
@return a String  desribing the rectangle */
  public String toString(){
    return "the height of the rectangle is " + this.height + " and its width is " + this.width;
  }

  public static void main(String[] args) {
    if (args.length < 1) {
   System.out.println("usage : java Rectangle <unDouble>");
   System.exit(0); // arrˆete l’execution
  }
   else{
    Rectangle  rec1 = new Rectangle(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    Rectangle rec2 = new Rectangle(Integer.parseInt(args[2]),Integer.parseInt(args[3]));

    System.out.println(rec1);
    System.out.println(rec2);
    double r = rec1.area();
    double p = rec2.perimiter();
    System.out.println("the perimiter of rec2 is" +p);
    System.out.println("the area of rec1 is " + r);
    if (rec1.isSquare() == true){
      System.out.println("rec1 is square");
    }
    if (rec2.isSquare() == true){
      System.out.println("rec2 is square");
    }
    if (rec1.equals(rec2)){
      System.out.println("les rectangle sont equivalent");
    }
    else
      System.out.println("les rectangle ne sont pas equivalent");

  }
  }





}
