
import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		int n, numero, resultadoSoma = 0, resultadoProduto = 1;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Entre com um numero de 0 a 100: "); 
			n = s.nextInt();
		} while(n < 0 || n > 100);
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com um numero inteiro: ");
			numero = s.nextInt();
			resultadoSoma = resultadoSoma + numero;
			resultadoProduto = resultadoProduto * numero;
		}
		System.out.println("Resultado da soma dos N termos é: "+resultadoSoma);
		System.out.println("Resultado do produto dos N termos é: "+resultadoProduto);
	}
}
