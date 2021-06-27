package lacos_de_decisao;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner valor = new Scanner(System.in);
		
		double num;
		
		System.out.println("==============================================");
		System.out.println("                   BEM-VINDO!                 ");
		System.out.println("==============================================");
		Thread.sleep(1300);
		
		System.out.print("Digite um algarismo: ");
		num = valor.nextInt();
		
		if(num%2 == 0){
			System.out.print("\nO número é PAR\nE o valor da sua RAIZ é: " + Math.sqrt(num));	
		} else {
			System.out.print("\nO número é IMPAR\nE o valor da POTENCIAÇÃO AO QUADRADO é: " + Math.pow(num, 2));	
		}
		
		System.out.println("\n==============================================");
		valor.close();
		
	}
}
