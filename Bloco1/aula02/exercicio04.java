package aula02;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		double num;
		
		System.out.printf("Digite um número: ");
		num = valor.nextInt();
		
		if(num%2 == 0){
			System.out.printf("\nO número é PAR\nE o valor da sua raiz é: " + Math.sqrt(num));	
		} else {
			System.out.printf("\nO número é IMPAR\nE o valor da potenciação é: " + Math.pow(num, 2));	
		}
		
		valor.close();
		
	}
}
