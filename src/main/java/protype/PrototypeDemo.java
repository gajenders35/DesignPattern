package protype;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Car c=new Car("scropio", 1500, 6, 2020, 14);
		
		System.out.println(c);
		c.airbags=2;
		
		Car c1=c.getClone();
		System.out.println(c1);

	}

}
