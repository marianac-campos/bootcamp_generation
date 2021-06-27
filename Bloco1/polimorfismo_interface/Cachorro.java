package polimorfismo_heranca.exercicio01;

public class Cachorro extends Animal{

	@Override
	public void acao(){
	System.out.println("O cachorro CORRE alegremente!");
	}

	@Override
	public void somAnimal(){
		System.out.println("AUAUAU");
	}
}
