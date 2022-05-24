package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;
import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.model.Transaction;
import br.com.foursys.fourcamp.fourstore.service.TransactionService;

public class TransactionController {

	// cria objeto de transaction service
	TransactionService transactionService = new TransactionService();

	public String sell(String sku, Integer qtt, String CPF, Integer paymentMethod, String paymentData) {
		String result = "";
		
		//muda CPF para não informado caso usuário digite 0
		if(CPF.equals("0")) {
			CPF = "Não informado.";
		}
		
		
		PaymentMethod updatedPayment = updatePayment(paymentMethod);
		//se pagamento for dinheiro
		if(paymentMethod == 1) {
			paymentData = "Pagamento feito em dinheiro.";
		}
		
		//cria produto (sku e quantidade)
		Product product = new Product(sku, qtt);
		
		//cria objeto com os dados digitados pelo usuário
		Transaction transaction = new Transaction(updatedPayment, paymentData, 0.0, CPF, product);

		//chama método da venda do objeto criado
		if(transactionService.sell(transaction)) {
			result = "Compra efetuada com sucesso.";
			System.out.println(transaction);
			System.out.println("");
			System.out.println("");
		}else {
			result = "Falha na compra, estoque insuficiente ou produto inexistente.";
		}
		
		return result;
	}
	
	
	//A DEFINIR
	public PaymentMethod updatePayment(Integer paymentMethod) {
		
		PaymentMethod updatedPayment = null;
		
		switch(paymentMethod) {	
		case 1:
			updatedPayment = PaymentMethod.MONEY;
			break;
		case 2:
			updatedPayment = PaymentMethod.DEBITCARD;
			break;
		case 3:
			updatedPayment = PaymentMethod.CREDITCARD;
			break;
		case 4:
			updatedPayment = PaymentMethod.PIX;
			break;
		}
		return updatedPayment;
		
	}
	
	public String getPaymentData(Integer paymentMethod) {
		String result = null;
		
		switch(paymentMethod) {	
		case 1:
			result = "Compra em dinheiro, digite qualquer coisa para continuar.";
			break;
		case 2:
			result = "Cartão de débito, favor inserir os dados do cartão.";
			break;
		case 3:
			result = "Cartão de crédito, favor inserir os dados do cartão.";
			break;
		case 4:
			result = "Pix, favor inserir os dados do seu pix.";
			break;
		default:
			result = "erro";
		}
		return result;
	}
	
}
