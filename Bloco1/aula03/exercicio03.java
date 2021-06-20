package aula03;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		int idade, menos=0, mais=0;
		
		System.out.printf("Digite uma idade: ");
		idade=id.nextInt();
		
		
		while(idade!=-99) {
			if(idade<21 && idade>0) {menos++;}else if(idade>50){mais++;}
				System.out.println("\nPARA PARAR DIGITE -99");
				System.out.printf("Digite uma outra idade: ");
					idade=id.nextInt();
		}
			
			System.out.printf("\nQUANTIDADE DE PESSOAS COM MENOS DE 20 ANOS: %d", menos);
			System.out.printf("\nQUANTIDADE DE PESSOAS COM MAIS DE 50 ANOS: %d", mais);
		id.close();
	}

}
