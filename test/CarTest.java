import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarTest {

    private static Car volvo;
    
    @BeforeAll
    static void setup() {
		volvo = new Car(3000, "Volvo", "V60", "gold")
				.wihtHorsepowers(115)
				.withMaxSpped(240)
				.fromZeroToSixty(7.9f);
    }
    
	@Test
	void testCarIntoString() {
		String result = volvo.toString();
		assertEquals("Car [horsepowers = 115, maxSpeed = 240, zeroToSixty = 7.9, price = 3000,"
				+ " brand = Volvo, model = V60, colour = gold, isRented = false]", result);
	}

 
    @AfterAll
    static void finish(){
       System.out.println("Tests are finished!");
    }
}
