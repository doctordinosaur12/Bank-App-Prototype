
public class CorporateHolder extends AccountHolder {
	String contact;
	public CorporateHolder(int id, String add, String contact) {
		super(id,add);
		this.contact=contact;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact=contact;
	}
}
