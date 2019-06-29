import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class VehicleShopTest {
	
    private static VehicleShop myShop;
    private static Vehicle bmw = new Car(4000, "BMW", "E36", "black")
			.wihtHorsepowers(115)
			.withMaxSpped(240)
			.fromZeroToSixty(7.9f);
    private static Vehicle volvo = new Car(5000, "Volvo", "E36", "gold")
			.wihtHorsepowers(140)
			.withMaxSpped(260)
			.fromZeroToSixty(7.9f);
    private static Vehicle kawazaki = new Motorcycle(2000, "Kawazaki", "Ninja", "yellow")
			.withCubics(400)
			.withVolumeOfTank(40);
    
    @BeforeAll
    static void setup() {
    	myShop = new VehicleShop("My Vehicle Shop");
    }
    
	@Test
	void testGetName() {
		String result = myShop.getName();
		assertEquals("My Vehicle Shop", result);
	}
	
	@Test
	void testGetVehicles() {
		Set<Vehicle> v = new HashSet<Vehicle>();
		v.add(volvo);
		myShop.addVehicle(volvo);
		Set<Vehicle> result = myShop.getVehicles();
		assertEquals(v, result);
	}
 
	@Test
	void testAddVehicle() {
		myShop.addVehicle(volvo);
		Set<Vehicle> vehicles = myShop.getVehicles();
		assertEquals(vehicles.contains(volvo), true);
	}
	
	@Test
	void testRentAVehicle() {
		myShop.rentAVehicle(volvo);
		assertEquals(volvo.isRented, true);
	}
	
	@Test
	void testSortByPrice() {
		myShop.addVehicle(bmw);
		myShop.addVehicle(volvo);
		myShop.addVehicle(kawazaki);
		Set<Vehicle> result = myShop.sortByPrice();
		
		Set<Vehicle> v = new HashSet<Vehicle>();
		v.add(kawazaki);
		v.add(bmw);
		v.add(volvo);
		
		assertEquals(v, result);
	}
	
	@Test
	void testSortByColour() {
		myShop.addVehicle(volvo);
		myShop.addVehicle(kawazaki);
		myShop.addVehicle(bmw);
		Set<Vehicle> result = myShop.sortByColour();
		
		Set<Vehicle> v = new HashSet<Vehicle>();
		v.add(bmw);
		v.add(volvo);
		v.add(kawazaki);
		
		assertEquals(v, result);
	}
	
 
    @AfterAll
    static void finish() {
       System.out.println("Tests are finished!");
    }

}
