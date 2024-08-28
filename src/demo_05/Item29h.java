package demo_05;

import java.util.function.Consumer;

public class Item29h implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc29h calc;
	
	
	public Item29h id( String id ) {
		this.id = id;
		return this;
	}
	public Item29h name(String name) {
		this.name = name;
		return this;
	}
	public Item29h price(double price) {
		this.price = price;
		return this;
	}
	public Item29h tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item29h calc( Calc29h calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item29h> con ) {
		Item29h item = new Item29h();
		con.accept(item);
		indi( "save :" + item );
	}
	
	public String getId() {
		return id;
	}
	public void display() {
		indi( "表示内容 ;" + name );
		
		double calcInTax = calcTax( price, tax );
		indi( "税込み価格は" + calcInTax + "円です" );

		calc.display();
	}
	
	public static double calcTax( double price, double tax ) {
		return( price * tax );
	}
	
	
	@Override
	public String toString() {
		return "Item29h [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
