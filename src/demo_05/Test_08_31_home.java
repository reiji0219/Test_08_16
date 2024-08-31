package demo_05;

public class Test_08_31_home 
{
	public static void main( String[] args )	
	{
	Calc31 calc = new Calc31( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );


		Interface save = Calc31.create();
			save.execute();

		});
	
	}
}