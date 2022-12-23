//	Write class ProductionDepartment
//	to implement Employee interface and override its Methods
public class ProductionDepartment implements Employee {

//	enroll() method should take details from the employee and add him / her
//	to the respective department and print a confirmatory message.
	@Override
	public void enroll(int id, String name) {
		System.out.println("Employee enrolled to production department");
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
		System.out.println("Salary of production department is Rs - 35000");
	}

}
