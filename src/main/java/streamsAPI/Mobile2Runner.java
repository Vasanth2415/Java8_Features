package streamsAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import streamsAPI.Mobile2.Brand;

public class Mobile2Runner {
	
	public static List<Mobile2> mobileList = null;
	
	public static void main(String[] args) {
		
		Mobile2 mobile1 = new Mobile2(Brand.APPLE, "13 Pro Max", 256, 12500, 13, 6.1, "Grey");
		Mobile2 mobile2 = new Mobile2(Brand.APPLE, "12 Pro Max One", 150, 15500, 13, 6.5, "Black");
		Mobile2 mobile3 = new Mobile2(Brand.APPLE, "13 Pro Plus", 999, 15000, 13, 6.1, "Blue");
		Mobile2 mobile4 = new Mobile2(Brand.SAMSUNG, "Galaxy S1", 256, 12500, 16, 5.1, "White");
		Mobile2 mobile5 = new Mobile2(Brand.SAMSUNG, "Galaxy A13", 100, 8500, 10, 8.1, "Red");
		Mobile2 mobile6 = new Mobile2(Brand.ONEPLUS, "Nord N100", 256, 12500, 13, 6.1, "Grey");
		Mobile2 mobile7 = new Mobile2(Brand.ONEPLUS, "11 5G", 120, 25000, 28, 6.2, "Ocean Blue");
		Mobile2 mobile8 = new Mobile2(Brand.XIOMI, "Redmi note 13", 1999, 25000, 120, 6.1, "Blue");
		Mobile2 mobile9 = new Mobile2(Brand.XIOMI, "Redmi 5", 156, 18500, 50, 7.1, "White");
		Mobile2 mobile10 = new Mobile2(Brand.GOOGLE, "Pixel 7 Pro", 150, 18500, 40, 8.1, "Orange");
		Mobile2 mobile11 = new Mobile2(Brand.GOOGLE, "Pixel 6 Pro", 120, 13500, 30, 6.1, "Yellow");
		Mobile2 mobile12 = new Mobile2(Brand.MOTO, "RAZR", 320, 35000, 28, 6.2, "Metallic");
		Mobile2 mobile13 = new Mobile2(Brand.MOTO, "EDGE +", 450, 55000, 120, 6.1, "Blue light");
		Mobile2 mobile14 = new Mobile2(Brand.NOKIA, "G10", 256, 16500, 70, 7.1, "White");
		Mobile2 mobile15 = new Mobile2(Brand.NOKIA, "G15 X", 250, 21500, 80, 8.1, "Orange");

		
		mobileList = Arrays.asList(mobile1, mobile2, mobile3, mobile4, mobile5, mobile6, mobile7, mobile8, mobile9,
				mobile10, mobile11, mobile12, mobile13, mobile14, mobile15);
		
		displayMobiles();
		//lowToHigh();
		highToLow();
		

	}

	public static void displayMobiles() {
		System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", "BRAND", "MODEL", "MEMORY", "CAMERA", "PRICE");
		for (Mobile2 mobile : mobileList) {

			System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", mobile.getBrand(), mobile.getModel(),
					mobile.getMemory(), mobile.getMegapixel(), mobile.getPrice());
		}

	}

	public static  void lowToHigh() {
 
		Collections.sort(mobileList,new SortByPriceLowToHigh()); // here object is created for SortByPriceLowToHigh() method with new keyword
		
		System.out.println("After Sorting");
		
		System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", "BRAND", "MODEL", "MEMORY", "CAMERA", "PRICE");
		for (Mobile2 mobile : mobileList) {

		System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", mobile.getBrand(), mobile.getModel(),
					mobile.getMemory(), mobile.getMegapixel(), mobile.getPrice());
		
		}
		
	}
	
	
	
		public static void highToLow() {
			
			Collections.sort(mobileList,new SortByPriceHighToLow());
			
			System.out.println("After Sorting");
			
			System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", "BRAND", "MODEL", "MEMORY", "CAMERA", "PRICE");
			for (Mobile2 mobile : mobileList) {

			System.out.printf("| %-15s | %-15s |%-15s |%-15s |%-15s |%n", mobile.getBrand(), mobile.getModel(),
						mobile.getMemory(), mobile.getMegapixel(), mobile.getPrice());
			
			
		}
		
		
		
		
		}

		
		
		
	
	
}
