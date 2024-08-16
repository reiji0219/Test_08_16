package umeJava_01;
public class Test_01_11_1 
{
	public static void main( String[] args )
	{
		put();
		put2();
		put3();
	
	}
	
	
	static double clucTaxPrice2(double price, double tax )
	{
		return(price * tax );
	}
	static double clucTax( double price, double tax )
	{
		return( price * tax );
	}
	static double clucTaxPrice( double price, double tax )
	{
		return( price * tax );
	}	
	static void indi(String str )
	{
		System.out.println( str );
	}
	
	static void put()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTaxPrice( price, tax );
		
		indi( price + "円" );
		indi( clucInTax + "円" );	
	}

	static void put2()
	{
		double price = 980;
		double tax = 1.1;
		
		 double clucInTaxPrice = clucTax( price, tax );
		
		indi( price + "円だよ");
		indi(clucInTaxPrice + "円だよ");	
	}

	static void put3()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax2 = clucTaxPrice2( price, tax );
	
		indi( price + "円だよー " );
		indi( clucInTax2 + "円だよー " );

	}

}


