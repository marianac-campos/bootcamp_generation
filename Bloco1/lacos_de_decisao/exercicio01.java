package lacos_de_decisao;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) throws InterruptedException {
				
		Scanner num = new Scanner(System.in);
		
		int num1, num2, num3, maior=0;
		
		System.out.println("==================================");
		System.out.println("             BEM-VINDO!          ");
		System.out.println("==================================");
		Thread.sleep(1300);
		
		System.out.print("\n=> Digite o primeiro n�mero: ");
		num1 = num.nextInt();
			if(num1>maior) {maior = num1;}
		
		System.out.print("=> Digite o segundo n�mero: ");
		num2 = num.nextInt();
			if(num2>maior) {maior = num2;}
		
		System.out.print("=> Digite o terceiro n�mero: ");
		num3 = num.nextInt();
			if(num3>maior) {maior = num3;}
		
		System.out.println("\n==================================");
		System.out.println("       O MAIOR N�MERO � " + maior);	
		System.out.println("==================================");
		
		num.close();	
	}
}
