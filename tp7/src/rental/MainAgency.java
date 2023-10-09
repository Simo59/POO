package rental;
import java.util.*;

public class MainAgency{
  public static void main(String[]args){
RentalAgency agence = new RentalAgency();
Vehicle voiture1 = new Vehicle("tesla","modelx",2019,40);
Vehicle voiture2 = new Vehicle("ford","fiesta",2012,20);
Vehicle voiture3 = new Vehicle("bmw","x1",2010,90);

Client client1 = new Client("massi",30);
Client client2 = new Client("said",22);


VehicleFilter f1 = new MaxPriceFilter(40);
VehicleFilter f2 = new BrandFilter("tesla");
AndFilter f3 = new AndFilter();


f3.addFilter(f1);
f3.addFilter(f2);

agence.addVehicle(voiture1);
agence.addVehicle(voiture2);
agence.addVehicle(voiture3);



System.out.println("les voitures de l'agence:");
List<Vehicle> listevoiture = agence.getAllVehicles();
for (Vehicle v : listevoiture){
  System.out.println(v);
}

try {
  System.out.println("les voitures de l'agence apres supression d une :");
  agence.removeVehicle(voiture1);
  List<Vehicle> listevoiture1 = agence.getAllVehicles();
  for (Vehicle v : listevoiture1){
    System.out.println(v);
  }
}
catch (UnknownVehicleException e) {
  System.out.println("vehicule inexistant");
}
System.out.println("on a ajouté la voiture supprimé");
agence.addVehicle(voiture1);
System.out.println("on filtre avec le filtre 1 ");
agence.displaySelection(f1);

System.out.println("on filtre avec le filtre 2 ");
agence.displaySelection(f2);

System.out.println("on filtre avec le filtre 3 ");
agence.displaySelection(f3);

try{
  System.out.println("on loue la voiture 1 avec " + agence.rentVehicle(client1,voiture1));
}
catch (UnknownVehicleException e) {
  System.out.println("la voiture n'existe pas");
}
catch (IllegalStateException e) {
  System.out.println("on peut pas loeur la voiture ");
}



System.out.println("les voitures louée sont : ");
Collection<Vehicle> listevoiture2 = agence.allRentedVehicles();
for (Vehicle v : listevoiture2){
  System.out.println(v);
}

System.out.println("est ce que la voiture 1 est louée: "+agence.isRented(voiture1));
System.out.println("est ce que le client 1 a  louée: "+agence.hasRentedAVehicle(client1));


System.out.println("on retourne la voiture louée");
agence.returnVehicle(client1);
Collection<Vehicle> listevoiture3 = agence.allRentedVehicles();
if(listevoiture3.size()==0){
  System.out.println("aucune voiture est louée");
}
else{
  for (Vehicle v : listevoiture2){
    System.out.println(v);
  }
}
System.out.println("est ce que la voiture 1 est louée: "+agence.isRented(voiture1));
System.out.println("est ce que le client 1 a  louée:  "+agence.hasRentedAVehicle(client1));

Vehicle car1 = new Car("dodge","challenger",2017,80,2);
Vehicle car2 = new Car("dodge","charger",2017,70,4);
Vehicle moto1 = new MotorBike("kawazaki","f11",2012,30,15);
agence.addVehicle(moto1);
agence.addVehicle(car1);
agence.addVehicle(car2);
VehicleFilter pricefilter=new MaxPriceFilter(90);
System.out.println("on filtre avec un max price filtre apres l' ajout de car et motorbike");
agence.displaySelection(pricefilter);

System.out.println("creation de suspicious agency");
RentalAgency agenceAvecSurcout = new SuspiciousRentalAgency();
agenceAvecSurcout.addVehicle(voiture1);
agenceAvecSurcout.addVehicle(car1);
agenceAvecSurcout.addVehicle(moto1);
try{
System.out.println("on loue la voiture 1 au client qui a 22 ans avec " +agenceAvecSurcout.rentVehicle(client2,voiture1));
agenceAvecSurcout.returnVehicle(client2);

System.out.println("on loue la voiture 1 au client qui a 30 ans avec "+ agenceAvecSurcout.rentVehicle(client1,voiture1));
}
catch (UnknownVehicleException e) {
  System.out.println("la voiture n'existe pas");
}
catch (IllegalStateException e) {
  System.out.println("on peut pas loeur la voiture ");
}





}}
