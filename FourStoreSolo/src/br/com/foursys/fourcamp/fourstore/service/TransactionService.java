package br.com.foursys.fourcamp.fourstore.service;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;
import br.com.foursys.fourcamp.fourstore.model.Transaction;

public class TransactionService {

	ProductService productService = new ProductService();

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
			System.out.println("Valor da transação por DINHEIRO: R$" + transaction.getPaymentValue() + ", (10% de desconto).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.DEBITCARD)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					- ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.05)));
			System.out.println("Valor da transação por DÉBITO-CARD: R$" + transaction.getPaymentValue() + ", (5% de desconto).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.CREDITCARD)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					+ ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.10)));
			System.out.println("Valor da transação por CRÉDITO-CARD: R$" + transaction.getPaymentValue() + ", (10% de acréscimo).");
			//System.out.println();
		}
		if (transaction.getPaymentMethod().equals(PaymentMethod.PIX)) {
			transaction.setPaymentValue(productService.getPrice(transaction.getProduct())
					* transaction.getProduct().getQtt()
					+ ((productService.getPrice(transaction.getProduct()) * transaction.getProduct().getQtt() * 0.05)));
			System.out.println("Valor da transação por PIX: R$" + transaction.getPaymentValue() + ", (5% de acréscimo).");
			//System.out.println();
		}
		
		
		System.out.println("=================================");
		System.out.println("RECIBO DE TRANSAÇÃO");
		
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

}