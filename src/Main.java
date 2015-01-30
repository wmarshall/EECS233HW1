public class Main {

	public static void main(String[] args) {
		Phonebook<String> byNameBook = new Phonebook<String>();
		Phonebook<Integer> bySSNBook = new Phonebook<Integer>();
		Person jDoe = new Person("John Doe", 123456789, "123-456-7890");
		byNameBook.addPerson(jDoe.getName(), jDoe);
		bySSNBook.addPerson(jDoe.getSSN(), jDoe);
		System.out.println("By Name = " + jDoe.getName() + ":"
				+ byNameBook.findPerson(jDoe.getName()));
		System.out.println("By SSN = " + jDoe.getSSN() + ":"
				+ bySSNBook.findPerson(jDoe.getSSN()));
	}

}
