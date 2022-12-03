package ManualTestPackage;

import UIHandlerPackage.UiHandler;

import java.util.LinkedList;

import CharacterPackage.*;
import ControllerPackage.*;
import FakeDatabasePackage.FakeDatabase;

public class Main {
	
	public static void main(String[] args) {
		
		FakeDatabase fakeDatabase = new FakeDatabase(new LinkedList<User>());
		UserController userConroller = new UserController();
		PhoneBookPersonController personController = new PhoneBookPersonController();
		UiHandler userInteraction = new UiHandler(personController,userConroller,fakeDatabase);
		
		userInteraction.addNewUserToSystem("Serhat Kumas", "12312312312", "New York", "serhat@gmail.com", "Software Engineer");
		userInteraction.addNewUserToSystem("user1", "45645645645", "Washington", "user1@gmail.com", "Ceo");
		userInteraction.addNewUserToSystem("user2", "78978978978", "Los Angeles", "user2@gmail.com", "Manager");
		userInteraction.addNewUserToSystem("user3", "01201201201", "Miami", "user3@gmail.com", "Bussiness");
		
		userInteraction.displayAllUserInSystem();
		
		User userParam = userInteraction.getUserInTheSystemByFullName("Serhat Kumas");
		
		userInteraction.addNewPersonToPhoneBook("person1", "45645645645", "Washington", "person1@gmail.com", "Ceo", userParam);
		userInteraction.addNewPersonToPhoneBook("person2", "45645645645", "Turkey", "person2@gmail.com", "Ceo", userParam);
		userInteraction.addNewPersonToPhoneBook("person3", "45645645645", "Canada", "person3@gmail.com", "Ceo", userParam);
		userInteraction.addNewPersonToPhoneBook("person4", "45645645645", "Spain", "person4@gmail.com", "Ceo", userParam);
		
		userInteraction.displayAllPersonInPhoneBook(userParam);
		
		userInteraction.updateUserInTheSystem(userParam, new User("Serhat Kumas1", "12312312312", "New York", "serhat@gmail.com", "Software Engineer", userParam.getAddressBookList()));
		
		userInteraction.displayAllUserInSystem();
		
		System.err.println("---------------------------------");
		
		userInteraction.deleteUserInSystemByFullName("Serhat Kumas1");
		
		userInteraction.displayAllUserInSystem();
	}
}
