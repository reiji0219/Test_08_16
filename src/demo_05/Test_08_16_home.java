package demo_05;

public class Test_08_16_home 
{
	public static void main( String[] args )
	{
		Calc16 calc = new Calc16( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc16.create();
				save.execute();
			
		});
	}
}
