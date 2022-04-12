
public class IndividualHolder extends AccountHolder implements Util{
	String name;
	String SSN;
	public IndividualHolder(int id, String add, String name, String ssn) {
		super(id,add);
		this.name=name;
		SSN=ssn;
	}
	public String getName() {
		return name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSSN(String ssn) {
		SSN=ssn;
	}
	public String convertNameUpperCase(String name) {
		return name.toUpperCase();
	}
}
