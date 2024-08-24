package demo_05;

public class Test_08_24_job 
{

		public static void main( String[] args )
		{
		Calc24 calc = new Calc24( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc24.create();
				save.execute();
		});

	}

}