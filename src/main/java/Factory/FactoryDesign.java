package factory;

import java.util.Scanner;

interface Shape{
	public void shape();
	public double getArea(int x);
}

class Circle implements Shape {
	
	@Override
	public void shape() {
		System.out.println("this is circle to draw");
	}
	@Override
	public double getArea(int x) {
		return 2*7.14*x;
	}
}

class Square implements Shape{
	@Override
	public void shape() {
		System.out.println("This is Square");
	}
	@Override
	public double getArea(int x) {
		return x*x;
	}
	
}

class ObjectFactory{
	
	public static Shape getInstance(String shape) {
		
		if(shape.equalsIgnoreCase("circle"))
			return new Circle();
		
		else if(shape.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}
	
}

public class FactoryDesign {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		int x=s.nextInt();
		
		Shape shape=ObjectFactory.getInstance(str);
		System.out.println(shape);
		System.out.println(shape.getArea(x));
		
		
	}

}
