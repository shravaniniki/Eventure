package Inheritance;

class Hospital{
	private String name;
	private long phNo;
	private Doctor doctor;
	

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}

class Doctor{
	private String doctorName;
	private int id;
	private int yearsOfExperience;
	private String Specialization;
	
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	
}

class Patient{
	private int tokenNo;
	private String patientName;
	private String diagnosis;
	private Doctor doctor;
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void assignDoctor(Doctor doctor,String diagnosis) {
		if(diagnosis== doctor.getSpecialization()) {
			System.out.print("Doctor has been assigned to patient");
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
