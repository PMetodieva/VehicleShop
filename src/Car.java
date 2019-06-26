public class Car extends Vehicle {
	private int horsepowers;
	private int maxSpeed;
	private float zeroToSixty;

	public Car(int price, String brand, String model, String colour) {
		super(price, brand, model, colour);
	}

	public Car wihtHorsepowers(int horsepowers) {
		this.horsepowers = horsepowers;
		return this;
	}

	public Car withMaxSpped(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		return this;
	}

	public Car fromZeroToSixty(float zeroToSixty) {
		this.zeroToSixty = zeroToSixty;
		return this;
	}

	@Override
	public String toString() {
		return "Car [horsepowers = " + horsepowers + ", maxSpeed = " + maxSpeed + ", zeroToSixty = " + zeroToSixty
				+ ", price = " + price + ", brand = " + brand + ", model = " + model + ", colour = " + colour + ", isRented = "
				+ isRented + "]";
	}
	
}
