
import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		int diaAniversario, numeroMes;
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com o dia do seu aniversario: ");
		diaAniversario = s.nextInt();
		System.out.println("Entre com o numero correspondente ao mes do seu aniversario: ");
		numeroMes = s.nextInt();
		switch(numeroMes) {
			case 1:
				System.out.println("Janeiro!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 2:
				System.out.println("Fevereiro!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 3:
				System.out.println("Março!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 4:
				System.out.println("Abril!");
				if (diaAniversario > 30) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;	
			case 5:
				System.out.println("Maio!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 6:
				System.out.println("Junho!");
				if (diaAniversario > 30) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 7:
				System.out.println("Julho!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 8:
				System.out.println("Agosto!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 9:
				System.out.println("Setembro!");
				if (diaAniversario > 30) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 10:
				System.out.println("Outubro!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 11:
				System.out.println("Novembro!");
				if (diaAniversario > 30) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
			case 12:
				System.out.println("Dezembro!");
				if (diaAniversario > 31) {
					System.out.println("Dia do aniversario é invalido!");
				}else {
					System.out.println("Dia do aniversario é valido!");
				}
			break;
		}
	}
}
