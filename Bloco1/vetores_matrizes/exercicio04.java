package vetores_matrizes;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		
		double [][] m1 = new double[2][2];
		double [][] m2 = new double[2][2];
		double [][] mR = new double[2][2]; 
		int usuario = -1; 
		double constante;
		
		System.out.println("=====================================");
		System.out.println("              BEM-VINDO!            ");
		System.out.println("=====================================");
		Thread.sleep(1300);
		
		System.out.println("Digite a primeira MATRIZ 2x2 ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l+1, c+1);
				m1[l][c] = in.nextDouble();
			}
		}
		
		System.out.println("\nDigite a segunda MATRIZ 2x2 ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l+1, c+1);
				m2[l][c] = in.nextDouble();
			}
		}
		
		while(usuario!=0) {
			System.out.println("=====================================");
			System.out.println("O QUE QUER FAZER AGORA?");
			System.out.println("\n[1] Somar as matrizes\n[2] Subtrair primeira matriz da segunda"
				+ "\n[3] Adicionar uma constante as duas matrizes\n[4] Imprimir as matrizes\n[0] Finalizar programa");
			usuario = in.nextInt();
		
		System.out.println("\n=====================================");
		
			//primeira opção
		if (usuario == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m1[l][c] + m2[l][c];
				}
			}
			
			System.out.println("\nMatriz resultante da SOMA M1 + M2: ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
			
			//segunda opção
		}else if (usuario == 2) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m2[l][c] - m1[l][c];
				}
			}
			System.out.println("\nMatriz resultante da SUBTRAÇÃO M2 - M1: ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
			
			//terceira opção
		}else if (usuario == 3) {
			System.out.println("DIGITE A CONSTANTE: ");
			constante = in.nextDouble();
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m1[l][c] = m1[l][c] + constante;
					m2[l][c] = m2[l][c] + constante;
				}
			}
			System.out.println("\nMatrizes resultantes da ADIÇÃO DA CONSTANTE: ");
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
			
			//quarta opção
		}else if (usuario == 4) {
			System.out.println("          >> PRIMAIRA MATRIZ <<\n");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\n          >> SEGUNDA MATRIZ <<\n");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println();
				
			}
		}else if(usuario<0 || usuario>4){System.out.println("NÚMERO INVÁLIDO!");}
			else{System.out.println("Até Logo!");}
			Thread.sleep(3000);
		}
		
		in.close();
	}
}
