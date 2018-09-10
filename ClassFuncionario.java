import java.util.Scanner;

public class Funcionario {
    private String nome = new String();
    private String Data_nascimento = new String();
    private boolean contrato;
    private double Valor_salario;
    private int Numero_filhos;
    private String Data_admissao = new String();
    
   
    public String getNome(){
        return nome;
    }
    
    public String getDataNascimento(){
    	return Data_nascimento;
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
    
    public boolean getEfetivo(){
	return efetivo;    
    }
	
    public boolean getHorista(){
	return horista;
    }
	
   public boolean setContrato(boolean contrato){
        this.contrato = contrato;	   
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
	
    public void setDataNascimento(String dataN){
        this.Data_nascimento = dataN;
    }
    
    public void Funcionario(String nome, String data){
        this.setNome(nome);
        this.setData(data);
    }
    
    public void Contratar(double salario, int nFilhos, String data){
        this.setValor(salario);
        this.setNumero_filhos(nFilhos);
        this.setData_admissao(data);
    }
    
    public double Calcular_Desconto_INSS(double salario){
    	    double aux;
	    
	    if (salario <= 1659.38){
	    	aux = (salario*8)/100;
		return salario - aux;
	    }
	    
	    if (salario >= 1659.39 && salario <= 2765.66){
	    	aux = (salario*9)/100;
		return salario - aux;
	    }
	    
	    if (salario >= 2765.67 && salario <= 5531.31){
	    	aux = (salario*11)/100;
		return salario - aux;
	    }
    }
	
    public double Calcular_Imposto_Renda(double salario){
    	    
	    if (salario <= 1903.98){
		return salario;
	    }
	    
	    if (salario >= 1903.99 && salario <= 2826.65){
	    	
		return (salario*7.5)/100;
	    }
	    
	    if (salario >= 2826.66 && salario <= 3751.05){
	     
		return (salario*15)/100;
	    }
	    if (salario >= 3751.06 && salario <= 4664.68){
	  
		return (salario*22.5)/100;
	    }
	    if (salario >= 4664.69){
	    
		return (salario*27.5)/100;
	    }
	
    public double Calcular_Salario_Liquido(double salario, int horas){
		return Calcular_Salario_Bruto(horas) - Calcular_Imposto_Renda(salario) - Calcular_Desconto_INSS(salario);
    }
	
    public double Calcular_Salario_Bruto(int horas){
	if(this.contrato == true){
		return this.Valor_salario;
	}else{
		return this.Valor_salario*horas;
	}
    }
	    
    public void Folha_Pagamento(int horas, double salario){
	System.out.println("Salario Bruto: "+Calcular_Salario_Bruto(horas));
	System.out.println("Desconto Imposto Renda: "+Calcular_Imposto_Renda(salario));
	System.out.println("Desconto INSS: "+Calcular_Desconto_INSS(salario));
	System.out.println("Salario Liquido: "+Calcular_Salario_Liquido(salario, horas));
    }
	    
	public static void main(String[] args){
		Funcionario funcionario01 = new Funcionario("Caiao Mito", "13 09 1997");
		funcionario01.Contratar(9999.99, 11, "01 01 2020");
		Folha_Pagamento(12, 9999.99);
		
		Funcionario funcionario01 = new Funcionario("Vinicius God", "31 13 1950");
		funcionario01.Contratar(100000.9, 35, "31 13 1950");
		Folha_Pagamento(6, 100000.9);
	}
}
