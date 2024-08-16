//　会社で作成、表示用の税込みの関数化に悩んだが成功
//　関数化出来れば「println」に記述すれば表示される
//　汎用性「println」だとデータ型を文字列に変換しないと表示されない事を確認、
//　01/09の朝、テスト中！！　結果、変換しないとダメ、直接記述はOK
package umeJava_01;
public class Test_01_07
{	
	public static void main(String[] args)
	{
		double price = 980;
		double tax = 1.1;
		
		String s0 = "tako";
		
		str( s0 );
		
//		clucTax( price, tax);							  //計算後に呼び出した関数		
		double TaxInPrice = clucTax( price, tax);//上の関数を変数に定義
																  //書くのに悩んだ	
/*		System.out.println(price);
//		System.out.println(TaxInPrice);
			
	   	String henkan = String.valueOf( price );	//多分、値なので文字列に変換しないと
*/	   	String henka = String.valueOf( TaxInPrice );//表示されないが分かった。01_4に有り
		
//		str( henkan );		//データ型→文字列型に変換しないとダメだと思う。
		str( henka );		//240107　夜に確認する事←01/09に確認、
 							    //変換しないとダメでした
		str( price + "" );// ( "" + 数字 )は通った。調べる
		str( henka );	//数字のみは変換しないとダメ

	}
	static double clucTax( double price, double tax)
	{
		return price * tax;

//コピペ	double price = 980;
//コピペ	double tax = 1.1;
	}

	static void str( String str )
	{
		System.out.println( str );
	}
}	
