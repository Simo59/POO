package rental;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class RentalAgencyTest {
	private RentalAgency agence;
	private Client c1;
	private Client c2;
	private Vehicle v1;
	private Vehicle v2;


	@Before

	public void before(){
		this.agence = new RentalAgency();
		this.c1= new Client("client1", 24);
		this.c2= new Client("client2",30);
		this.v1= new Vehicle("brand1","model1",2011,130);
		this.v2= new Vehicle("brand2","model2",2008,100);
	}




	@Test
	public void twoClientObjectsWithSameNameCorrespondsToSameClient()
					throws IllegalStateException, UnknownVehicleException {
		RentalAgency agency = new RentalAgency();
		Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
		agency.addVehicle(v);
		Client client1 = new Client("Tim Oleon", 25);
		assertEquals(100.0, agency.rentVehicle(client1, v),0.0001);
		assertTrue(agency.hasRentedAVehicle(client1));
		// client2 corresponds to same client than client1 since names are equals
		Client client2 = new Client("Tim Oleon", 25);
		// then test should succeed
		assertTrue(agency.hasRentedAVehicle(client2));
	}

	@Test
	public void addVehicleAjouteLaVoitureLorsqueLaVoitureNestpasDansLagence(){
		assertFalse(this.agence.getAllVehicles().contains(v1));
		assertFalse(this.agence.getAllVehicles().contains(v2));
		this.agence.addVehicle(v1);
		this.agence.addVehicle(v2);
		assertTrue(this.agence.getAllVehicles().contains(v1));
		assertTrue(this.agence.getAllVehicles().contains(v2));
	}

	@Test (expected = UnknownVehicleException.class)
	public void removeVehicleLeveExeption() throws UnknownVehicleException{
		assertFalse(this.agence.getAllVehicles().contains(v1));
		this.agence.removeVehicle(v1);
	}

	@Test
	public void removeVehicleTest() throws UnknownVehicleException{
		assertFalse(this.agence.getAllVehicles().contains(v1));
		this.agence.addVehicle(v1);
		assertTrue(this.agence.getAllVehicles().contains(v1));
		this.agence.removeVehicle(v1);
		assertFalse(this.agence.getAllVehicles().contains(v1));
	}

	@Test
	public void getAllVehiclesTest(){
		assertEquals(this.agence.getAllVehicles().size(),0);
		this.agence.addVehicle(v1);
		assertEquals(this.agence.getAllVehicles().size(),1);
		assertTrue(this.agence.getAllVehicles().contains(v1));
		this.agence.addVehicle(v2);
		assertEquals(this.agence.getAllVehicles().size(),2);
		assertTrue(this.agence.getAllVehicles().contains(v1));
		assertTrue(this.agence.getAllVehicles().contains(v2));
	}


	@Test
	public void hasRentedAVehicleTest()throws UnknownVehicleException,IllegalStateException{
		this.agence.addVehicle(v1);
		this.agence.addVehicle(v2);
		assertFalse(this.agence.hasRentedAVehicle(c1));
		this.agence.rentVehicle(c1,v1);
		assertTrue(this.agence.hasRentedAVehicle(c1));
	}

	@Test
	public void isRentedTest()throws UnknownVehicleException,IllegalStateException{
		this.agence.addVehicle(v1);
		this.agence.addVehicle(v2);
		assertFalse(this.agence.isRented(v1));
		this.agence.rentVehicle(c2,v1);
		assertTrue(this.agence.isRented(v1));
	}

	@Test(expected = UnknownVehicleException.class)
public void rentVehicleLeveUnknownVehicleExceptionLorsqueLavoitureNexistePas()throws UnknownVehicleException,IllegalStateException{

	assertFalse(agence.getAllVehicles().contains(v1));
	assertFalse(agence.hasRentedAVehicle(c1));
	agence.rentVehicle(c1,v1);

}

@Test (expected = IllegalStateException.class)
public void rentVehicLeleveIllegalStateExceptionLorsqueLeClientADejaLoueUneVoiture()throws UnknownVehicleException,IllegalStateException{
  agence.addVehicle(v1);
	agence.addVehicle(v2);
	agence.rentVehicle(c1,v1);
	assertTrue(agence.hasRentedAVehicle(c1));
	assertFalse(agence.isRented(v2));
	agence.rentVehicle(c1,v2);
}

@Test (expected = IllegalStateException.class)
public void rentVehicleLeveIllegalStateExceptionLorsqueLaVoitureEstDejaLouée()throws UnknownVehicleException,IllegalStateException{
	agence.addVehicle(v1);
	agence.rentVehicle(c1,v1);
	assertFalse(agence.hasRentedAVehicle(c2));
	assertTrue(agence.isRented(v1));
	agence.rentVehicle(c2,v1);
}

@Test
public void rentVehicleFonctionne()throws UnknownVehicleException,IllegalStateException{
agence.addVehicle(v1);
assertFalse(agence.isRented(v1));
assertFalse(agence.hasRentedAVehicle(c1));
assertTrue(agence.rentVehicle(c1,v1)==v1.getDailyPrice());
assertTrue(agence.isRented(v1));
assertTrue(agence.hasRentedAVehicle(c1));
}

@Test
public void returnVehicleTest()throws UnknownVehicleException,IllegalStateException{
	agence.addVehicle(v1);
	agence.rentVehicle(c1,v1);
	assertTrue(agence.isRented(v1));
	assertTrue(agence.hasRentedAVehicle(c1));
	assertTrue(agence.allRentedVehicles().contains(v1));
	agence.returnVehicle(c1);
	assertFalse(agence.allRentedVehicles().contains(v1));
	assertFalse(agence.hasRentedAVehicle(c1));
	assertFalse(agence.isRented(v1));
}

@Test
public void allRentedVehiclesTest() throws UnknownVehicleException,IllegalStateException{

 agence.addVehicle(v1);
 agence.addVehicle(v2);
 assertTrue(agence.allRentedVehicles().size()==0);
 agence.rentVehicle(c1,v1);
 assertTrue(agence.allRentedVehicles().contains(v1));
 assertTrue(agence.allRentedVehicles().size()==1);
 agence.returnVehicle(c1);
 assertFalse(agence.allRentedVehicles().contains(v1));
 assertTrue(agence.allRentedVehicles().size()==0);

}

@Test
public void selectFonctionneAvecUnBrandFilter(){
	BrandFilter f1= new BrandFilter("brand1");
	agence.addVehicle(v1);
	agence.addVehicle(v2);
	assertTrue(agence.select(f1).contains(v1));
	assertTrue(agence.select(f1).size()==1);


}

@Test
public void selectFonctionneAvecUnMaxPriceFilter(){
  MaxPriceFilter f2 = new 	MaxPriceFilter(150);
	agence.addVehicle(v1);
	agence.addVehicle(v2);
	assertTrue(agence.select(f2).contains(v1));
	assertTrue(agence.select(f2).contains(v1));
	assertTrue(agence.select(f2).size()==2);
}

@Test
public void selectFonctionneAvecUnAndFilter(){
	agence.addVehicle(v1);
	agence.addVehicle(v2);
  MaxPriceFilter f2 = new 	MaxPriceFilter(200);
  BrandFilter f1= new BrandFilter("brand1");
  AndFilter f3=new AndFilter();
	f3.addFilter(f1);
	f3.addFilter(f2);
	assertTrue(agence.select(f3).contains(v1));
	assertTrue(agence.select(f3).size()==1);

}



	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
	}



}
