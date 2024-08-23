package demo_05;

public class Test_08_23_job 
{
	public static void main( String[] args )
	{
	Calc23 calc = new Calc23( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );
		
		Interface save = Calc23.create();
			save.execute();
	});
	
	}
}