package singleton;

public class EagerInitilizationTest {
	public static void main(String[] args) {
		
		EagerInitilization eagerInitilization=EagerInitilization.getInstance();
		System.out.println(eagerInitilization);
		
		
	}

}


class EagerInitilization {

	private static EagerInitilization eagerInitilization=new EagerInitilization();
	
	private EagerInitilization() {
		
	}
	
	public static EagerInitilization getInstance() {
		return eagerInitilization;
	}
	
}

