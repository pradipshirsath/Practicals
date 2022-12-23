public class Demo {
	public static void main(String[] args) {
//		Created multiple objects of MCAAdmissions class.
		MCAAdmission mcaAdmissionObj1 = new MCAAdmission();
		MCAAdmission mcaAdmissionObj2 = new MCAAdmission();
		
//		On invoking getAdmission() on the object the total 
//		no of students admited to MCA should increase by one. 
		mcaAdmissionObj1.getAdmission();
		mcaAdmissionObj2.getAdmission();
		mcaAdmissionObj1.getAdmission();
		mcaAdmissionObj2.getAdmission();
//		Used totalAdmissions() to check how many admissions are full.
		mcaAdmissionObj1.totalAdmissions();
		
		mcaAdmissionObj1.getAdmission();
		mcaAdmissionObj2.getAdmission();
		mcaAdmissionObj2.getAdmission();
		mcaAdmissionObj1.getAdmission();
		mcaAdmissionObj2.getAdmission();
		mcaAdmissionObj2.totalAdmissions();
	}

}
