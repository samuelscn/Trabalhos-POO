
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		int n, numero, resultadoSoma = 0, media, qtdPares = 0, qtdImpares = 0, maiorValor = 0, menorValor = 999999;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Entre com um numero entre 0 e 1000: ");
			n = s.nextInt();
		} while (n < 0 || n > 1000);
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com um numero inteiro: ");
			numero =  s.nextInt();
			resultadoSoma = resultadoSoma + numero;
			if (numero < menorValor) {
				menorValor = numero;
			}
			if (numero > maiorValor) {
				maiorValor = numero;
			}
			if ((numero % 2) == 0) {
				qtdPares++;
			}else {
				qtdImpares++;
			}
		}
		media = resultadoSoma/n;
		System.out.println("O menor valor digita foi: "+menorValor);
		System.out.println("O maior valor digita foi: "+maiorValor);
		System.out.println("A m�dia aritm�tica dos valores digitados �: "+media);
		System.out.println("A quantidade de n�meros pares digitados foram: "+qtdPares);
		System.out.println("A quantidade de n�meros impares digitados foram: "+qtdImpares);
	}
}
