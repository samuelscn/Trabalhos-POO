
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		int Nlinhas = 0;
		int cont = 1;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Entre com o numero de linhas maior que zero:");
			Nlinhas = s.nextInt();
		} while(Nlinhas <= 0);
		for (int i = 0; i < Nlinhas; i++) {
			for (int j = 0; j < cont; j ++) {
				System.out.print("*");
			}
			System.out.println();
			cont++;
		}
	}
}

import java.util.Scanner;

public class Funcionario {
    private String nome = new String();
    private boolean efetivo = true;
    private boolean horista = false;
    private double Valor_salario;
    private int Numero_filhos;
    private String Data_admissao = new String();
    
   
    public String getNome(){
        return nome;
    }
    
    public double getValor(){
        return Valor_salario;
    }
    
    public int getNumero_filhos(){
        return Numero_filhos;
    }
    
    public String getData_admissao(){
        return Data_admissao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setValor(double valor){
        this.Valor_salario = valor;
    }
    
    public void setNumero_filhos(int nFilhos){
        this.Numero_filhos = nFilhos;
    }
    
    public void setData_admissao(String data){
        this.Data_admissao = data;
    }
    
    public void Construtor(Funcionario trabalhador, String nome, String data){
        trabalhador.setNome(nome);
        trabalhador.setData_admissao(data);
    }
    
    public void Contratar(Funcionario trabalhador, double salario, int nFilhos, String data){
        trabalhador.setValor(salario);
        trabalhador.setNumero_filhos(nFilhos);
        trabalhador.setData_admissao(data);
    }
    
    public void Alterar_Salario(Funcionario trabalhador, double salario){
        trabalhador.setValor(salario);       
    }
    
    public void Obter_Salario(){
        System.out.println("Seu salario: "+getValor());
    }
    
    public void Alterar_NumeroF(Funcionario trabalhador, int nFilhos){
        trabalhador.setNumero_filhos(nFilhos);
    }
    
    public void Obter_NumeroF(){
        System.out.println("Numero de filhos: "+getNumeroFilhos());
    }
}
