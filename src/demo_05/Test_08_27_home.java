package demo_05;

public class Test_08_27_home 
{
	public static void main( String[] args )
	{
		Calc27 calc = new Calc27( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc27.create();
				save.execute();
				
		});
	}
}