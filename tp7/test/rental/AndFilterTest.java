package rental;

import static org.junit.Assert.*;

import org.junit.Test;
 public class AndFilterTest{


@Test
public void acceptTest(){
  VehicleFilter f1 = new MaxPriceFilter(125);
  VehicleFilter f2 = new BrandFilter("brand1");
  AndFilter f3 = new AndFilter();
  Vehicle v1 = new Vehicle("brand1", "model1", 2015, 100);
  Vehicle v2 = new Vehicle("brand2", "model2", 2000, 200);
  f3.addFilter(f1);
  f3.addFilter(f2);
  assertTrue(f3.accept(v1));
  assertFalse(f3.accept(v2));

}



   // ---Pour permettre l'execution des tests ----------------------
   public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(rental.BrandFilterTest.class);
   }

 }
