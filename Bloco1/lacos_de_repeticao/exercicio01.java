package lacos_de_repeticao;

public class exercicio01 {
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("============================================================");
		System.out.println("Os número que possuem o resto igual 5 entre 1000 e 2000 são:");
		System.out.println("============================================================");
		
		Thread.sleep(2500);
		
		for (int cont=1000; cont<2000; cont++){
			if(cont%11==5) {
				System.out.println(cont);
				Thread.sleep(500);
			}
		}
	}
}
