package aula02;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		
	
		Scanner num = new Scanner(System.in);
		int num1, num2, num3, maior=0;
		
		System.out.printf("Digite o valor do primeiro número: ");
		num1 = num.nextInt();
		if(num1>maior) {maior = num1;}
		System.out.printf("Digite o valor do segundo número: ");
		num2 = num.nextInt();
		if(num2>maior) {maior = num2;}
		System.out.printf("Digite o valor do terceiro número: ");
		num3 = num.nextInt();
		if(num3>maior) {maior = num3;}
		
			System.out.printf("O número maior é " + maior);	
		
		num.close();	
	}

}
