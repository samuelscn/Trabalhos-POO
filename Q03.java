
import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		int numerador, denominador, resultado;
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com o valor do numerador: ");
		numerador = s.nextInt();
		System.out.println("Entre com o valor do denominador: ");
		denominador = s.nextInt();
		while(denominador == 0) {
			System.out.println("Erro, denominador igual a zero!");
			System.out.println("Entre com o valor do denominador: ");
			denominador = s.nextInt();
		}
		resultado = numerador/denominador;
		System.out.println("O numero real obtido é: "+resultado);
	}
}
