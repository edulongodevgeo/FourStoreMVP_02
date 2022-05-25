package br.com.foursys.fourcamp.fourstore.service;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.data.TransactionData;
import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;
import br.com.foursys.fourcamp.fourstore.model.Transaction;

public class TransactionService {

	ProductService productService = new ProductService();
	TransactionData transactionData = new TransactionData();
	
	public boolean sell(Transaction transaction) {

		// multiplica valor do produto pela quantidade desejada
		
		/* transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
		 * transaction.getProduct().getQtt());*/
		 

		System.out.println("Carregando transação... \n");
		System.out.println("Informações das possibilidades de pagamento: \n");

		// Cria o Object "preco" e multiplica valor do produto pela quantidade desejada
		if (transaction.getPaymentMethod().equals(PaymentMethod.MONEY)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					- ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.10)));
			System.out.println("Valor da transaï¿½ï¿½o por DINHEIRO: R$" + transaction.getPaymentValue() + ", (10% de desconto).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.DEBITCARD)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					- ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.05)));
			System.out.println("Valor da transaï¿½ï¿½o por Dï¿½BITO-CARD: R$" + transaction.getPaymentValue() + ", (5% de desconto).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.CREDITCARD)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					+ ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.10)));
			System.out.println("Valor da transaï¿½ï¿½o por CRï¿½DITO-CARD: R$" + transaction.getPaymentValue() + ", (10% de acrï¿½scimo).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.PIX)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					+ ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.05)));
			System.out.println("Valor da transaï¿½ï¿½o por PIX: R$" + transaction.getPaymentValue() + ", (5% de acrï¿½scimo).");
			//System.out.println();
		}
		
		
		
		
		System.out.println("=================================");
		System.out.println("RECIBO DE TRANSAï¿½ï¿½O");
		
		// verifica se getPrice deu certo
		if (transaction.getPaymentValue() == 0.0) {
			return false;
		} else {
			// remove do estoque
			if (productService.callRemove(transaction.getProduct())) {
				transactionData.save(transaction);
				return true;
			} else {
				return false;
			}
		}

	}
	
	public String returnSellHistory() {
		String sellHistory = "Nenhuma venda no histÃ³rico ainda.";
		List<Transaction> allSales = transactionData.listAll();

		if (allSales != null) {
			sellHistory = "";
			for (Transaction sale : allSales) {
				sellHistory += sale.toString() + "\n";
			}
		}

		return sellHistory;
	}

	public String saveSell(Transaction transaction) {
		String result = "Erro, item duplicado.";

		if (transactionData.save(transaction)) {
			result = "Adicionado no banco de dados com sucesso";
		}

		return result;
	}
	

}