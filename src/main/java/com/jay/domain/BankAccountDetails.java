package com.jay.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "bank_account_details")
public class BankAccountDetails {
	@Id
	@Column(name = "ACCOUNT_ID")
	private int accountId;

	@Column(name = "BALANCE_AMOUNT")
	private int balanceAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_TRANSACTION_TS")
	private Date lastTransactionTimestamp;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getLastTransactionTimestamp() {
		return lastTransactionTimestamp;
	}

	public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {
		this.lastTransactionTimestamp = lastTransactionTimestamp;
	}
}
