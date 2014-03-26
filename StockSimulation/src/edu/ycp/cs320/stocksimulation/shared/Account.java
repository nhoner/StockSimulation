package edu.ycp.cs320.stocksimulation.shared;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {
	private List<Transaction> transactionList;
	
	public Account() {
		this.transactionList = new ArrayList<Transaction>();
	}
	
	public void addTransaction(Transaction txn) {
		transactionList.add(txn);
	}
	
	public List<Transaction> getTransactionList() {
		return Collections.unmodifiableList(transactionList);
	}
}
