package rental;
public class MotorBike extends Vehicle{
  private int cylindre;

  /**
   * creates a MotorBike with given informations
   *
   * @param brand
   *            the motorbike's brand
   * @param model
   *            the motorbike's model
   * @param productionYear
   *            the motorbike's production year
   * @param dailyRentalPrice
   *            the daily rental price
   * @param cyl
   *         the cylindree of the motorbike
   */
  public MotorBike(String brand, String model, int productionYear, float dailyRentalPrice,int cyl){
    super( brand, model,  productionYear,  dailyRentalPrice);
    this.cylindre = cyl;
  }

  /**
	 * @return the cylendre of the MotorBike
	 */

  public int getCyldre(){
    return this.cylindre;
  }

  public String toString(){
    String res=super.toString()+" "+this.cylindre+" cm³";
    return res;
  }

  /**
	 * this motorbike is equals to another if they have same brand, model,
	 * production year , daily rental price and cylindre
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
  public boolean equals(Object o){
    if (o instanceof MotorBike) {
      MotorBike theOther = ((MotorBike) o);
    return super.equals(o) && this.cylindre==theOther.cylindre;
  }
  return false;


}}
