package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) throws InterruptedException{
		
		Scanner in = new Scanner(System.in);
		
		int idade=0, sexo=0, status=0;
		int tc=0, fn=0, ma=0, oc=0, n40=0, c18=0;
		
		System.out.println("=====================================");
		System.out.println("      FORMULÁRIO DE PESQUISA       ");
		System.out.println("=====================================");
		Thread.sleep(1300);
		System.out.print("Quantas pessoas foram entrevistadas? ");
		int i = in.nextInt();
		
		while(i>0) {
			System.out.print("\nIDADE DO ENTREVISTADO: ");
			idade=in.nextInt();
			System.out.println("\nSELECIONE O SEXO DO ENTREVISTADO"
					+ "\n[1] Feminino\n[2] Masculino\n[3] Outro");
			sexo=in.nextInt();
			System.out.println("\nEMOCIONAL MAIS PREDOMINANTE"
					+ "\n[1] Calmo(a)\n[2] Estressado(a)\n[3] Agressivo(a)");
			status=in.nextInt();
			
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
			if(status==2 && idade>40) {
				n40++;	
			}
			if(status==1 && idade<18) {
				c18++;	
			}
			
			i--;
		}
			
			System.out.println("\n=========================================================");
			System.out.println("- Número de pessoas CALMAS: " + tc);
			System.out.println("- Número de MULHERES NERVOSAS: " + fn);
			System.out.println("- Número de HOMENS AGRESSIVOS: " + ma);
			System.out.println("- Número de OUTROS CALMOS: " + oc);
			System.out.println("\n- Número de pessoas NERVOSAS com MAIS de 40 anos: " + n40);
			System.out.println("- Número de pessoas CALMAS com MENOS de 18 anos: " + c18);
			
			in.close();	
	}

}
