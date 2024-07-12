package streamsAPI;

public class Mobiles implements Comparable<Mobiles> {

	public Brand brand;
	public String model;
	public int memory;
	public int price;
	public int megapixel;
	public double displaySize;
	public String color;

	public Mobiles(Brand brand, String model, int memory, int price, int megapixel, double displaySize, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.megapixel = megapixel;
		this.displaySize = displaySize;
		this.color = color;
	}

	public Brand getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getMemory() {
		return memory;
	}

	public int getPrice() {
		return price;
	}

	public int getMegapixel() {
		return megapixel;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public String getColor() {
		return color;
	}

	public enum Brand {

		APPLE, SAMSUNG, MOTO, GOOGLE, ONEPLUS, NOKIA, XIOMI
	}

	@Override
	public int compareTo(Mobiles mobile2) {

		// this > mobile 2 = +ve
		// this < mobile 2 = -ve
		// this == mobile 2 == 0

		if (this.getPrice() > mobile2.getPrice()) {

			return 1;
		} else if (this.getPrice() < mobile2.getPrice()) {

			return -1;
		} else
			return 0;
	}

}
