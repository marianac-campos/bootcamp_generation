package aula03;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner main = new Scanner(System.in);
		int num, soma=0;
		double media=0;
		
		System.out.println("PARA PARAR O PROGRAMA DIGITE 0\n");
		
		do{System.out.printf("Digite um n�mero: ");
			num = main.nextInt();
			if(num!=0){
				soma+=num;
				media++;}
		}while(num!=0);
			
			System.out.printf("\nA M�DIA dos n�meros digitados � de: "+ soma/media);
			main.close();
	}

}
