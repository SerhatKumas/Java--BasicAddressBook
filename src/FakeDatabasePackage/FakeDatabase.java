package FakeDatabasePackage;

import java.util.List;

import CharacterPackage.User;

public class FakeDatabase {

	//USED AS A DATABASE
	
	private List<User> systemUserList;
	
	public FakeDatabase() {
		super();
		this.systemUserList = null;
	}
	public FakeDatabase(FakeDatabase fakeDatabase) {
		super();
		this.systemUserList = fakeDatabase.systemUserList;
	}
	public FakeDatabase(List<User> systemUserList) {
		super();
		this.systemUserList = systemUserList;	
	}
	public List<User> getSystemUserList() {
		return systemUserList;
	}
	public void setSystemUserList(List<User> systemUserList) {
		this.systemUserList = systemUserList;
	}
}
