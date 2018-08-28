import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		int anoNascimento, anoAtual;
		int resultado;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com o ano em que nasceu: ");
		anoNascimento = s.nextInt();
		do {
			System.out.println("Entre com o ano atual: ");
			anoAtual = s.nextInt();
		} while(anoAtual < anoNascimento);
		resultado = anoAtual - anoNascimento;
		System.out.println("Sua idade e: "+resultado);
	}
}
