package aula04;

import java.util.Scanner;

public class exercicio04 {
		
		public static void main(String[] args) {
			
			double [][] m1 = new double[2][2];
			double [][] m2 = new double[2][2];
			double [][] mR = new double[2][2]; 
			int usuario = -1; 
			double constante;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digite a primeira matriz 2 x 2: ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("[%d][%d] = ", l, c);
					m1[l][c] = in.nextDouble();
				}
			}
			

			System.out.println("\nDigite a segunda matriz 2x2: ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("[%d][%d] = ", l, c);
					m2[l][c] = in.nextDouble();
				}
			}
			
			while(usuario!=0) {
			System.out.println("\nO QUE QUER FAZER AGORA?");
			System.out.println("[1] Somar as matrizes\n[2] Subtrair primeira matriz da segunda"
					+ "\n[3] Adicionar uma constante as duas matrizes\n[4] Imprimir as matrizes\n[0] Finalizar programa");
			usuario = in.nextInt();
			
			
			if (usuario == 1) {
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						mR[l][c] = m1[l][c] + m2[l][c];
					}
				}
				
				System.out.println("\nMatriz resultante da soma (m1 + m2): ");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", mR[l][c]);
					}
					System.out.println();
				}
			}else if (usuario == 2) {
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						mR[l][c] = m2[l][c] - m1[l][c];
					}
				}
				System.out.println("\nMatriz resultante da subtração (m2 - m1): ");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", mR[l][c]);
					}
					System.out.println();
				}
			}else if (usuario == 3) {
				System.out.println("Digite a constante: ");
				constante = in.nextDouble();
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						m1[l][c] = m1[l][c] + constante;
						m2[l][c] = m2[l][c] + constante;
					}
				}
				System.out.println("\nMatrizes resultantes da adição da constante: ");
				System.out.println("M1:");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", m1[l][c]);
					}
					System.out.println();
				}
				System.out.println("\nM2:");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", m2[l][c]);
					}
					System.out.println();
				}
			}else if (usuario == 4) {
				System.out.println("M1:");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", m1[l][c]);
					}
					System.out.println();
				}
				System.out.println("\nM2:");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", m2[l][c]);
					}
					System.out.println();
				}
			}else if(usuario<0 || usuario>4){System.out.println("Número inválido!");}else{System.out.println("Até Logo!");}}
			
			in.close();
	}

}
