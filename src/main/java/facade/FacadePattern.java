package facade;

interface Browser{
	
	public void generatePDFReport();
	public void generateJUnitReport();
	
}

class Chrome implements Browser{

	@Override
	public void generatePDFReport() {
		System.out.println("chrome PDF");
		
	}

	@Override
	public void generateJUnitReport() {
		System.out.println("chrome Junit report");
		
	}
	
}

class FireFox implements Browser{

	@Override
	public void generatePDFReport() {
		System.out.println("fireFox Report");
		
	}

	@Override
	public void generateJUnitReport() {
		System.out.println("Junit Report");
		
	}
	
}


class FacadeHelper{
	
	static Browser browser;
	
	public static void generateReport(String browserName, String ReportType) {
		
		switch (browserName) {
		case "chrome":
			browser=new Chrome();
			switch (ReportType) {
			case "PDF":
				browser.generatePDFReport();
				break;
				case "junit":
					browser.generateJUnitReport();
				break;

			    default:
				   break;
			}
			break;
		
		
     	case "firefox":
		browser=new FireFox();
		switch (ReportType) {
		case "PDF":
			browser.generatePDFReport();
			break;
			case "junit":
				browser.generateJUnitReport();
			break;

		    default:
			   break;
		}
		break;
	}
			
			
		
		
		
		
	}
}


public class FacadePattern {
	
	public static void main(String[] args) {
		
		/*
		Browser b=new Chrome();
		b.generateJUnitReport();
		b.generatePDFReport();
		
		Browser b1=new FireFox();
		b1.generateJUnitReport();
		*/
		
		FacadeHelper.generateReport("chrome", "PDF");
		
		
	}

}
