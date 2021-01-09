package CriandoExcessao;

public class Dividir {

	public static void main(String[] args) {

		try {
			teste();
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}

	public static void teste() throws Exception {

		for (int i = 0; i <= 20; i++) {

			try {
				System.out.println(i + "/" + "2" + " = " + (i / 2));

				if (i % 2 != 0) {
					throw new DivisaoNaoExata(i, 2);
				}

			} catch (NumberFormatException | DivisaoNaoExata e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("Erro");
			}

		}

	}

}
