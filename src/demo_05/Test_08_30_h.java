package demo_05;

public class Test_08_30_h 
{
	public static void main( String[] args )
	{
		Calc30h calc = new Calc30h( "Poly-morphism" );
		calc.process( () -> {
			
			Interface save = Calc30h.create();
				save.execute();
			
		});
		
			
		

			
	}
	
	
}
