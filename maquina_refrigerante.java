import java.util.ArrayList;
import java.util.Scanner;

public class Maquina_Refrigerante {
	
	private double Saldo;
	private ArrayList<Refrigerante> Qtd_Refrigerante;
	private double Credito_Atual;

	public Maquina_Refrigerante() {

	}

	public void Recebe_Credito(double moeda) {
		this.Credito_Atual = moeda;
	}

	public void Insere_Credito(double moeda) {
		this.Credito_Atual = this.Credito_Atual + moeda;
	}

	public double Exibe_Credito() {
		return this.Credito_Atual;
	}

	public String Escolha_Refrigerante(String Refri) {
		return Refri;
	}

	public int Altera_Estoque(String Refri) {
		int n = Qtd_Refrigerante.size();
		Scanner s = new Scanner(System.in);
		double moeda;

		for(int i = 0; i < n; i++) {
			if (this.Qtd_Refrigerante.get(i).getNome() == Refri) {
				if (this.Credito_Atual >= this.Qtd_Refrigerante.get(i).getValor()) {
					System.out.println("Refrigerante retirado com sucesso!");
					this.Qtd_Refrigerante.get(i).setQtd(1);
					if (this.Credito_Atual > Qtd_Refrigerante.get(i).getValor()) {
						this.Credito_Atual = this.Credito_Atual - Qtd_Refrigerante.get(i).getValor();
					}
				return;
				}else {
					System.out.println("Saldo "+this.Exibe_Credito()+"insuficiente, insira mais moedas!");
					System.out.println("Insira a moeda: ");
					moeda = s.nextDouble();
					Insere_Credito(moeda);
					i = 0;
				}
			}
		}
	}

}