package demo_05;

public class Item17 
{
	private String id;
	private String name;
	private double price;
	private double tax;
	
	public Item17( ) {
		
	}
	
	public Item17 id( String id ) {
		this.id = id;
		return this;
	}
	public Item17 name( String name ) {
		this.name = name;
		return this;
	}
	public Item17 price( double price ) {
		this.price = price;
		return this;
	}
	public Item17 tax( double tax ) {
		this.tax = tax;
		return this;
	}

	
	
	
	@Override
	public String toString() {
		return "Item17 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
		
}
