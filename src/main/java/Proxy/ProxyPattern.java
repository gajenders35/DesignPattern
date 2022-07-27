package Proxy;

interface DataBaseExecutor{
	public void exeuteQuery(String query) throws Exception;
}


class DataBaseExecutorImpl implements DataBaseExecutor{
	@Override
	public void exeuteQuery(String query) {
		
		System.out.println("query executed");
		
	}
}

class DataBaseExecutorProxy implements DataBaseExecutor{

	Boolean ifAdmin;
	DataBaseExecutor dataBaseExecutor;
	
	
	public DataBaseExecutorProxy(String name, String password) {
		if(name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("p")) {
			ifAdmin=true;
			dataBaseExecutor=new DataBaseExecutorImpl();
		}
	}
	
	@Override
	public void exeuteQuery(String query) throws Exception {
		if(ifAdmin) {
			dataBaseExecutor.exeuteQuery(query);
		}
		else {
			if(query.equals("delete")) {
				System.out.println("Delete not allowed");
				throw new Exception("delete not allowed");
			}
			else {
				dataBaseExecutor.exeuteQuery(query);
			}
		}
	}
	
}


public class ProxyPattern {

	public static void main(String[] args) throws Exception {
		
		DataBaseExecutor dataBaseExecutor=new DataBaseExecutorProxy("adminn", "p");
		dataBaseExecutor.exeuteQuery("delete");
		
		DataBaseExecutor dataBaseExecutor1=new DataBaseExecutorProxy("adminn", "p");
		dataBaseExecutor.exeuteQuery("create");
	
		
	
	}

}
