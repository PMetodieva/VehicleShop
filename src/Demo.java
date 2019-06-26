public class Demo {
	public static void main(String[] args) {
		Vehicle bmw = new Car(3000, "BMW", "E36", "black")
				.wihtHorsepowers(115)
				.withMaxSpped(240)
				.fromZeroToSixty(7.9f);
		Vehicle kawazaki = new Motorcycle(2000, "Kawazaki", "Ninja", "yellow")
				.withCubics(400)
				.withVolumeOfTank(40);
		Vehicle honda = new Car(3000, "Honda", "Accord", "black");
		
		System.out.println(bmw);
		
	}
}
