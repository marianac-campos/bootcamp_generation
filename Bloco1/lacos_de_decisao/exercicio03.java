package lacos_de_decisao;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner id = new Scanner(System.in);
		
		int idade=0;
		
		System.out.println("==================================");
		System.out.println("             BEM-VINDO!           ");
		System.out.println("==================================");
		Thread.sleep(1300);
		System.out.println("SE QUISER SAIR DIGITE UM VALOR >=10");
		Thread.sleep(1300);
		
		while(idade<10){
		System.out.print("\nDigite sua idade: ");
		idade = id.nextInt();
		
		if(idade>=18){
			System.out.printf("=> Você se encontra na categoria ADULTO <=");
		} else if(idade>=15 && idade<=17){
			System.out.printf("=> Você se encontra na categoria JUVENIL <=");
		} else if(idade>=10 && idade<=14){
			System.out.printf("=> Você se encontra na categoria INFANTIL <=");
			}else {System.out.printf("======== VALOR INVÁLIDO! ========\n");}
		}
		
		id.close();
		
	}
}
