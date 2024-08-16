//これで事足りそう→indi(　price + "円です" ); ←正解


package umeJava_01;
public class Test_01_22
{
	public static void main(String[] args )
	{
			double price = 980;
			double tax = 1.1;

			double clucInTaxPrice = clucInTax( price, tax );

			indi( price + "円です" );
			indi( clucInTaxPrice + "円です" );

	}

	static double clucInTax( double price, double tax ){
		return price * tax;
	}
		
	static void indi( String  str ){
		System.out.println( str );
	}	
}
