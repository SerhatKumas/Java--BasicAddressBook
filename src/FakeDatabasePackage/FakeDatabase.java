package FakeDatabasePackage;

import ControllerPackage.UserController;

import java.util.List;

import CharacterPackage.Person;

public class FakeDatabase {

	List<Person> systemUserList;
	UserController userController;
	
	public FakeDatabase() {
		super();
		this.systemUserList = null;
		this.userController = null;
	}
	public FakeDatabase(FakeDatabase fakeDatabase) {
		super();
		this.systemUserList = fakeDatabase.systemUserList;
		this.userController = fakeDatabase.userController;
	}
	public FakeDatabase(List<Person> systemUserList,UserController userController) {
		super();
		this.systemUserList = systemUserList;
		this.userController = userController;	
	}
	public List<Person> getSystemUserList() {
		return systemUserList;
	}
	public UserController getUserController() {
		return userController;
	}
	
}
