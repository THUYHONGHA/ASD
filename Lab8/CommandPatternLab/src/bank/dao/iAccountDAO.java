package bank.dao;

import java.util.Collection;
import bank.domain.Account;

public interface iAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
