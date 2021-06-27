package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner	in = new Scanner(System.in);
		
		int num, soma=0;
		double media=0;
		
		System.out.println("=================================");
		System.out.println("            BEM-VINDO!          ");
		System.out.println(" PARA PARAR O PROGRAMA DIGITE 0 ");
		System.out.println("=================================");
		Thread.sleep(1300);
		
		do{
			System.out.print("\nDigite um algarismo: ");
			num = in.nextInt();
				if(num%3==0 && num!=0){
					soma+=num;
					media++;}
		}while(num!=0);
			
			System.out.println("\n=================================");
			System.out.print("\nA MÉDIA dos números digitados MÚLTIPLOS DE 3 é de: " + soma/media + "\n");
			in.close();
	}

}
