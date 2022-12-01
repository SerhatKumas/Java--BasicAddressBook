package CharacterPackage;

import java.util.List;

import ControllerPackage.UserController;

public class User extends Person{

	List<Person> addressBookList;
	UserController userController;
	public User() {
		super();
		this.addressBookList = null;
		this.userController = null;
	}
	public User(User user) {
		super(user);
		this.addressBookList = user.addressBookList;
		this.userController = user.userController;
		// TODO Auto-generated constructor stub
	}
	public User(String fullName, String phoneNumber, String address, String mail, String jobTitle,List<Person> addressBookList,UserController userController) {
		super(fullName, phoneNumber, address, mail, jobTitle);
		this.addressBookList = addressBookList;
		this.userController = userController;		
	}
	
}

