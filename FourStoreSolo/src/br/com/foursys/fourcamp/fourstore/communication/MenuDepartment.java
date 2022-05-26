package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.enums.DepartmentEnum;


public class MenuDepartment {
	
	public static void main(String[] args) {
		DepartmentEnum choice = null;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a opção desejada>>>"
				+"\n 1-Vestuário"
				+"\n 2-Calçados"
				+"\n 3-Perfumaria"
				+"\n 4-Acessorios");
		
		int forma = sc.nextInt();
		
		switch (forma) {
		
		case 1:
			choice = DepartmentEnum.CLO;
			break;
		case 2:
			choice = DepartmentEnum.SHO;
			break;
		case 3:
			choice = DepartmentEnum.PER;
			break;
		case 4:
			choice = DepartmentEnum.ACC;
			break;
		
		}
		
		
		sc.close();

	}
}



