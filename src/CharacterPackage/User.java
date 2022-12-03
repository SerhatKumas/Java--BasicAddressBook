package CharacterPackage;

import java.util.List;

public class User extends Person{

	//User has one more property than normal person which is phone book list to keeping records
	
	private List<Person> addressBookList;
	
	//empty constructor
	public User() {
		super();
		this.addressBookList = null;
	}
	//Copy constructor
	public User(User user) {
		super(user);
		this.addressBookList = user.addressBookList;
	}
	//Full parameter constructor
	public User(String fullName, String phoneNumber, String address, String mail, String jobTitle,List<Person> addressBookList) {
		super(fullName, phoneNumber, address, mail, jobTitle);
		this.addressBookList = addressBookList;	
	}
	
	//getter and setter methods
	public List<Person> getAddressBookList() {
		return addressBookList;
	}
	public void setAddressBookList(List<Person> addressBookList) {
		this.addressBookList = addressBookList;
	}
}

