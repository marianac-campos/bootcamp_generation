package aula05.exercicio01;

public class testeCliente {
	
	public static void main(String[] args) {
	clientes cliente = new clientes();
		
		cliente.setNomecliente("Orivaldo da Silva Cruz");
		cliente.setTipodecompra("Calçado");
		cliente.setValorcompra(250);
		
		System.out.println("Nome do cliente: "+ cliente.getNomecliente());
		System.out.println("Item comprado: "+ cliente.getTipodecompra());
		System.out.println("Valor da compra: R$"+ cliente.getValorcompra());
		
	}	
}
