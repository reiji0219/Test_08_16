package umeJava_01;
public class Test_01_13_1
{
	public static void main( String[] args )
	{
		put();	
		put2();
		put3();
		
		
	}

	static void put3()
	{
		double price = 980;
		double tax = 1.1;
		
		double zeikomi = keisan( price, tax );
			
		indi2( price + "円だよ");
		indi2( zeikomi + "円だよ");

	}
	
	static void indi2(String str )
	{
		System.out.println( str );
	}
	
	static double keisan( double price, double tax )
	{
		return( price * tax );
	}
	
	static void put2()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTaxPrice2 = clucInTax2( price, tax );
			
		show( price + "円です" );
		show( clucInTaxPrice2 + "円です" );
	}
	static void show( String str2)
	{
		System.out.println( str2);
	}
	static double clucInTax2( double price, double tax )
	{
		return(price * tax );
	}
	static void put()
	{
		String s0 = "まだまだです";
		System.out.println( s0 );
		
		double price = 980;
		double tax = 1.1;
		
		double clucInTaxPrice = clucInTax( price, tax);
	
		indi( price + "円");
		indi( clucInTaxPrice + "円");	
	}
	static double clucInTax( double price, double tax)
	{
		return(price * tax);
	}	
	static void indi(String str )
	{
		System.out.println( str);
	}
	
}
