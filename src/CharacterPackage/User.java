package CharacterPackage;

import java.util.List;

public class User extends Person{

	private List<Person> addressBookList;
	
	public User() {
		super();
		this.addressBookList = null;
	}
	public User(User user) {
		super(user);
		this.addressBookList = user.addressBookList;
	}
	public User(String fullName, String phoneNumber, String address, String mail, String jobTitle,List<Person> addressBookList) {
		super(fullName, phoneNumber, address, mail, jobTitle);
		this.addressBookList = addressBookList;	
	}
	public List<Person> getAddressBookList() {
		return addressBookList;
	}
	public void setAddressBookList(List<Person> addressBookList) {
		this.addressBookList = addressBookList;
	}
}

