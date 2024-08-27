package demo_05;

public class Test_08_26_job 
{
	public static void main( String[] args )
	{
	Calc26 calc = new Calc26( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );

		Interface save = Calc26.create();
			save.execute();

		});
	}
}
