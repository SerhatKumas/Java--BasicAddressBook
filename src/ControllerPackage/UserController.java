package ControllerPackage;

import java.util.LinkedList;
import java.util.List;

import CharacterPackage.Person;
import CharacterPackage.User;
import FakeDatabasePackage.FakeDatabase;

public class UserController {

	public void displayAllUsers(FakeDatabase fakeDatabase) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		for(User user: userListOfProgram) printUser(user);
	}
	
	public void displayUser(User user) {
		printUser(user);
	}
	
	public void displayUserByFullName(FakeDatabase fakeDatabase, String fullName) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		for(User user: userListOfProgram) if(user.getFullName().equals(fullName)) printUser(user);
	}
	
	public void displayUserByPhoneNumber(FakeDatabase fakeDatabase, String phoneNumber) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		for(User user: userListOfProgram) if(user.getPhoneNumber().equals(phoneNumber)) printUser(user);
	}
	
	public void deleteUser(FakeDatabase fakeDatabase,User user) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		boolean isRemoved = userListOfProgram.remove(user);
		if(isRemoved) fakeDatabase.setSystemUserList(userListOfProgram);
	}
	
	public void deleteUserByFullName(FakeDatabase fakeDatabase, String fullName) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		User deletingUser = null;
		for(User user: userListOfProgram) if(user.getFullName().equals(fullName)) printUser(user);
		boolean isRemoved = userListOfProgram.remove(deletingUser);
		if(isRemoved) fakeDatabase.setSystemUserList(userListOfProgram);
	}
	
	public void deleteUserByPhoneNumber(FakeDatabase fakeDatabase, String phoneNumber) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		User deletingUser = null;
		for(User user: userListOfProgram) if(user.getPhoneNumber().equals(phoneNumber)) printUser(user);
		boolean isRemoved = userListOfProgram.remove(deletingUser);
		if(isRemoved) fakeDatabase.setSystemUserList(userListOfProgram);
	}
	
	public void updateUser(FakeDatabase fakeDatabase,User userOld, User userUpdated) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		if(userListOfProgram.contains(userOld)) {
			int indexNumber = userListOfProgram.indexOf(userOld);
			boolean isRemoved = userListOfProgram.remove(userOld);
			if(isRemoved) {
				userListOfProgram.add(indexNumber,userUpdated);
				fakeDatabase.setSystemUserList(userListOfProgram);
			}
		}
	}
	
	public void updateUserByFullName(FakeDatabase fakeDatabase,String fullNameOldUser, User userUpdated) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		User willUpdate = null;
		for(User user : userListOfProgram) if(user.getFullName().equals(fullNameOldUser)) willUpdate=user;
		if(userListOfProgram.contains(willUpdate)) {
			int indexNumber = userListOfProgram.indexOf(willUpdate);
			boolean isRemoved = userListOfProgram.remove(willUpdate);
			if(isRemoved) {
				userListOfProgram.add(indexNumber,userUpdated);
			fakeDatabase.setSystemUserList(userListOfProgram);
			}
		}
	}
	
	public void updateUserByPhoneNumber(FakeDatabase fakeDatabase,String phoneNumberOldUser, User userUpdated) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		User willUpdate = null;
		for(User user : userListOfProgram) if(user.getPhoneNumber().equals(phoneNumberOldUser)) willUpdate=user;
		if(userListOfProgram.contains(willUpdate)) {
			int indexNumber = userListOfProgram.indexOf(willUpdate);
			boolean isRemoved = userListOfProgram.remove(willUpdate);
			if(isRemoved) {
				userListOfProgram.add(indexNumber,userUpdated);
			fakeDatabase.setSystemUserList(userListOfProgram);
			}
		}
	}
	
	public User getUserByFullName(FakeDatabase fakeDatabase,String userFullName) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		User returninUser = null;
		for(User user : userListOfProgram) if(user.getFullName().equals(userFullName)) returninUser=user;
		return returninUser;
	}
	
	public User getUserByPhoneNumber(FakeDatabase fakeDatabase,String userPhoneNumber) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		User returninUser = null;
		for(User user : userListOfProgram) if(user.getPhoneNumber().equals(userPhoneNumber)) returninUser=user;
		return returninUser;
	}
	
	public User createUser(String fullName, String phoneNumber, String address, String mail, String jobTitle) {
		User newUser = new User(fullName, phoneNumber, address, mail, jobTitle, new LinkedList<Person>());
		return newUser;
	}
	
	public void addUserToList(FakeDatabase fakeDatabase,User user) {
		List<User> userListOfProgram = fakeDatabase.getSystemUserList();
		userListOfProgram.add(user);
		fakeDatabase.setSystemUserList(userListOfProgram);
	}
	
	private void printUser(User user) {
		System.out.println("Full Name : " + user.getFullName() + "\n"
				+ "Phone Number : " + user.getPhoneNumber() + "\n"
						+ "Address : " + user.getAddress() + "\n"
								+ "Mail : " + user.getMail() + "\n"
										+ "Job Title : " + user.getJobTitle() + "\n"
												+ "Number of person, user has in their phone book : " + user.getAddressBookList().size());
	}
	 
}
