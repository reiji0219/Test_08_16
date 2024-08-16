//練習用の記述　　1月の閉めで体に覚えさせる為に書いた
//途中から酔っぱらって書いたけど動いてる。

package umeJava_01;

public class Test_01_31{
	public static void main( String[] args )
	{
		put();
		put2();
		uranai();
		sw();
		
		int fortune3 = new java.util.Random().nextInt( 5 ) + 1;
		
		int s = fortune3;
		int i = 0;
		int n = 1;
		
		while( i < s ) {
			n += i;
			i++;
		}
			if( s == 1 ) {
				indi( "大");
			}else if ( s== 2 || s == 3) {
				indi("中") ;
			}else if ( s== 4) {
				indi("小") ;
			}else if ( s== 5) {
				indi("吉") ;
			}
				System.out.println( n );
		}
	static void put(){
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTax( price, tax );
		
		indi( price + "円です");
		indi( clucInTax + "円です");
	}
	static double clucTax( double price, double tax ){
		return( price * tax );
	}
	
	static void put2()
	{
		double price = 980;
		double tax = 1.1;
		
		double clucInTax = clucTax2( price, tax );
		
		indi( price + "円です");
		indi( clucInTax + "円です");
	}
	static double clucTax2( double price, double tax )
	{
		return( price* tax );
	}	
	
	static void uranai()
	{
		int fortune = new java.util.Random().nextInt( 5 ) + 1;
		int j = 1;
		
		for( int i = 0; i < fortune; i++ ) {
			j += i;
		}
		if( fortune == 1) {
			indi( "大吉");
		}else if (fortune == 2 || fortune == 3 ) {
			indi( "中吉");
		}else if (fortune == 4 ) {
			indi( "中吉");
		}else if (fortune == 5 ) {
			indi( "中吉");
		}
		System.out.println( j );	
	}
	
	static void sw() 
	{
		int fortune2 = new java.util.Random().nextInt( 5 ) + 1;
		
		int num = fortune2;
		int k = 1;
		
		for( int i = 0; i < num; i++ ) {
			k += i;
		}
			System.out.println( k );
			
		switch( num ) {
			case 1 : 	{ indi( "大吉");	break;	}
			case 2, 3 : { indi( "中吉");	break;	}
			case 4 : 	{ indi( "小吉");	break;	}
			case 5 : 	{ indi( "吉");		break;	}	
		}
	}
	
	static void indi( String str ){
		System.out.println( str );
	}
}
