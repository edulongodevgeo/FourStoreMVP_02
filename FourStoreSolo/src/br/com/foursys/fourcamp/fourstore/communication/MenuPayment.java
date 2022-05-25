package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.enums.PaymentEnum;

public class MenuPayment {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	PaymentEnum choice = null;

	System.out.println("Selecione a opção desejada>>>"
			+"\n"
			+"\n |1-DINHEIRO |"
			+"\n |2-DÉBITO   |"
			+"\n |3-CRÉDITO  |"
			+"\n |4-PIX      |"
			+"\n");

	int forma = sc.nextInt();

	switch(forma)
	{
	
	case 1:
		choice = PaymentEnum.MONEY;
		break;
	case 2:
		choice = PaymentEnum.DEBITCARD;
		break;
	case 3:
		choice = PaymentEnum.CREDITCARD;
		break;
	case 4:
		choice = PaymentEnum.PIX;
		break;
	
	}
	
	System.out.println(choice);
		sc.close();}

}
