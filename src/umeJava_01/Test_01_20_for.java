//緑黒板の二重for文のコード

package umeJava_01;
public class Test_01_20_for 
{
	public static void main( String[] aegs )
	{
	for( int i = 0; i < 4; i++ ){	//4〇を４回表示
		for(int j = 0; j < 4; j++ ){
			System.out.print( "〇" );
		}
			System.out.print( " " );	//　「ln」を抜くと横に伸びるが	
	}											//　最後が改行されないので
			System.out.println( " " );//←次の行の先頭にこれを付き足して解消した

	for( int i = 0; i < 4; i++ ){
		for( int j = 0; j < 4; j++ ){
			System.out.print( "●" );
		}
			System.out.println( " " );
	}

	for( int i = 0; i < 4; i++ ){
		for( int j = 0; j < 4; j++ ){
			System.out.print( "●" );
		}
			System.out.println( " " );
	}
/*	
//waseda 1～nまでの総和を求めたい場合の関数（公式有り）
	x = 0;
	for( k = 1; k <= n; k++ ){
		x += k;
	}

	x = 0;
	k = 1;

	while( k <= n ){
		x = x + k;
		k = k + 1;
*/		
	} 
}