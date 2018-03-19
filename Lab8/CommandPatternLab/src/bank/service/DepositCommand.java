package bank.service;



public class DepositCommand implements iCommand{
	private iAccountService accountService;
	private long accountnumber;
	private double amount;
	
	public DepositCommand(iAccountService accountService,long accountnumber, double amount) {
		this.accountService=accountService;
		this.accountnumber=accountnumber;
		this.amount=amount;
	}

	public void execute() {
		accountService.deposit(accountnumber, amount);
		
	}

	public void unExecute() {
		accountService.withdraw(accountnumber, amount);		
	}

}
