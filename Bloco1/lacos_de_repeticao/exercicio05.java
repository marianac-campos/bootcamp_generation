package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("=================================");
		System.out.println("            BEM-VINDO!          ");
		System.out.println("=================================");
		Thread.sleep(1300);
		
		System.out.print("\nDigite um algarimos: ");
		num = in.nextInt();
		
		do{
			soma+=num;
			
			System.out.println("\n==== DIGITE 0 PARA FINALIZAR ====");
			System.out.print("Digite outro algarimos: ");
			num = in.nextInt();
				
		}while(num!=0);
		
		System.out.println("\n=================================");
		System.out.printf("A SOMA dos números é: %d", soma);
		System.out.println("\n=================================");
		
		in.close();
	}
}
