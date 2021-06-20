package exercicio02;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class TestaEstoque {

		public static void main(String[] args) {

			int opcao;
			Scanner leia = new Scanner(System.in);

			ArrayList<Estoque> produtos = new ArrayList<>();
			do {
				System.out.println("Opção 1: Add  ------- Opção 2: Remover  -------  Opção 3: Listar ----- Opção 4: Sair ");
				opcao = leia.nextInt();

				if (opcao == 1) {

					System.out.println("Quantos Produtos voce deseja add: ");
					int numeroProdutos = leia.nextInt();

					for (int i = 0; i < numeroProdutos; i++) {

						leia.nextLine();
						System.out.println("Qual produto: ");
						String produto = leia.nextLine();
						leia.nextLine();
						System.out.println("Código do Produto: ");
						String codProduto = leia.nextLine();
						leia.nextLine();
						System.out.println("Marca do Produto: ");
						String marcaProduto = leia.nextLine();
						leia.nextLine();
						System.out.println("Preço do Produto:R$ ");
						String precoProduto = leia.nextLine();

						produtos.add(new Estoque(produto, codProduto, marcaProduto, precoProduto));
					}
				} else if (opcao == 2) {
					System.out.println();

					for (int i = 0; i < produtos.size(); i++) {
						System.out.println(i + "Posição: " + produtos.get(i));
					}

					System.out.println("Qual dessas posições você quer remover? ");
					int excluir = leia.nextInt();
					produtos.remove(excluir);

				} else if (opcao == 3) {

					for (Estoque prod1 : produtos) {
						System.out.println(produtos);
						System.out.println("O produto é: " + prod1.getProduto());
						System.out.println("O código do produto é: " + prod1.getCodProduto());
						System.out.println("A marca do produto é: " + prod1.getMarcaProduto());
						System.out.println("O Preço do produto é: " + prod1.getPreçoProduto());
					}
				}

			} while (opcao != 4);
		}
}
