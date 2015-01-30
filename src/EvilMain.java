public class EvilMain {
	public static void main(String[] args) {
		Phonebook<String> byNameBook = new Phonebook<String>();
		Phonebook<Integer> bySSNBook = new Phonebook<Integer>();
		Person jDoe = new Person("John Doe", 123456789, "1234-456-7890");
		byNameBook.addPerson(jDoe.getSSN(), jDoe);
	}
}
