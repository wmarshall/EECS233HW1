import java.util.HashMap;



public class Phonebook<T> {
	
	private HashMap<T, Person> map = new HashMap<T,Person>();
	
	public Person findPerson(T id){
		return map.get(id);
	}
	
	public void addPerson(T id, Person person){
		map.put(id, person);
	}
	
	public void deletePerson(T id){
		map.remove(id);
	}

}
