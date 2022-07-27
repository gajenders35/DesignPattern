package protype;

import lombok.ToString;

interface Prototype{
	public Car getClone();
}

@ToString
public class Car implements Prototype{
	
	String name;
	int cc;
	int airbags;
	int model;
	int mileage;
	
	
	
	
	public Car(String name, int cc, int airbags, int model, int mileage) {
		super();
		this.name = name;
		this.cc = cc;
		this.airbags = airbags;
		this.model = model;
		this.mileage = mileage;
	}




	@Override
	public Car getClone() {
		return new Car(name, cc, airbags, model, mileage);
	}

}
