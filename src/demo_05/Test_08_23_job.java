package demo_05;

public class Test_08_23_job 
{
	public static void main( String[] args )
	{
	Calc23 calc = new Calc23( "Poly-morphism" );
	
	Item23.save( item -> {
		item.id( "掛け算" )
		      .name( "税込み価格" )
		      .price( 980 )
		      .tax( 1.1 )
		      .calc( calc );

		System.out.println( "計算式 :" + item.getId());

		item.display();

		});
	}
}