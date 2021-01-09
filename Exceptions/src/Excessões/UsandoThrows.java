package Excessões;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um número decimal:");

		double num;
		try {
			num = leNumero();
			System.out.println("Você digitou: " + num);
		} catch (Exception e) {

			System.out.println("Entrada inválida");
		}

	}

	// O throws obriga a quem for usar este método a tratar o erro, ou a usar throws
	// novamente
	// para tratar depois //
	public static double leNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}
