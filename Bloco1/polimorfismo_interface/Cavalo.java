package polimorfismo_heranca.exercicio01;

public class Cavalo extends Animal{
	
	@Override
	public void acao() {
	System.out.println("O cavalo CAVALGA no pasto!");
	}

	@Override
	public void somAnimal() {
		System.out.println("IiiiHHhi");
	}
}
