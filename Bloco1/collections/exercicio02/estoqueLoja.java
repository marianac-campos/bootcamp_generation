package exercicio02;

public class estoqueLoja {
	
	private String produto;
	private String codProduto;
	private String marcaProduto;
	private String precoProduto;
	
	public Estoque (String produto, String codProduto, String marcaProduto, String precoProduto) {
		super();
		this.produto = produto;
		this.codProduto = codProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public String getPreçoProduto() {
		return precoProduto;
	}

	public void setPreçoProduto(String preçoProduto) {
		this.precoProduto = preçoProduto;
	}
	
	public String toString() {
		return "[Produto: "+ this.produto + " Código do Produto: "+ this.codProduto+ " Marca do produto: "+this.marcaProduto+" Preço do Produto: R$ "+ this.precoProduto+"]";
				
	}
}
