package aula02;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.printf("Digite o valor do primeiro número: ");
		num1 = num.nextInt();
		System.out.printf("Digite o valor do segundo número: ");
		num2 = num.nextInt();
		System.out.printf("Digite o valor do terceiro número: ");
		num3 = num.nextInt();
		
		if(num1<num2 && num2<num3) {
			System.out.println("\nA ordem crescente dos números");
			System.out.printf(num1 + ", " + num2 +", " + num3);
		} else if(num1<num2 && num3<num2) {
			System.out.println("A ordem crescente dos números");
			System.out.printf(num1 + ", " + num3 +", " + num2);
		} else if(num2<num1 && num1<num3) {
			System.out.println("A ordem crescente dos números é");
			System.out.printf(num2 + ", " + num1 +", " + num3);
		} else if(num2<num1 && num3<num1) {
			System.out.println("A ordem crescente dos números é");
			System.out.printf(num2 + ", " + num3 +", " + num1);
		} else if(num3<num1 && num1<num2) {
			System.out.println("A ordem crescente dos números é");
			System.out.printf(num3 + ", " + num1 +", " + num3);
		} else if(num3<num1 && num2<num1) {
			System.out.println("A ordem crescente dos números é");
			System.out.printf(num3 + ", " + num2 +", " + num1);
		} else {System.out.printf("Erro ao retornar a ordem dos números: %d, %d, %d\n", num1, num2, num3);}
		
		num.close();
		
	}
}
