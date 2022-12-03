package CharacterPackage;

public class Person {

	private String fullName;
	private String phoneNumber;
	private String address;
	private String mail;
	private String jobTitle;
	
	//empty constructor
	public Person() {
		super();
		this.fullName = "";
		this.phoneNumber = "";
		this.address = "";
		this.mail = "";
		this.jobTitle = "";
	}

	
	//Full parameter constructor
	public Person(String fullName, String phoneNumber, String address, String mail, String jobTitle) {
		super();
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.mail = mail;
		this.jobTitle = jobTitle;
	}
	
	//Copy constructor
	public Person(Person person) {
		super();
		this.fullName = person.fullName;
		this.phoneNumber = person.phoneNumber;
		this.address = person.address;
		this.mail = person.mail;
		this.jobTitle = person.jobTitle;
	}


	//Setter and getter methods
	public String getFullName() {
		return fullName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public String getMail() {
		return mail;
	}


	public String getJobTitle() {
		return jobTitle;
	}

}
