package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Transaction;

public class TransactionData {

	private static List<Transaction> transactionList = new ArrayList<Transaction>();

	public boolean save(Transaction transaction) {

		transactionList.add(transaction);
		//System.out.println("");
		return true;
	}

	public List<Transaction> listAll() {
		return transactionList;
	}

}
