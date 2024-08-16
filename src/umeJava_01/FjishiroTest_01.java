package umeJava_01;
public class FjishiroTest_01 
{
	public static void main( String[] args )
	{
		put();
		
		double price = 980;
		double tax = 1.1;
			
		double clucInTaxPrice = clucInTax2( price, tax );
		
		show2( price + "円です" );
		show2(clucInTaxPrice + "円です");	
	}
	
	static double clucInTax2(double price, double tax)
	{
		return(price * tax );
	}
	
	static void show2(String str)
	{
		System.out.println( str);
	}
	
	static double clucTaxPrice( double price, double tax )
	{
		return(price * tax );
		
	}
	
	public static void show(String str )
	{
		
		System.out.println( str );
	}
	
	static void put()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTaxPrice( price, tax );
		
		show( price + "円" );
		show( clucInTax + "円" );

	}
}
