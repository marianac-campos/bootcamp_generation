package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) throws InterruptedException {
		
			Scanner id = new Scanner(System.in);
			
			int idade, menos=0, mais=0;
			
			System.out.println("==================================");
			System.out.println("             BEM-VINDO!          ");
			System.out.println("==================================");
			Thread.sleep(1300);
			System.out.printf("\nPara começarmos, digite uma idade: ");
			idade=id.nextInt();
			
			
			while(idade!=-99) {
				if(idade<21 && idade>0){menos++;}
					else if(idade>50){mais++;}
						else if(idade>=21 && idade<=50){}
							else {System.out.println("IDADE INVÁLIDA!");}
				
				System.out.println("\n=== DIGITE -99 SE QUISER PARAR ===");
				System.out.print("Digite uma outra idade: ");
				idade=id.nextInt();
			}
				System.out.println("\n====================================================");
				System.out.printf("Quantidade de pessoas com MENOS de 21 anos: %d", menos);
				System.out.printf("\nQuantidade de pessoas com MAIS de 50 anos: %d", mais);
				
				id.close();
	}
}
