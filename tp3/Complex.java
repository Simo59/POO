public class Complex{

  private double real;// the attribut of the real part
  private double imaginary;//the attribut of the imaginery part

/** the constructor of the class Complex to create a new complex nember
    @param the real part of the complex nember
    @param the imaginary part of the complex number */
  public Complex(double re,double im){
      this.real = re;
      this.imaginary = im;
    }

/** this predicate verify if the number is a real number
 @return true if its a real nuber ,false if its a complex number*/
  public boolean isReal(){
    return this.imaginary == 0;
  }
/**give the real part of the number
@return the real part of the number*/
public double realPart(){
  return this.real;
}

/**give the imaginary part of the number
@return the imaginey part of the number*/
public double imaginaryPart(){
  return this.imaginary;
}

/**calculate the module of the number
@return the module of the complex number */
public double module(){
  return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imaginary,2));
}

/** fid the conjugate number of the number who called the method without modifying it
@return the conjugate number */
public Complex conjugue(){
    Complex res = new Complex(this.real,(-1*this.imaginary));
    return res;
}

/**this method make the addition of two complex number
 @param the number to add
 @return the result of the addition */
public  Complex add(Complex c){
    double resRe = this.real+c.realPart();
    double resIm= this.imaginary+c.imaginaryPart();
    Complex resF=new Complex(resRe,resIm);
    return resF;
}

/**this methode make the multiplication of two complex number
 @param the number to multiply
 @return the result of the multiplication */
public Complex multiplicate(Complex c){
	double resRe = this.real*c.realPart()-this.imaginary*c.imaginaryPart();
	double resIm = this.real*c.imaginaryPart()+this.imaginary*c.realPart();
        Complex resF=new Complex(resRe,resIm);
        return resF;
}
/**this method verify if two Comlex objects are equals
@param the object whose legality we want to verify   */
public boolean equals(Object o){
    if ( !(o instanceof Complex))
      return false;
    else{
      Complex  other=(Complex)o;
      return (this.real == other.realPart() && this.imaginary == other.imaginaryPart()) ;

}}

/**this method describe the comlex number
@return a String that describe the differnet part of the number*/

public String toString(){
	return ("this number imaginary part is " + this.imaginary +" and it's real part is "+ this.real ) ;
}

public static void main(String[] args) {
  if (args.length < 1 ) {
System.out.println("usage : java Complex <unDouble>");
System.exit(0); // arrˆete l’execution
}
else{
  Complex comp1= new Complex(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
  Complex comp2= new Complex(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
  Complex conj1= comp1.conjugue();
  Complex conj2= comp2.conjugue();
  Complex s = comp1.add(comp2);
  Complex c = comp1.multiplicate(comp2);

  boolean eg= s.equals(c);

  System.out.println(conj1);
  System.out.println(conj2);
  System.out.println("the real part of the result of the addition is "+s.realPart() +" and the imaginary is "+s.imaginaryPart());
  System.out.println("the real part of the result of multiplication is  " +c.realPart() + " and its imaginary part is "+ c.imaginaryPart());
  System.out.println("are they equals.? "+eg);
}
}

}
