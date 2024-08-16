//　System.out.println();を関数化の手順　汎用性が有り
//紙ベースの関数化の手順の説明有り

package umeJava_01;
public class Ume_put04_01 
{
	static String name = "レイジ";			
	public static void main( String[] args )
	{		
		String str = name + "は魔王を倒した。";		//　①この変数strが　（後でs0に変化）
//		　System.out.println( str );　上2行を切り取り下に貼り付ける、その後、関数を宣言
		put(str);		//　②put()に渡したい引数を記述		変数を定義してあるので変数を記述
						    //後でs0に変化
		System.out.println( "putから戻ったらこれを表示　１" );
		
		put("putから戻ったらこれを表示　２");//println("～")を関数化したのでput()でOK
	}									
	static void put(String str )//③put(str)から受け取りたい
	{									//「（変数名）String str」を記述
		
//		String str = name + "は魔王を倒した。"	//2行で来てこの文のみ元に戻る
		System.out.println( str );		//④で出力する
	}											//System.out.println();を関数化 汎用性有り
}

