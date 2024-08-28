package demo_05;

public class Calc29h extends Item29h
{
	private String name;
	
	public Calc29h( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Item29h.save( item -> {
				Calc29h calc = new Calc29h( "Poly-morphism" );

				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );
				
				System.out.println( "計算式 :" + item.getId());
				
				item.display();
				
				item.execute();
				
			});
		};
	}
	
	@Override
	public void display() {
		indi( name );
	}
	
	public void process( Interface inter ) {
		indi( "start" );
		
		inter.execute();
		
		indi( "end" );
	}
}
