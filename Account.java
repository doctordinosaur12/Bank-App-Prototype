
public class Account {
	AccountHolder holder;
	double balance =0;
	public Account(AccountHolder holder,double balance) {
		this.holder=holder;
		this.balance=balance;
	}
	public void deposit(double amt) {
		balance+=amt;
	}
	public void withdraw(double amt) {
		balance-=amt;
	}
	public double getBalance() {
		return balance;
	}
	public AccountHolder getAccountHolder() {
		return holder;
	}
	public void setBalance(double amt) {
		balance=amt;
	}
	public void setAccountHolder(AccountHolder holder) {
		this.holder=holder;
	}
}
