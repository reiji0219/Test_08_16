package demo_05;

public class Test_08_20_home 
{
	public static void main( String[] args )
	{
		Calc20 calc = new Calc20( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc20.create();
				save.execute();
		});
		
		
	}
	
}
