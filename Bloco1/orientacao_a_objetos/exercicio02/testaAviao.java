package orientacao_a_objetos.exercicio02;

public class testaAviao {
	public static void main(String[]args) {
		
		aviao av = new aviao();
		
		av.setMarca("Anvisa");
		av.setGasolina(190);
		av.setPeriodo("Manh�");
		
		System.out.println("O avi�o possui "+ av.getGasolina() + "L para sa�da.");
		System.out.println("Marca do avi�o: "+ av.getMarca());
		System.out.println("Per�odo de sa�da: "+ av.getPeriodo());
		
	}
}
