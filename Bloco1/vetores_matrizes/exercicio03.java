package vetores_matrizes;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner m = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int cont=0;
		
		System.out.println("============================================");
		System.out.println("             MONTANDO UMA MATRIZ            ");
		System.out.println("============================================");
		Thread.sleep(1300);		
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.printf("Digite o valor da linha [%d] e da coluna [%d]: ", l+1, c+1);
				matriz[l][c] = m.nextInt();
				
				if(matriz[l][c]>10){cont++;}
			}}
		
		System.out.println("============================================\n");
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++){System.out.printf(" | %d |", matriz[l][c]);
		}System.out.println("");}
				
		System.out.printf("\nHá %d números maiores que 10 na matriz.", cont);
		System.out.println("\n============================================");		
		m.close();
	}
}
