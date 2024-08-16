//　セミコロン、double書き忘れ多数←対策しないと基本が出来てない

package umeJava_01;
public class Test_01_13
{
	public static void main( String[] ags )
	{
		put();
		
		put2();

	}

	static void put2()
	{
		double price = 980;
		double tax = 1.1;

		double clucInTaxPrice = clucInTax2( price, tax );

		show( price + "円です" );
		show( clucInTaxPrice + "円です" );	
	}

	static void show( String str )
	{
		System.out.println( str );
	}

	static double clucInTax2(double price, double tax )
	{
		return(price * tax );	

	}

	static void put()
	{
		String indi = "Hello World";
		System.out.println( indi );
	
		double price = 980;
		double tax = 1.1;

		double clucInTaxPrice = clucInTax( price, tax);

		indi( price + "円" );
		indi( clucInTaxPrice + "円" );
	}

	static double clucInTax(double price, double tax)
	{
		return( price * tax);
	}

	static void indi( String str )
	{
		System.out.println( str );
	}
}
