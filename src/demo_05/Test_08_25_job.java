package demo_05;

public class Test_08_25_job 
{
	public static void main( String[] args )
	{
		Calc25 calc = new Calc25( "Poly-morohism" );
		calc.process( () -> {

			Interface save = Calc25.create();
				save.execute();
				
		});

		
		
			
	}
	
}
