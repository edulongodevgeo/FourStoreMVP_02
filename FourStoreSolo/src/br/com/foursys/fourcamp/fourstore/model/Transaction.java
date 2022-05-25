package br.com.foursys.fourcamp.fourstore.model;
import java.util.UUID;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;

public class Transaction {
    private UUID idTransaction;
    private PaymentMethod paymentMethod;
    private String paymentData;
    private Double paymentValue;
    private String cpf;
    private Product product;
    //private ArrayList<Product> productList;
    
    
    
    public Transaction(PaymentMethod paymentMethod, String paymentData, Double paymentValue, String cpf, Product product) {
        this.idTransaction = UUID.randomUUID();
        this.paymentMethod = paymentMethod;
        this.paymentData = paymentData;
        this.paymentValue = paymentValue;
        this.cpf = cpf;
        this.product = product;
    }
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentData() {
        return paymentData;
    }
    public void setPaymentData(String paymentData) {
        this.paymentData = paymentData;
    }
    public Double getPaymentValue() {
        return paymentValue;
    }
    public Object setPaymentValue(Double paymentValue) {
        return this.paymentValue = paymentValue;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /*
    public ArrayList<Product> getProductList() {
        return productList;
    }
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    */
    
    public UUID getIdTransaction() {
        return idTransaction;
    }
    @Override
    public String toString() {
        return "Transação id : " + idTransaction
        		+ "\n--------------------------------------"
                + "\nMétodo de pagamento: " + paymentMethod
                + "\n--------------------------------------"
                + "\nDados do pagamento: " + paymentData
                + "\nValor pago: " + paymentValue
                + "\nCPF cliente: " + cpf;
    }
}