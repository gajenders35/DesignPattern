package builderDP;

public class BuilderPattern {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle.VehicleBuilder(4, 400).build();

		Vehicle v1=new Vehicle.VehicleBuilder(4, 400).setAirbags(4).build();
		
		System.out.println(v1);
		
	}

}
