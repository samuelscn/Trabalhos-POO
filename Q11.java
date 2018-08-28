
import java.util.Scanner;
import java.util.Random;

public class Q11 {
	public static void main(String[] args){
		Random gerador = new Random();
		Scanner s = new Scanner(System.in);
		int numeroSorteado, numeroDigitado, tentativa = 0;
		numeroSorteado = gerador.nextInt(100);
		do{
			System.out.println("Descubra o numero sorteado!");
			System.out.println("Entre com um numero: ");
			numeroDigitado = s.nextInt();
			if(numeroDigitado < numeroSorteado){
				System.out.println("Dica 01 -> Número sorteado é maior que o número digitado!");
			}
			if(numeroDigitado > numeroSorteado){
				System.out.println("Dica 02 -> Número sorteado é menor que o número digitado!");
			}
			tentativa++;
		}while(numeroDigitado != numeroSorteado);
		System.out.println("Acertou em exatamente "+ tentativa +" tentativas!");
	}
}
