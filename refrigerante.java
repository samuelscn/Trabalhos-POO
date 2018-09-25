public class Refrigerante {
	private String Nome;
	private double Valor;
	private int qtd;

	public Refrigerante(String Nome, double Valor, int qtd) {
		this.Nome = Nome;
		this.Valor = Valor;
		this.qtd = qtd;
	}

	public String getNome() {
		return this.Nome;
	}

	public double getValor() {
		return this.Valor;
	}

	public void setQtd(int qtd) {
		this.qtd = this.qtd - qtd ;
	}

	public void setValor(double Valor) {
		this.Valor = Valor;
	}
}