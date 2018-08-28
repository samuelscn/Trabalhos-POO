
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		int resultado, a, b;
		Scanner s = new Scanner(System.in);
		String teste = new String();
		System.out.println("Entre com uma frase: ");
		teste = s.nextLine();
		String[] textoSeparado = teste.split(" ");
		
		if(textoSeparado[0].equalsIgnoreCase("multiplica") == true) {
			a = Integer.parseInt(textoSeparado[1]);
			b = Integer.parseInt(textoSeparado[3]);
			resultado = a * b;
			System.out.println("Resposta: "+resultado);
		}
		
		if(textoSeparado[0].equalsIgnoreCase("divide") == true) {
			a = Integer.parseInt(textoSeparado[1]);
			b = Integer.parseInt(textoSeparado[3]);
			resultado = a / b;
			System.out.println("Resposta: "+resultado);
		}
		
		if(textoSeparado[0].equalsIgnoreCase("soma") == true) {
			a = Integer.parseInt(textoSeparado[1]);
			b = Integer.parseInt(textoSeparado[3]);
			resultado = a + b;
			System.out.println("Resposta: "+resultado);
		}
		
		if(textoSeparado[0].equalsIgnoreCase("subtrai") == true) {
			a = Integer.parseInt(textoSeparado[1]);
			b = Integer.parseInt(textoSeparado[3]);
			resultado = a - b;
			System.out.println("Resposta: "+resultado);
		}
	}
}

