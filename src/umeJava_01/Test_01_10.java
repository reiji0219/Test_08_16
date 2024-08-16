package umeJava_01;
public class Test_01_10 {
	public static void main( String[] args ) {
		put2();
		put();

		double price = 980;
		double tax = 1.1;

		double clucInTax = clucTax3(price, tax);

		indi2(price + "円");
		indi2(clucInTax + "円");
	}

	static void put2() {
		double price2 = 990;
		double tax2 = 1.1;

		double clucInTax2 = clucTax2(price2, tax2);

		indi(price2 + "円");
		indi(clucInTax2 + "円");

	}

	static double clucTax2(double price2, double tax2) {
		return price2 * tax2;
	}

	static void put() {
		double price = 980;
		double tax = 1.1;

		double taxInPrice = clucTax(price, tax);

		String henkan = String.valueOf(taxInPrice);

		indi(price + "円");
		indi(henkan);

		String s0 = "Hello World";
		indi(s0);
	}

	static double clucTax(double price, double tax) {
		return price * tax;
	}

	static void indi(String str) {
		System.out.println(str);
	}

	static double clucTax3(double price, double tax) {
		return price * tax;
	}

	static void indi2(String str) {
		System.out.println(str);
	}
}
