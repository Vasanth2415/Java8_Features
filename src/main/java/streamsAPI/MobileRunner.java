package streamsAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import streamsAPI.Mobiles.Brand;

public class MobileRunner {

	public static List<Mobiles> mobileList = null;

	public static void main(String[] args) {

		Mobiles mobile1 = new Mobiles(Brand.APPLE, "13 Pro Max", 256, 12500, 13, 6.1, "Grey");
		Mobiles mobile2 = new Mobiles(Brand.APPLE, "12 Pro Max One", 150, 15500, 13, 6.5, "Black");
		Mobiles mobile3 = new Mobiles(Brand.APPLE, "13 Pro Plus", 999, 15000, 13, 6.1, "Blue");
		Mobiles mobile4 = new Mobiles(Brand.SAMSUNG, "Galaxy S1", 256, 12500, 16, 5.1, "White");
		Mobiles mobile5 = new Mobiles(Brand.SAMSUNG, "Galaxy A13", 100, 8500, 10, 8.1, "Red");
		Mobiles mobile6 = new Mobiles(Brand.ONEPLUS, "Nord N100", 256, 12500, 13, 6.1, "Grey");
		Mobiles mobile7 = new Mobiles(Brand.ONEPLUS, "11 5G", 120, 25000, 28, 6.2, "Ocean Blue");
		Mobiles mobile8 = new Mobiles(Brand.XIOMI, "Redmi note 13", 1999, 25000, 120, 6.1, "Blue");
		Mobiles mobile9 = new Mobiles(Brand.XIOMI, "Redmi 5", 156, 18500, 50, 7.1, "White");
		Mobiles mobile10 = new Mobiles(Brand.GOOGLE, "Pixel 7 Pro", 150, 18500, 40, 8.1, "Orange");
		Mobiles mobile11 = new Mobiles(Brand.GOOGLE, "Pixel 6 Pro", 120, 13500, 30, 6.1, "Yellow");
		Mobiles mobile12 = new Mobiles(Brand.MOTO, "RAZR", 320, 35000, 28, 6.2, "Metallic");
		Mobiles mobile13 = new Mobiles(Brand.MOTO, "EDGE +", 450, 55000, 120, 6.1, "Blue light");
		Mobiles mobile14 = new Mobiles(Brand.NOKIA, "G10", 256, 16500, 70, 7.1, "White");
		Mobiles mobile15 = new Mobiles(Brand.NOKIA, "G15 X", 250, 21500, 80, 8.1, "Orange");

		mobileList = Arrays.asList(mobile1, mobile2, mobile3, mobile4, mobile5, mobile6, mobile7, mobile8, mobile9,
				mobile10, mobile11, mobile12, mobile13, mobile14, mobile15);
		
		displayMobiles();
		lowToHigh();

	}

	public static void displayMobiles() {
		
		System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", "BRAND", "MODEL", "MEMORY", "CAMERA", "PRICE");
		
		for (Mobiles mobile : mobileList) {

			System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", mobile.getBrand(), mobile.getModel(),
					mobile.getMemory(), mobile.getMegapixel(), mobile.getPrice());
		}

	}

	public static void lowToHigh() {
 
		Collections.sort(mobileList); // it automatically calls the compareTo method
		
		System.out.println("After sorting by price low to high");

		System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", "BRAND", "MODEL", "MEMORY", "CAMERA", "PRICE");
		
		for (Mobiles mobile : mobileList) {

			System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", mobile.getBrand(), mobile.getModel(),
					mobile.getMemory(), mobile.getMegapixel(), mobile.getPrice());
		}

	}

}
