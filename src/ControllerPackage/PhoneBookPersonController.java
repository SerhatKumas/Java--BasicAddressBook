package ControllerPackage;

import java.util.List;

import CharacterPackage.*;

public class PhoneBookPersonController {


	public void displayPerson(Person person) {
		printPerson(person);
	}
	
	public void displayAllPerson(User user) {
		List<Person> phoneBookList = user.getAddressBookList();
		for(Person person : phoneBookList) printPerson(person);
	}
	
	public void displayPersonByFullName(User user, String fullName) {
		List<Person> phoneBookList = user.getAddressBookList();
		for(Person person : phoneBookList) if(person.getFullName().equals(fullName)) printPerson(person);
	}
	
	public void displayPersonByPhoneNumber(User user, String phoneNumber) {
		List<Person> phoneBookList = user.getAddressBookList();
		for(Person person : phoneBookList) if(person.getPhoneNumber().equals(phoneNumber)) printPerson(person);
	}
	
	public void deletePerson(User user,Person person) {
		List<Person> phoneBookList = user.getAddressBookList();
		boolean isRemoved = phoneBookList.remove(person);
		if(isRemoved) user.setAddressBookList(phoneBookList);
	}
	
	public void deletePersonrByFullName(User user, String fullName) {
		List<Person> phoneBookList = user.getAddressBookList();
		Person deletedPerson =null;
		for(Person person : phoneBookList) if(person.getFullName().equals(fullName)) deletedPerson = person;
		boolean isRemoved = phoneBookList.remove(deletedPerson);
		if(isRemoved) user.setAddressBookList(phoneBookList);
	}
	
	public void deletePersonByPhoneNumber(User user, String phoneNumber) {
		List<Person> phoneBookList = user.getAddressBookList();
		Person deletedPerson =null;
		for(Person person : phoneBookList) if(person.getPhoneNumber().equals(phoneNumber)) deletedPerson = person;
		boolean isRemoved = phoneBookList.remove(deletedPerson);
		if(isRemoved) user.setAddressBookList(phoneBookList);
	}
	
	public void updatePerson(User user,Person personOld, Person personUpdated) {
		List<Person> phoneBookList = user.getAddressBookList();
		if(phoneBookList.contains(personOld)) {
			int indexNumber = phoneBookList.indexOf(personOld);
			boolean isRemoved = phoneBookList.remove(personOld);
			if(isRemoved) {
			phoneBookList.add(indexNumber,personUpdated);
			user.setAddressBookList(phoneBookList);
			}
		}
	}
	
	public void updatePersonByFullName(User user,String fullNameOldPerson, Person personUpdated) {
		List<Person> phoneBookList = user.getAddressBookList();
		Person willUpdate = null;
		for(Person person : phoneBookList) if(person.getFullName().equals(fullNameOldPerson)) willUpdate=person;
		if(phoneBookList.contains(willUpdate)) {
			int indexNumber = phoneBookList.indexOf(willUpdate);
			boolean isRemoved = phoneBookList.remove(willUpdate);
			if(isRemoved) {
			phoneBookList.add(indexNumber,personUpdated);
			user.setAddressBookList(phoneBookList);
			}
		}
	}
	
	public void updatePersonByPhoneNumber(User user,String phoneNumberOldPerson, Person personUpdated) {
		List<Person> phoneBookList = user.getAddressBookList();
		Person willUpdate = null;
		for(Person person : phoneBookList) if(person.getPhoneNumber().equals(phoneNumberOldPerson)) willUpdate=person;
		if(phoneBookList.contains(willUpdate)) {
			int indexNumber = phoneBookList.indexOf(willUpdate);
			boolean isRemoved = phoneBookList.remove(willUpdate);
			if(isRemoved) {
			phoneBookList.add(indexNumber,personUpdated);
			user.setAddressBookList(phoneBookList);
			}
		}
	}
	
	public Person getPersonByFullName(User user,String personFullName) {
		List<Person> phoneBookList = user.getAddressBookList();
		Person returningPerson = null;
		for(Person person : phoneBookList) if(person.getFullName().equals(personFullName)) returningPerson=person;
		return returningPerson;
	}
	
	public Person  getPersonByPhoneNumber(User user,String personPhoneNumber) {
		List<Person> phoneBookList = user.getAddressBookList();
		Person returningPerson = null;
		for(Person person : phoneBookList) if(person.getPhoneNumber().equals(personPhoneNumber)) returningPerson=person;
		return returningPerson;
	}
	
	public Person createPerson(String fullName, String phoneNumber, String address, String mail, String jobTitle) {
		Person newPerson = new Person(fullName, phoneNumber, address, mail, jobTitle);
		return newPerson;
		
	}
	
	public void addPersonToList(User user,Person person) {
		List<Person> phoneBookList = user.getAddressBookList();
		phoneBookList.add(person);
		user.setAddressBookList(phoneBookList);
	}
	
	private void printPerson(Person person) {
		System.out.println("Full Name : " + person.getFullName() + "\n"
				+ "Phone Number : " + person.getPhoneNumber() + "\n"
						+ "Address : " + person.getAddress() + "\n"
								+ "Mail : " + person.getMail() + "\n"
										+ "Job Title : " + person.getJobTitle() + "\n");
	}
	
}
