package demo_05;

public class Test_08_19_job
{
	public static void main( String[] args )
	{
		Calc19 calc = new Calc19( "Poly-morphism" );
		calc.process( () -> {

			Interface save = Calc19.create();
				save.execute();
		});
		
		
		

			}
	
	
}