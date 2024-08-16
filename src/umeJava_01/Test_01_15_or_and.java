//　「 || 論理和」= or    「 &amp,&& 論理積」= and   
//  「 < = &lt; 」 「 > = &gt; 」  「 &(and) = &amp; 」  「 " = &quota」

package umeJava_01;
public class Test_01_15_or_and
{
	public static void main( String[] args )
	{		
		put();	
		putif();	
		putor();
		putAnd();
	
		
	}

	static void putAnd()
	{
		int num01 = 10;
		int num02 = 30;
		//HTMLで使用   「&lt;」   「&amp;&amp;」
//		if( num01 &lt; 5 &amp;&amp; num02 > 20 ){  
		if( num01 < 5 & num02 > 20 ){
			indi( "TRUE ");
		}else{
			indi( "FLASE" );
		}
	
	}

	static void putor()
	{
		int num01 = 10;
		int num02 = 30;
	
		if( num01 < 5 || num02 > 20 ){
			indi( "TRUE ");
		}else{
			indi( "FLASE" );
		}
	}

	static void putif()
	{
		int num1 = 10;			//num1は１０　→　5～15の間が表示されるはず
	
						//num1大なり15
		if( num1 > 15 ){		//もしnum1が15より大きい場合は、
			indi( "15より大きい" );	//num1大なり5
		}else if( num1 > 5 ){		//そうではなく、かつ5より大きい場合は、
			indi( "5～15の間" );
		}else{				//それ以外の場合は、
			indi( "5より小さい" );
		}
	}

	static void put()
	{
		String s0 = "Hello World";
		indi( s0 );

		double price = 980;
		double tax = 1.1;

		double clucInTaxPrice = clucInTax( price, tax );
		
		indi( price + "円" );
		indi( clucInTaxPrice + "円" );
	}

	static double clucInTax( double price, double tax )
	{
		return( price * tax );
	}

	static void indi(String  str )
	{
		System.out.println( str );
	}


}
