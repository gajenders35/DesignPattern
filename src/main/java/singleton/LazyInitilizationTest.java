package singleton;

public class LazyInitilizationTest {
	public static void main(String[] args) {
		
	}

}

class LazyInitilization{
	
	private static LazyInitilization lazyInitilization=new LazyInitilization();
	
	private LazyInitilization() {}
	
	public static LazyInitilization getInstance(){
		
		if(lazyInitilization == null) {
			lazyInitilization=new LazyInitilization();
		}
		return null;
	
	}
		
		
	
	
	
}