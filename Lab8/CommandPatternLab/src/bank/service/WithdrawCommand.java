package bank.service;


public class WithdrawCommand implements iCommand{
	private iAccountService accountService;
	private long accountnumber;
	private double amount;
	
	public WithdrawCommand(iAccountService accountService,long accountnumber, double amount) {
		this.accountService=accountService;
		this.accountnumber=accountnumber;
		this.amount=amount;
	}

	public void execute() {
		accountService.withdraw(accountnumber, amount);
		
	}

	public void unExecute() {
		accountService.deposit(accountnumber, amount);		
	}

}
