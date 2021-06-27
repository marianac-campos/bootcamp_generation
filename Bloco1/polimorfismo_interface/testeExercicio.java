package polimorfismo_heranca.exercicio01;

public class testeExercicio{
	
	public static void main(String[] args) throws InterruptedException {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		dog.setNome("Nasus");
		dog.setIdade(13);
		
		dog.acao();
		Thread.sleep(1000);
		System.out.print(dog.getNome() + ": " ); dog.somAnimal();
		Thread.sleep(1000);
		System.out.println("E ele tem "+ dog.getIdade() + " anos!\n");
		
		Thread.sleep(2000);
		
		horse.setNome("Epona");
		horse.setIdade(7);
		
		horse.acao();
		Thread.sleep(1000);
		System.out.print(horse.getNome() + ": "); horse.somAnimal();
		Thread.sleep(1000);
		System.out.println("E ela tem "+ horse.getIdade() + " anos!\n");
		
		Thread.sleep(2000);
		
		sloth.setNome("Flash");
		sloth.setIdade(42);
		
		sloth.acao();
		Thread.sleep(1000);
		System.out.print(sloth.getNome() + ": "); sloth.somAnimal();
		Thread.sleep(1000);
		System.out.println("E ela tem "+ sloth.getIdade() + " anos!\n");
		
	}
}
