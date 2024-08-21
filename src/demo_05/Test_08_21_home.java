package demo_05;

public class Test_08_21_home 
{
	public static void main( String[] args )
	{
		Calc21 calc = new Calc21( "Poly-morphism" );
		calc.process( () -> {
			
			Interface save = Calc21.create();
				save.execute();
		});
		
		
		
		
	}
	
	
}
