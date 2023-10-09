package rental;

public class Car extends Vehicle {
  private int nbPlace;

  /**
	 * creates a vehicle with given informations
	 *
	 * @param brand
	 *            the vehicle's brand
	 * @param model
	 *            the vehicle's model
	 * @param productionYear
	 *            the vehicle's production year
	 * @param dailyRentalPrice
	 *            the daily rental price
   * @param places
   *             the number of places of the car
	 */
  public Car(String brand, String model, int productionYear, float dailyRentalPrice, int places){
    super(brand ,model,productionYear,dailyRentalPrice);
    this.nbPlace=places;
  }

  /**
  * get the car's number of places
  * @return the number of places
  */
  public int getNbPlace(){
    return this.nbPlace;
  }

  public String toString(){
    String res=super.toString()+" "+this.nbPlace;
    return res;

  }

  /**
   * this vehicle is equals to another if they have same brand, model,
   * production year, daily rental price and same number of places
   *
   * @see java.lang.Object#equals(java.lang.Object)
   */

  public boolean equals(Object o){
    if (o instanceof Car) {
      Car theOther = ((Car) o);
    return super.equals(o) && this.nbPlace==theOther.nbPlace;
  }
return false;

}}
