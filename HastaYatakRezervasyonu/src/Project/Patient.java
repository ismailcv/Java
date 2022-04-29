package Project;


public class Patient {
	
	// burada hastalar array listesine yazdýrma iþlemini gerçekleþtirdim.
	public String toString(){ 
		  return name+" "+surname+" "+" "+age+" "+gender+" "+phoneNum+" "+disease;  
	}	
		
	private String name;
	private String surname;
	private int age;
	private String gender;
	private String phoneNum;
	private String disease;
	
	//constructor oluþturdum ve buraya almak istediðim deðiþkenleri yazdým.
	public Patient(String name, String surname, int age, String gender, String phoneNum, String disease) {
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.disease = disease;
	}
	
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
}