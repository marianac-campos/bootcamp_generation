package aula03;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		int i=0, sexo=0, status=0;
		int tc=0, fn=0, ma=0, oc=0, n40=0, c18=0;
				
		while(i<3) {
			System.out.printf("Qual a sua idade?: ");
			i=id.nextInt();
			System.out.println("Qual seu sexo?\n[1] Feminino\n[2] Masculino\n[3] Outro");
			sexo=id.nextInt();
			System.out.println("Você se considera uma pessoa... \n[1] Calma\n[2] Estressada\n[3] Agressiva");
			status=id.nextInt();
			
			if(status==1) {
				tc++;	
			}
			if(sexo==1 && status==2) {
				fn++;	
			}
			if(sexo==2 && status==3) {
				ma++;	
			}
			if(sexo==3 && status==1) {
				oc++;	
			}
			if(status==2 && i>40) {
				n40++;	
			}
			if(status==1 && i<18) {
				c18++;	
			}
			
			
		}
			id.close();	
	}
}
