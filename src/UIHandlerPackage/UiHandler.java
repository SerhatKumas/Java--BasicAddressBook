package UIHandlerPackage;
import CharacterPackage.*;
import ControllerPackage.*;
import FakeDatabasePackage.FakeDatabase;

public class UiHandler {
	
	//ALL UI METHODS ARE GATHERED AROUND IN ONE CLASS

	private PhoneBookPersonController personController;
	private UserController userController;
	private FakeDatabase fakeDatabase;
	
	//empty constructor
	public UiHandler() {
		this.personController = null;
		this.userController = null;
		this.fakeDatabase = null;
	}
	
	//Full parameter constructor
	public UiHandler(PhoneBookPersonController personController,UserController userController, FakeDatabase fakeDatabase) {
		this.personController = personController;
		this.userController = userController;
		this.fakeDatabase = fakeDatabase;
	}
	
	//Copy constructor
	public UiHandler(UiHandler uiHandler) {
		this.personController = uiHandler.personController;
		this.userController = uiHandler.userController;
		this.fakeDatabase = uiHandler.fakeDatabase;
	}
	
	//Phone Book Person Methods
	public void addNewPersonToPhoneBook(String fullName, String phoneNumber, String address, String mail, String jobTitle, User user) {
		Person person = personController.createPerson(fullName, phoneNumber, address, mail, jobTitle);
		personController.addPersonToList(user, person);
	}
	
	public void displayAllPersonInPhoneBook(User user) {
		personController.displayAllPerson(user);
	}
	
	public void displayPersonInPhoneBook(Person person) {
		personController.displayPerson(person);
	}
	
	public void displayPersonInPhoneBookByFullName(User user,String fullName) {
		personController.displayPersonByFullName(user,fullName);
	}
	
	public void displayPersonInPhoneBookByPhoneNumber(User user,String phoneNumber) {
		personController.displayPersonByPhoneNumber(user,phoneNumber);
	}
	
	public void deletePersonFromPhoneBook(User user,Person person) {
		personController.deletePerson(user, person);
	}
	
	public void deletePersonFromPhoneBookByFullName(User user,String fullName) {
		personController.deletePersonrByFullName(user, fullName);
	}
	
	public void deletePersonFromPhoneBookByPhoneNumber(User user,String phoneNumber) {
		personController.deletePersonrByFullName(user, phoneNumber);
	}
	
	public void updatePersonInPhoneBook(User user, Person personOld, Person personUpdated) {
		personController.updatePerson(user, personOld, personUpdated);
	}
	
	public void updatePersonInPhoneBookByFullName(User user, String fullName, Person personUPerson) {
		personController.updatePersonByFullName(user, fullName, personUPerson);
	}
	
	public void updatePersonInPhoneBookByPhoneNumber(User user, String phoneNumber, Person personUPerson) {
		personController.updatePersonByPhoneNumber(user, phoneNumber, personUPerson);
	}
	
	public Person getPersonInThePhoneBookByFullName(User user,String fullName) {
		return personController.getPersonByFullName(user, fullName);
	}
	
	public Person  getPersonInThePhoneBookByPhoneNumber(User user,String phoneNumber) {
		return personController.getPersonByFullName(user, phoneNumber);
	}
	//Phone Book Person Methods
	
	//System User Methods
	public void addNewUserToSystem(String fullName, String phoneNumber, String address, String mail, String jobTitle) {
		User newUser = userController.createUser(fullName, phoneNumber, address, mail, jobTitle);
		userController.addUserToList(this.fakeDatabase, newUser);
	}
	
	public void displayAllUserInSystem() {
		userController.displayAllUsers(this.fakeDatabase);
	}
	
	public void displayUserInSystem(User user) {
		userController.displayUser(user);
	}
	
	public void displayUserInSystemByFullName(String fullName) {
		userController.displayUserByFullName(this.fakeDatabase,fullName);
	}
	
	public void displayUserInSystemByPhoneNumber(String phoneNumber) {
		userController.displayUserByPhoneNumber(this.fakeDatabase,phoneNumber);
	}
	
	public void deleteUserInSystem(User user) {
		userController.deleteUser(this.fakeDatabase, user);
	}
	
	public void deleteUserInSystemByFullName(String fullName) {
		userController.deleteUserByFullName(this.fakeDatabase,fullName);
	}
	
	public void deleteUserInSystemByPhoneNumber(String phoneNumber) {
		userController.deleteUserByPhoneNumber(this.fakeDatabase,phoneNumber);
	}
	
	public void updateUserInTheSystem(User userOld, User userUpdated) {
		userController.updateUser(this.fakeDatabase, userOld, userUpdated);
	}
	
	public void updateUserInTheSystemByFullName(String fullName, User userUpdated) {
		userController.updateUserByFullName(this.fakeDatabase, fullName, userUpdated);
	}
	
	public void updateUserInTheSystemByPhoneNumber(String phoneNumber, User userUpdated) {
		userController.updateUserByPhoneNumber(this.fakeDatabase, phoneNumber, userUpdated);
	}
	
	public User getUserInTheSystemByFullName(String fullName) {
		return userController.getUserByFullName(this.fakeDatabase, fullName);
	}
	
	public User  getUserInTheSystemByPhoneNumber(String phoneNumber) {
		return userController.getUserByPhoneNumber(this.fakeDatabase, phoneNumber);
	}
	//System User Methods
}


