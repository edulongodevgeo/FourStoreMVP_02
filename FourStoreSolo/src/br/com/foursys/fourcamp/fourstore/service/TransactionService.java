package br.com.foursys.fourcamp.fourstore.service;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;
import br.com.foursys.fourcamp.fourstore.model.Transaction;

public class TransactionService {

	ProductService productService = new ProductService();

	public boolean sell(Transaction transaction) {

		// multiplica valor do produto pela quantidade desejada
		
		/* transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
		 * transaction.getProduct().getQtt());*/
		 

		System.out.println("Carregando transa��o... \n");
		System.out.println("Informa��es das possibilidades de pagamento: \n");

		// Cria o Object "preco" e multiplica valor do produto pela quantidade desejada
		if (transaction.getPaymentMethod().equals(PaymentMethod.MONEY)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					- ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.10)));
			System.out.println("Valor da transa��o por DINHEIRO: R$" + transaction.getPaymentValue() + ", (10% de desconto).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.DEBITCARD)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					- ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.05)));
			System.out.println("Valor da transa��o por D�BITO-CARD: R$" + transaction.getPaymentValue() + ", (5% de desconto).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.CREDITCARD)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					+ ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.10)));
			System.out.println("Valor da transa��o por CR�DITO-CARD: R$" + transaction.getPaymentValue() + ", (10% de acr�scimo).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.PIX)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					+ ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.05)));
			System.out.println("Valor da transa��o por PIX: R$" + transaction.getPaymentValue() + ", (5% de acr�scimo).");
			//System.out.println();
		}
		
		
		System.out.println("=================================");
		System.out.println("RECIBO DE TRANSA��O");
		
		// verifica se getPrice deu certo
		if (transaction.getPaymentValue() == 0.0) {
			return false;
		} else {
			// remove do estoque
			if (productService.callRemove(transaction.getProduct())) {
				return true;
			} else {
				return false;
			}
		}

	}
	
	public String returnSellHistory(Transaction transaction) {
		String sellHistory = "Nenhuma venda no histórico ainda.";
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