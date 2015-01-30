public class Person {

	private String name;
	private Integer ssn;

	public Person(String name, Integer ssn) {
		this.setName(name);
		this.setSSN(ssn);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSSN() {
		return ssn;
	}

	public void setSSN(Integer ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		return "<" + getName() + " " + getSSN() + ">";
	}

}
