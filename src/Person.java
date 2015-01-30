public class Person {

	private String name;
	private Integer ssn;
	private String phoneNum;

	public Person(String name, Integer ssn, String phoneNum) {
		this.setName(name);
		this.setSSN(ssn);
		this.setPhoneNum(phoneNum);
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String toString() {
		return "<" + getName() + " " + getSSN() + " " + getPhoneNum() + ">";
	}

}
