package aula04;

public class exercicio01 {
	
	public static void main(String[] args) {
	
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma=0;
	
		soma+=A[0]+A[1]+A[5];
		System.out.println("A soma dos vetores [0] [1] [5] é: "+ soma);
		
		A[3]=100;
		
		System.out.println("\nOs valores de cada vetor ficou como: ");
		for (int i = 0; i<6; ++i) {
			System.out.print(A[i] + " | "); 
			}System.out.println();
		
	}
}
