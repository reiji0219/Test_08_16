//　if文とキーボード入力方法
//　梅っち０６

package umeJava_01;
public class Ume_if_01
{
	static int lv = 30;
	
	public static void main( String[] args ) throws java.io. IOException
	{
		int		c = System.in.read();
		
		System.out.println("1.○○です。");
		
		if( c == '1') {
			lv = 30;	
		}else {
			lv = 110;
		}
		
		
	}
	
}