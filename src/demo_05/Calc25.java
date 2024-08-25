package demo_05;

public class Calc25 extends Item25
{
	private String name;
	
	public Calc25( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc25 calc = new Calc25( "Poly-morohism" );
			Item25.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc ); 

				indi( "計算式 :" + item.getId());
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