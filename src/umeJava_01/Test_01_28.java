package umeJava_01;
public class Test_01_28 
{
	public static void main( String[] args )
	{
		put();
		
		double price = 980;
		double tax = 1.1;
		
		double clucInTax2 = clucTax2( price, tax );
		
		indi( price + "円");
		indi( clucInTax2  + "円");
	}
	public static double clucTax2( double price, double tax )
	{
		return(price * tax );
	}
	static void put()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTax( price, tax );
		
			indi( price + "円です" );
			indi( clucInTax + "円です");
		
		int fortune = new java.util.Random().nextInt( 5 ) + 1;
		
		int j = fortune;
		int k = 0;
		
		for( int i = 0; i < j; i++ ){
			k +=  i;	 	// k = k + iと同じ
		}
		switch( j ){
			case 1: { indi( "大吉" );    break; }
			case 2, 3: { indi( "中吉" ); break; }
			case 4: { indi( "小吉" );    break; }
			case 5: { indi( "吉" );      break;}
		}
			System.out.println( k );
	}
	
	static double clucTax( double price, double tax )
	{
	return( price * tax );
		
	}
	
	static void indi( String str )
	{
		System.out.println( str );
	}
}