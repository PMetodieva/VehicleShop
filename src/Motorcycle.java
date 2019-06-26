public class Motorcycle extends Vehicle {
	private int cubics;
	private int volumeOfTank;

	public Motorcycle(int price, String brand, String model, String colour) {
		super(price, brand, model, colour);
	}

	public Motorcycle withCubics(int cubics) {
		this.cubics = cubics;
		return this;
	}

	public Motorcycle withVolumeOfTank(int liters) {
		this.volumeOfTank = liters;
		return this;
	}

	@Override
	public String toString() {
		return "Motorcycle [cubics=" + cubics + ", volumeOfTank=" + volumeOfTank + ", price=" + price + ", brand="
				+ brand + ", model=" + model + ", colour=" + colour + ", isRented=" + isRented + "]";
	}

}
