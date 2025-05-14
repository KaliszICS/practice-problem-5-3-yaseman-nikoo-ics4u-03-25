class ChequingAccount extends BankAccount {

	protected int pinNumber;
	
	public ChequingAccount(double accountBalance, int accountNumber, double money, int pinNumber) {
		super(accountBalance, accountNumber);
		this.accountBalance = money;
		this.pinNumber = pinNumber;
	}
	
	public ChequingAccount(double accountBalance, int accountNumber, int pinNumber) { //default balance
		super(accountBalance, accountNumber);
		this.accountBalance = 0;
		this.pinNumber = pinNumber;
	}

	@Override
	public boolean pin(int pin) { //check if the pin is correct
		if (pinNumber == pin) {
			return true;
		}
		return false;
	}
}