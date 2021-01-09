package Excess�es;

public class Finally {

	public static void main(String[] args) {
		int numeros[] = { 4, 8, 16, 32, 64, 128 };
		int denom[] = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException e) {

				System.out.println("Erro ao dividir por zero");
				e.printStackTrace();

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posi��o do Array inv�lida");
				e.printStackTrace();
			} finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou o catch");
			}

		}

	}

}
