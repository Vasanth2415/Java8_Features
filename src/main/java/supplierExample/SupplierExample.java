package supplierExample;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample implements Supplier<Object>{


	@Override
	public Object get() {
		Calendar calendar = Calendar.getInstance();

		return calendar.getTime();	
	}

	
	public static void main(String[] args) {
		
		Supplier<Object> supplier =()-> {
			Calendar calendar = Calendar.getInstance();

			return calendar.getTime();
		};
	}

}
