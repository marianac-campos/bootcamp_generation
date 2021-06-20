package aula03;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {

		Scanner main = new Scanner(System.in);
		int num, soma=0;
		
		System.out.printf("Digite um algarimos: ");
		num = main.nextInt();
		
		if(num!=0){
		do{soma+=num;
			num--;
		}while(num!=0);
			System.out.printf("\nA soma dos números é: %d", soma);
		}else System.out.printf("\nSoma é 0"); 
	
		main.close();
	}
}
