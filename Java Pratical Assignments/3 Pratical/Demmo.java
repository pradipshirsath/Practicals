public class Demmo {
	public static void main(String[] args) {
		
//		Create objects of these classes 
//		and invoke overridden methods on those objects.
		ProductionDepartment objPD = new ProductionDepartment();
		EngineeringDepartment objED = new EngineeringDepartment();

		objPD.enroll(11, "Aniket");
		objPD.calculatePay();
		objPD.terminate();

		objED.enroll(11, "Gaurav");
		objED.calculatePay();
		objED.terminate();

	}

}
