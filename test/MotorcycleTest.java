import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MotorcycleTest {

    private static Motorcycle kawazaki;
    
    @BeforeAll
    static void setup() {
    	kawazaki = new Motorcycle(2000, "Kawazaki", "Ninja", "yellow")
				.withCubics(400)
				.withVolumeOfTank(40);
    }
    
	@Test
	void testMotorcycleIntoString() {
		String result = kawazaki.toString();
		assertEquals("Motorcycle [cubics = 400, volumeOfTank = 40, price = 2000, brand = Kawazaki,"
				+ " model = Ninja, colour = yellow, isRented = false]", result);
	}

 
    @AfterAll
    static void finish(){
       System.out.println("Tests are finished!");
    }
}
