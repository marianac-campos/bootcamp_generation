package vetores_matrizes;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner n = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int soma=0, qntimpar=0;
		
		System.out.println("=================================");
		System.out.println("            BEM-VINDO!          ");
		System.out.println("=================================");
		Thread.sleep(1300);
		
		for(int i=0; i<=5; i++) {
			System.out.printf("Digite um valor: ");
			vetor[i] = n.nextInt();
			
			if(vetor[i]%2==0){
				soma+=vetor[i];
			}else{qntimpar++;}}
			
			System.out.print("\nNÚMEROS PARES: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2==0){System.out.printf("| %d |", vetor[i]);}}
			
			System.out.print("\nNÚMEROS IMPARES: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2!=0) {System.out.printf("| %d |", vetor[i]);}}
			
			System.out.print("\n=================================");
			System.out.printf("\nSOMA dos números PARES: %d", soma);
			System.out.printf("\nQUANTIDADE de números IMPARES: %d", qntimpar);
			System.out.println("\n=================================");
			
			n.close();
			
	}
}
