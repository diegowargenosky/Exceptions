package Excess�es;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um n�mero decimal:");

		double num;
		try {
			num = leNumero();
			System.out.println("Voc� digitou: " + num);
		} catch (Exception e) {

			System.out.println("Entrada inv�lida");
		}

	}

	// O throws obriga a quem for usar este m�todo a tratar o erro, ou a usar throws
	// novamente
	// para tratar depois //
	public static double leNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}
