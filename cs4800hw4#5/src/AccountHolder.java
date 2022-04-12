import java.util.concurrent.ThreadLocalRandom;
public abstract class AccountHolder {
protected int ID;
protected String address;

	public AccountHolder(int id, String add) {
		ID=id;
		address=add;
	}
	public int getNextInt(){
		return ThreadLocalRandom.current().nextInt(0, 1000000 + 1);
	}
}
