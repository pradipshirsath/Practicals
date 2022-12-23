//	Write class EngineeringDepartment
//	to implement Employee interface and override its Methods
public class EngineeringDepartment implements Employee {

//	enroll() method should take details from the employee and add him / her
//	to the respective department and print a confirmatory message.
	@Override
	public void enroll(int id, String name) {
		System.out.println("Employee enrolled to engineering department");
	}

//	terminate() should remove an employee from the department 
//	with a print statement.
	@Override
	public void terminate() {
		System.out.println("Employee removed succefully from production department");
	}

//	calculatePay() should print the total salary of the employee 
//	depending on his/her department and pay scale of that department.
	@Override
	public void calculatePay() {
		System.out.println("Salary of engineering department is Rs - 30000");

	}

}
