public class PatientDetails {
	String patientId;
	String patientName;
	int patientAge; 
	String patientGender;
	long patientAadharCardNumber;
	long patientContactNumber;
	String patientCity;
	String patientAddress;
	String patientDateOfAdmission;
	String guardiansName; 
	String guardiansAddress;
	long guardiansContactNumber;
	public PatientDetails(String patientId, String patientName, int patientAge, String patientGender,
long patientAadharCardNumber, long patientContactNumber, String patientCity, String patientAddress,String patientDateOfAdmission, String guardiansName, String guardiansAddress, long guardiansContactNumber) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientAadharCardNumber = patientAadharCardNumber;
		this.patientContactNumber = patientContactNumber;
		this.patientCity = patientCity;
		this.patientAddress = patientAddress;
		this.patientDateOfAdmission = patientDateOfAdmission;
		this.guardiansName = guardiansName;
		this.guardiansAddress = guardiansAddress;
		this.guardiansContactNumber = guardiansContactNumber;
	}
	public String getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public long getPatientAadharCardNumber() {
		return patientAadharCardNumber;
	}
	public long getPatientContactNumber() {
		return patientContactNumber;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public String getPatientDateOfAdmission() {
		return patientDateOfAdmission;
	}
	public String getGuardiansName() {
		return guardiansName;
	}
	public String getGuardiansAddress() {
		return guardiansAddress;
	}
	public long getGuardiansContactNumber() {
		return guardiansContactNumber;
	}
	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientGender=" + patientGender + ", patientAadharCardNumber=" + patientAadharCardNumber
				+ ", patientContactNumber=" + patientContactNumber + ", patientCity=" + patientCity
				+ ", patientAddress=" + patientAddress + ", patientDateOfAdmission=" + patientDateOfAdmission
				+ ", guardiansName=" + guardiansName + ", guardiansAddress=" + guardiansAddress
				+ ", guardiansContactNumber=" + guardiansContactNumber + "]";
	}
	
}