package umeJava_01;
public class Test_01_27_while 
{
	public static void main( String[] args )
	{
	int fortune = new java.util.Random().nextInt( 5 ) + 1;
	
	int s = 0;
	int m = 1;

	for( int i = 0; i < fortune; i++ ){
		s = s + m;
		
	}
		switch( s ){
			case 1:		{ indi( "大吉" )	;	break;	}
			case 2, 3:	{ indi( "中吉" )	;	break;	}
			case 4:		{ indi( "吉" )		;	break;	}
			case 5:		{ indi( "青" )		;	break;	}		
		}
		int fortune2 = new java.util.Random().nextInt(5) + 1;
		
		int i = 0;
		int j = 0;
		int n = fortune2;
		
		while( i <= n ) {			//	「<」「<=」の違いを理解する
			i++;						//	「=」が付くとその数が含まれる
			j = j + i;
		}
		System.out.println( j );
	}
	static void indi( String str )
	{
		System.out.println( str );
	}
}
