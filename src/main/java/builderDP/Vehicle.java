package builderDP;

import lombok.ToString;

@ToString
public class Vehicle {
	
	int wheel;
	int cc;
	
	int airbags;
	
	public Vehicle(VehicleBuilder vb) {
		
		this.wheel=vb.wheel;
		this.cc=vb.cc;
		this.airbags=vb.airbags;
	}
	
	@ToString
	public static class VehicleBuilder{
		int wheel;
		int cc;
		
		int airbags;
		
		public VehicleBuilder(int wheel,int cc) {
			this.cc=cc;
			this.wheel=wheel;
		}
		
		public VehicleBuilder setAirbags(int x) {
			this.airbags=x;
			return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
	}

}
