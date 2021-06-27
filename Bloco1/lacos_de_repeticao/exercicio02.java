package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		
		int par=0, impar=0, num;
		
		System.out.println("=============================");
		
		for(int cont=0; cont<10; cont++){
			System.out.print("Digite um algarismo: ");
			num = entrada.nextInt();
			if(num%2==0) {
				par++;
			}else {impar++;}
		}
		System.out.println("=============================");
		System.out.println("Para cada número que foi digitado tivemos: \n" 
			+ par +" PAR(ES) e " + impar + " IMPAR(ES)");
		
		entrada.close();
		
	}
}
