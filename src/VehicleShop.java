import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class VehicleShop {
	private String name;
	private Set<Vehicle> vehicles;
	
	private Set<Vehicle> sortBy(Comparator<Vehicle> comparator) {
		Set<Vehicle> result = new TreeSet<>(comparator);
		for (Vehicle vehicle : this.vehicles) {
			result.add(vehicle);
		}
		return result;
	}

	public VehicleShop(String name) {
		this.name = name;
		this.vehicles = new HashSet<Vehicle>();
	}

	public String getName() {
		return name;
	}
	
	
	public Set<Vehicle> getVehicles() {
		return Collections.unmodifiableSet(vehicles);
	}
	
	public void addVehicle(Vehicle vehicleToAdd) {
		this.vehicles.add(vehicleToAdd);
	}

	public Set<Vehicle> sortByPrice() {
		Set<Vehicle> result = sortBy(new Comparator<Vehicle>() {
			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				if (o1.price > o2.price) {
					return 1;
				} else {
					return -1;
				}
			}

		});
		return result;
	}
	
	public void rentAVehicle(Vehicle vehicleToRent) {
		if (!this.vehicles.contains(vehicleToRent)) {
			System.out.println("Sorry, this vehicle is not in our shop!");
		} else {
			for (Vehicle vehicle : this.vehicles) {
				if (vehicle.equals(vehicleToRent)) {
					if (vehicle.isRented==true) {
						System.out.println("Sorry this vehicle is already rented");
						return;
					}
					vehicle.setRented(true);
				}
			}
		}
	}
	
	public Set<Vehicle> sortByColour(){
		Set<Vehicle> result = sortBy(new Comparator<Vehicle>() {
			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				if (o1.colour.equals(o2.colour)) {
					return 1;
				}
				return o1.colour.compareTo(o2.colour);
			}

		});
		return result;
	}
	
	
	public void printAllVehicles() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle);
		}
	}
}
