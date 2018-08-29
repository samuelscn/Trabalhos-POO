
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q13 {
	public static void main(String[] args) throws IOException {
		lerArquivo();
	}
	
	public static void lerArquivo() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Samuel\\eclipse-workspace\\Samuel2662\\src\\teste.txt");
		int qtdPaciente = 0, somaIdade = 0, somaH = 0, a = 0, b = 0, d = 0, mediaIdade = 0, numeroAlturaM = 0, qtdPessoasIdade = 0, idade = 0;
		double c = 0, alturaM = 99.9;
		BufferedReader read = new BufferedReader(fr);
		String nome = new String();
		String nomeM = new String();
		String linha = "";
		while((linha = read.readLine()) != null) {
			//System.out.println(linha);
			String[] textoSeparado = linha.split(" ");
			b = Integer.parseInt(textoSeparado[3]);
			qtdPaciente++;
			if(textoSeparado[0].equalsIgnoreCase("feminino") == true) {
				c = Double.parseDouble(textoSeparado[4]);
				d = Integer.parseInt(textoSeparado[2]);
				if(c > 1.60 && c < 1.70 && d > 70) {
					numeroAlturaM++;
				}
				if(alturaM > c) {
					alturaM = c;
					nomeM = textoSeparado[0];
				}
			}
			if(textoSeparado[0].equalsIgnoreCase("masculino") == true) {
				a = Integer.parseInt(textoSeparado[3]);
				somaIdade = somaIdade + a;
				somaH++;
			}
			if(idade < b) {
				idade = b;
				nome = textoSeparado[0];
			}
			if(b > 18 && b < 25) {
				qtdPessoasIdade++;
			}
		}
		//mediaIdade = somaIdade/somaH;
		System.out.println("Quantidade de pacientes: "+qtdPaciente);
		System.out.println("Media da idade masculina: "+somaIdade);
		System.out.println("Numero mulheres com altura entre 1,60 e 1,70: "+numeroAlturaM);
		System.out.println("Quantidade pessoas com idade enter 18 e 25: "+qtdPessoasIdade);
		System.out.println("Paciente mais velho: "+nome);
		System.out.println("Mulher mais baixa: "+nomeM);
		fr.close();
		read.close();
	}
}
