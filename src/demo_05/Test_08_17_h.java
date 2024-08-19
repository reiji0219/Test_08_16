package demo_05;

public class Test_08_17_h 
{
	public static void main( String[] args )
	{
		Calc17 calc = new Calc17( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc17.create();
				save.execute();
				
		});	
	}
}
