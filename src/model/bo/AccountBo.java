package model.bo;

import model.bean.Account;
import model.dao.AccountDao;

public class AccountBo {
	private AccountDao dao;
	public AccountBo() {
		dao = new AccountDao();
	}
	
	public boolean isExist(String username,String password){
		return dao.isExist(username, password);
	}
	
	public boolean save(Account account) {
		return dao.save(account);
	}
}
