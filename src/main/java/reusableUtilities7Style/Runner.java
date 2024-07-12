package reusableUtilities7Style;

public class Runner {

	public static void main(String[] args) {
		
		String name1 = "VASANTH";
		String name2 = "vasanth";
		
		
		IStringUtils stringUtils = new StringUtilsImpl();
		
		String convertedString1=stringUtils.converToLowerCase(name1);
		String convertedString2=stringUtils.convertToUpperCase(name2);
		
		System.out.println(convertedString1);
		System.out.println(convertedString2);

	}

}
