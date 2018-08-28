
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
