package aula02;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		double num;
		
		System.out.printf("Digite um n�mero: ");
		num = valor.nextInt();
		
		if(num%2 == 0){
			System.out.printf("\nO n�mero � PAR\nE o valor da sua raiz �: " + Math.sqrt(num));	
		} else {
			System.out.printf("\nO n�mero � IMPAR\nE o valor da potencia��o �: " + Math.pow(num, 2));	
		}
		
		valor.close();
		
	}
}
