package aula02;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		int idade;
		
		System.out.printf("Digite sua idade: ");
		idade = id.nextInt();
		
		if(idade>=18){
			System.out.printf("\nVoc� se encontra na categoria ADULTO.");
		} else if(idade>=15 && idade<=17){
			System.out.printf("\nVoc� se encontra na categoria JUVENIL.");
		} else if(idade>=10 && idade<=14){
			System.out.printf("\nVoc� se encontra na categoria INFANTIL.");
			}else {System.out.printf("\nVALOR INV�LIDO!\nA pessoa da idade informada � muito nova.");}
		
		id.close();
		
	}
}
