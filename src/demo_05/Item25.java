package demo_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Item25 implements Interface {
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc25 calc;

	public Item25() {
	}

	public Item25 id(String id) {
		this.id = id;
		return this;
	}

	public Item25 name(String name) {
		this.name = name;
		return this;
	}

	public Item25 price(double price) {
		this.price = price;
		return this;
	}

	public Item25 tax(double tax) {
		this.tax = tax;
		return this;
	}

	public Item25 calc(Calc25 calc) {
		this.calc = calc;
		return this;
	}

	public static void save(Consumer<Item25> con) {
		Item25 item = new Item25();
		con.accept(item);
		indi("save :" + item);
	}

	public String getId() {
		return id;
	}

	public void display() {
		indi("表示内容 :" + name);
		double calcInTax = calcTax(price, tax);
		indi("税込み価格は" + calcInTax + "円です");
		calc.display();
	}

	@Override
	public void execute() {
		indi("Lambda");
		
		ArrayList<String> animals = new ArrayList<String>(Arrays.asList("Dog"));
		
		ArrayList<String> animal = new ArrayList<String>();
		animal.add("Cat");
		animal.add("Phenix");
		animal.add("Lion");
		
		String getAnimal = animal.get(1);
		indi(getAnimal);
		
		animals.addAll(animal);
		
		animals.set(2, "Fox");
		
		animals.remove(1);
		animals.add(1, "Elephant");
		
		Comparator<String> compa = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2.compareTo(o1));
			}
		};
		
		Collections.sort(animals, compa);
		
		Iterator<String> itera = animals.iterator();
		while (itera.hasNext()) {
			String hoge = itera.next();
			indi(hoge);
		}
		
		ArrayList<Integer> seq = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			int number = new java.util.Random().nextInt(4) + 1;
			seq.add(number);
		}
		
		for (int i : seq) {
			char[] base = { ' ', 'A', 'G', 'T', 'C' };
			System.out.print(base[i]);
		}
		indi(" ");
		
		int num = new java.util.Random().nextInt(10) + 1;
		String str = ((num % 2) == 0) ? ((num % 3) == 0) ?
								"true/true" : "true/false"
						:((num % 3) == 0) ?
								"false/true" : "false/false";
			indi(num + " " + str);
	}

	public static double calcTax(double price, double tax) {
		return (price * tax);
	}

	@Override
	public String toString() {
		return "Item25 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public static void indi(String s0) {
		System.out.println(s0);
	}
}