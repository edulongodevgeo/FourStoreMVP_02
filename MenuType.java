package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.enums.TypeProduct;

public class MenuType {
	public static void main(String[] args) {
		TypeProduct choice = null;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a opção desejada>>>"
				+"\n 1-VERÃO"
				+"\n 2-INVERNO"
				+"\n 3-OUTONO"
				+"\n 4-PRIMAVERA"
				+"\n 5-OUTROS");
		
		int forma = sc.nextInt();
		
		switch (forma) {
		
		case 1:
			choice = TypeProduct.SUMMER;
			break;
		case 2:
			choice = TypeProduct.WINTER;
			break;
		case 3:
			choice = TypeProduct.AUTUMN;
			break;
		case 4:
			choice = TypeProduct.SPRING;
			break;
		case 5:
			choice = TypeProduct.OTHERS;
			break;
		}
		
		
		sc.close();

	}
}

