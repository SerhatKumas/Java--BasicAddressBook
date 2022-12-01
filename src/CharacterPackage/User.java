package CharacterPackage;

import java.util.List;

import ControllerPackage.PersonController;

public class User extends Person{

	List<Person> addressBookList;
	PersonController personController;
	
	public User() {
		super();
		this.addressBookList = null;
		this.personController = null;
	}
	public User(User user) {
		super(user);
		this.addressBookList = user.addressBookList;
		this.personController = user.personController;
	}
	public User(String fullName, String phoneNumber, String address, String mail, String jobTitle,List<Person> addressBookList,PersonController personController) {
		super(fullName, phoneNumber, address, mail, jobTitle);
		this.addressBookList = addressBookList;
		this.personController = personController;		
	}
	public List<Person> getAddressBookList() {
		return addressBookList;
	}
	public PersonController getPersonController() {
		return personController;
	}
	
}

