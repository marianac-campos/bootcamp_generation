package aula05.exercicio02;

public class testeaviao {
	
	public static void main(String[]args) {
		
		aviao av = new aviao();
		
		av.setMarca("Anvisa");
		av.setGasolina(190);
		av.setPeriodo("Manhã");
		
		System.out.println("O avião possui "+ av.getGasolina() + "L para saída.");
		System.out.println("Marca do avião: "+ av.getMarca());
		System.out.println("Período de saída: "+ av.getPeriodo());
		
	}
}
