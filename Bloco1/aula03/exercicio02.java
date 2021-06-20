package aula03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n1, par=0, impar=0;
		for(int i=0;i<10;i++) {
			System.out.printf("Digite um valor: ");
			n1 = num.nextInt();
			
			if(n1%2==0) {par++;
			} else {impar++;}
					
		}
				System.out.printf("\nA quantidade de números PAR foram de: %d", par);
				System.out.printf("\nE IMPAR foram de: %d", impar);
				num.close();
	}
}
