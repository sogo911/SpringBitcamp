package com.bitcamp.web.domain;
 
import lombok.Data;
 
@Data
public class AccountDTO {
    private String 
        customerNum,
        accountNum,
        money,
        id;
 
    public String getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "계좌번호 [고객번호=" + customerNum 
                + ", 계좌번호=" + accountNum 
                + ", 잔액=" + money
                + ", 고객ID=" + id + "]";
    }
}