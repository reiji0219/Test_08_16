package demo_05;

public class Test_08_29_home 
{
	public static void main( String[] args )
	{
		Calc29 calc = new Calc29( "Poly-morphism" );
		calc.process( () -> {
			
			Interface save = Calc29.create();
				save.execute();
				
		});
	}
}
