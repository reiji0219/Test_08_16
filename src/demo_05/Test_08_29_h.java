package demo_05;

public class Test_08_29_h 
{
	public static void main( String[] args )
	{
		Calc29h calc = new Calc29h( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc29h.create();
				save.execute();
				
		});	
	}	
}