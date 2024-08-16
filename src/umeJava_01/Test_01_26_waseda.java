//　早稲田の for文 と while文 を作動させた 01/28

package umeJava_01;

public class Test_01_26_waseda
{
	public static void main( String[] args )
	{
		int fortune = new java.util.Random().nextInt( 5 ) + 1;
	
		int s = 0;		//初期化忘れ
		int m = 1;		//初期化忘れ
		for( int i = 0; i < fortune; i++ ){
			s = s + m;
		}
		
		switch( s ){
			case 1:{System.out.print( "朝");
			break;
			}
			case 2:{System.out.print( "昼");
			break;
			}
			case 3, 4:{System.out.println( "夕方" );
			break;
			}
			case 5:{System.out.println( "夜" );
			break;
			}
		}

		double price = 980;
		double tax = 1.1;

		double clucInTax = clucTax( price, tax );
	
			indi( price + "円です");
			indi( clucInTax + "円です");
/*
 * 	waseda 1～n番目までの総和を求めたい場合の関数（公式有り）
 * 		for文の場合
 */			
		int n = 10;		//10万回でも速攻だったスゲー
		int x = 0;
				
		for( int k = 1; k <= n; k++ ){
			x += k;		//	x = x + k と同じ、何かに使用しないとエラーが出る
		}
		System.out.println( x );
/*
 * 		while文の場合
 */
		int k = 1;				//for文の初期化
		int j = 0;
		int num = 10;				//任意の数値

		while( k <= num ){	//for文の条件式（真ん中）
			j = j + k;			// j += k; と同じ、何かに使用しないとエラーが出る
			k = k + 1;			//for文の最後（K++と同じ意味）
									//「while」文の時は「k++」は最後に書かないと
		}							//「for」文と違う結果が出るので注意  
			System.out.println( j );	//	int型は  indi( );を使うとエラーが出る 
	}
	static double clucTax( double price,  double tax ) //　カンマ消し忘れ
	{
	return( price * tax );
	}	
	static void indi( String str )
	{
		System.out.println( str );
	}
}
