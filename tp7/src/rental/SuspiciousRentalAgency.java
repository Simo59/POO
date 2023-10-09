package rental;

import java.util.*;

public class SuspiciousRentalAgency extends RentalAgency{

  public SuspiciousRentalAgency(){
    super();
  }
  /** client rents a vehicle
   * @param client the renter
   * @param v the rented vehicle
   * @return the daily rental price for client for vehicle v
   * @exception UnknownVehicleException   if v is not a vehicle of this agency
   * @exception IllegalStateException if v is already rented or client rents already another vehicle
   */
  public float rentVehicle(Client c,Vehicle v)throws UnknownVehicleException,IllegalStateException{
    if (c.getAge()<=25){
      float p=v.getDailyPrice()/10;
    return  (super.rentVehicle(c,v)+p);
    }
    else{
      return super.rentVehicle(c,v);
    }
  }





}
