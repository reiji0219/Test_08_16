//for文を逆にif文に分解して説明（梅っち１６）
// switch文に無理矢理 for文を入れた　尚、今は無意味だが何時か役立つかも
//ブロック内で生成された値「 〇 」や「 i. j. k. n 」が、最後まで残っている（for文内は消滅）
// ブロックを閉じなければ何回でも使用出来るはず。←何かで使えそう
package umeJava_01;
public class Test_01_25_if 
{
	public static void main( String[] args )
	{	
/*
 *　① switch文に無理矢理 for文を入れた。下の梅っちのを参考にしたら成功した
 */
		indi("あなたの運勢を占います"+ " " );
		
		int fortune5  = new java.util.Random().nextInt( 5 ) + 1;	
		
		int n = 0;			//ランダム生成の回数分ループ。( 0～4 ) + 1回
		for( int i = 0; i < fortune5; i++) {		
			n = n + 1;		//ループと同数が「 n 」に代入される
		}						// for文をここで一旦閉じる事で、「 n 」の値が生成出来る。
		
		switch( n ) {
			case 1 : 	{		indi("大吉");	break;}
			case 2 : 	{		indi("中吉");	break;}
			case 3, 4 : {		indi("吉");		break;}
			case 5 : 	{		indi("凶");		break;}
		}
/*
 * 梅っち 16 のモンスターランダム生成→表示を
 * 　for文を分解してif文にして説明
 */
		int 	e = new java.util.Random().nextInt( 4 ) + 1;	
			
		String	m = " 〇 ";
		String	s = "  ";
		
		for( int j = 0; j < e; j = j +1) {
			s = s + m;				//この記述をすると「e」の値と同じ値が出力される。
		}								//a = a + 1;と同じ
		
		int		j = 0;	//　for文を逆にif文に分解して説明（梅っち１６）
		if( j < e )		//(条件式)が「true」なら命令群を実行
				{	s = s + m;		j = j + 1;	}			//「s = s + m;」と 「j = j + 1;」は同じ式
		if( j < e ) {		s = s + m;		j = j + 1;	}	// a = a +1;と( a++ );は同じ意味なので
		if( j < e ) {		s = s + m;		j = j + 1;	}	//int a = 0;の場合は a = 0 + 1;になり
		if( j < e ) {		s = s + m;		j = j + 1;	}	//「a」は「１」になる（代入演算子だから）
		if( j < e ) {		s = s + m;		j = j + 1;	}	

			indi( s );	
		
		for( int i = 0; i < 3; i++) {			//数字の３がループ回数
			indi( "現在" +( i + 1) + "週目");	 //( i + 1)で＋１(　)が大事！
			indi( s );		//ブロック内で生成された値「 〇 」は、
		}						//最後まで残っている
	}
	static void indi( String str ){
		System.out.print( str );
	}
	static void enter(String str) {
		System.out.println(str);
	}
}