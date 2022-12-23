//	Created a class MCAAdmission having 
//	methods getAdmission() and totalAdmissions().

public class MCAAdmission {
	static int admissionCounter = 0;

//	On invoking getAdmission() on the object the total 	
	public void getAdmission() {
//		no of students admited to MCA should increase by one.
		admissionCounter++;
	}

//	totalAdmissions() to check how many admissions are full.
	public void totalAdmissions() {
		System.out.println("No of admissons done : " + admissionCounter);
	}
}
