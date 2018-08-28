
import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		int salarioBruto, desconto, salarioLiquido, emprestimo;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Entre com o valor do seu salário bruto: ");
			salarioBruto = s.nextInt();
		} while(salarioBruto < 0);
		do {
			System.out.println("Entre com o valor do desconto: ");
			desconto = s.nextInt();
		} while(desconto < 0);
		System.out.println("Entre com o valor do emprestimo a ser feito: ");
		emprestimo = s.nextInt(); 
		salarioLiquido = salarioBruto - desconto;
		int resultado = (salarioLiquido*30)/100;
		if (emprestimo > resultado) {
			System.out.println("Você não poderá fazer um emprestimo nesse valor!");
		}else {
			System.out.println("Emprestimo poderá ser realizado nesse valor!");
		}
	}
}
