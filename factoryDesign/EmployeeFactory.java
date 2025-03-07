package factoryDesign;

public class EmployeeFactory {

	public static  Employee getEmployee(String empType) {
		if(empType=="Web Developer") {
			return new WebDeveloper();
		}
		else if(empType=="Android Developer") {
			return new AndroidDeveloper();
		}else {
			return null;
		}
	}
}
