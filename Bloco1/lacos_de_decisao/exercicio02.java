package lacos_de_decisao;

import java.util.Scanner;

public class exercicio02 {
public static void main(String[] args) throws InterruptedException {
		
		Scanner num = new Scanner(System.in);
		
		int num1, num2, num3;
		int a, b, c;
		
		System.out.println("===================================================");
		System.out.println("                     BEM-VINDO!                    ");
		System.out.println("===================================================\n");
		Thread.sleep(1300);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = num.nextInt();
		a=num1;
			
		System.out.print("Digite o segundo n�mero: ");
		num2 = num.nextInt();
		b=num2;
			
		System.out.print("Digite o terceiro n�mero: ");
		num3 = num.nextInt();
		c=num3;			
			
			if(num1>num2 && num2>num3) {
				a=num1;
				b=num2;
				c=num3;
			} else if(num1>num2 && num2<num3 && num3<num1) {
				a=num1;
				b=num3;
				c=num2;
			} else if(num2>num1 && num1<num3 && num3<num2){
				a=num2;
				b=num3;
				c=num1;
			} else if(num2>num1 && num1>num3) {
				a=num2;
				b=num1;
				c=num3;
			} else if(num3>num2 && num2>num1) {
				a=num3;
				b=num2;
				c=num1;
			} else if(num3>num2 && num2<num1) {
				a=num3;
				b=num1;
				c=num2;
			}
			
			System.out.println("\n===================================================");
			System.out.printf("A ordem CRESCENTE dos n�meros �: %d, %d, %d", a, b, c);
			System.out.println("\n===================================================");
			
			num.close();
		
	}
}
