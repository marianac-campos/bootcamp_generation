package aula04;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int soma=0, qntimpar=0;
		
		for(int i=0; i<=5; i++) {
			System.out.printf("Digite um valor: ");
			vetor[i] = n.nextInt();
			
			if(vetor[i]%2==0){
				soma+=vetor[i];
			}else{qntimpar++;}}
		
			System.out.printf("\nN�MEROS PARES: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2==0){System.out.printf("| %d |", vetor[i]);}}
			
			System.out.printf("\nN�MEROS IMPARES: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2!=0) {System.out.printf("| %d |", vetor[i]);}}
			
			System.out.printf("\nA SOMA dos n�meros PARES: %d", soma);
			System.out.printf("\nA QUANTIDADE de n�meros IMPARES: %d", qntimpar);
			
			n.close();
			
	}

}
