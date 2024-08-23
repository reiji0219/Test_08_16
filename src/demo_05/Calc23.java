package demo_05;

public class Calc23 extends Item23
{
	private String name;
	
	public Calc23( String name ){
	super();
	this.name = name;
	}

	@Override
	public void display(){
		indi( name );
	}	

}