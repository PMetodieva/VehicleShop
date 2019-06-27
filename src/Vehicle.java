public abstract class Vehicle {
	protected int price;
	protected String brand;
	protected String model;
	protected String colour;
	protected boolean isRented;
	
	
	public Vehicle(int price, String brand, String model, String colour) {
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.isRented = false;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Vehicle [price = " + price + ", brand = " + brand + ", model = " + model + ", colour = " + colour
				+ ", isRented = " + isRented + "]";
	}




	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	
}
