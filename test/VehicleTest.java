import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class VehicleTest {

    private static Vehicle bmw;
    private static Vehicle volvo;
    private static Vehicle equalBmw;
    
    @BeforeAll
    static void setup() {
    	bmw = new Car(4000, "BMW", "E36", "black");
    	volvo = new Car(5000, "Volvo", "V60", "gold");
    	equalBmw = new Car(4000, "BMW", "E36", "black");
    }
    
	@Test
	void testVehicleIntoString() {
		String result = bmw.toString();
		assertEquals("Car [horsepowers = 0, maxSpeed = 0, zeroToSixty = 0.0, price = 4000,"
					+ " brand = BMW, model = E36, colour = black, isRented = false]", result);
	}

	@Test
	void testEqualVehicles() {
		assertEquals(bmw.equals(equalBmw), true);
		assertEquals(bmw.equals(volvo), false);
	}
	
	@Test
	void testSetRented() {
		bmw.setRented(true);
		assertEquals(bmw.isRented, true);
		
		assertEquals(volvo.isRented, false);
	}
 
    @AfterAll
    static void finish(){
       System.out.println("Tests are finished!");
    }
}
