package demo_05;

public class Test_08_18_job 
{
	public static void main( String[] args )
	{
		Calc18 calc = new Calc18( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc18.create();
				save.execute();
		});
				
	}
	
}
