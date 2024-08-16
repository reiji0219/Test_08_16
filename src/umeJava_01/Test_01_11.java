package umeJava_01;

public class Test_01_11
{
public static void main( String[] args )
	{
		put6();
		put5();
		put4();
		put3();
		put2();		
		put();		
	}

	static void put6()
	{
	double price = 980;
	double tax = 1.1;
	
	double clucInPrice = clucTaxPrice3( price, tax );
	
	indi( price + "円でした");
	indi( clucInPrice + "円でした");
	}
	static double clucTaxPrice3( double price, double tax)
	{
	return(price * tax);
	}

	static void put5()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTaxPrice2( price, tax );
		
		indi( price + "円です。" );
		indi(clucInTax + "円です。");
		

	}
	static double clucTaxPrice2(double price, double tax)
	{
		return(price * tax);
	}

	static void put4()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTaxPrice( price, tax );
		
		indi( price + "円だー");
		indi(clucInTax  + "円だー");
		

	}
	static double clucTaxPrice( double price, double tax )
	{
		return( price * tax );
	}
	
	static void put3()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax3 = clucTax3( price, tax);
		
		indi( price + "円だよー");
		indi( clucInTax3 + "円だよー");
	}
	static double clucTax3( double price, double tax)
	{
		return(price * tax);
	}
	
	static void put2()
	{
		double price = 980;
		double tax = 1.1;

		double taxInPrice =clucTax2( price, tax);
		
		indi( price + "円です。");
		indi( taxInPrice + "円です。");
	}
	static double clucTax2( double price, double tax)
	{
		return( price * tax );
	}
	
	static void put() 
	{
		System.out.println("nodokaテスト中");

		double price = 680;
		double tax = 1.1;

		double clucInTax = clucTax(price, tax);

		indi(price + "円");
		indi(clucInTax + "円");
	}
	static double clucTax(double price, double tax)
	{
		return price * tax;
	}
	static void indi(String str) 
	{
		System.out.println(str);
	}

	
	
	
	
}
