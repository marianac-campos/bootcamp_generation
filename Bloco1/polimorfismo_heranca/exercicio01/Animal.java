package exercicio01;

public abstract class Animal implements interfaceAnimal{
	
	protected String Nome;
	protected int idade;
		
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String emitirSom(String som) {
		return som;
	}
	
	public String acao(String acao) {
		return acao;
	}
	
}
