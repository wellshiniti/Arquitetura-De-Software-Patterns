package exercicio7_1;

public class Teste {

	public static void main(String[] args) throws Exception {
		// Manipula de várias formas.
		StringQualquer manipulador;

		System.out.println("Transforma em maiúsculo: ");
		manipulador = new Maiusculo();
		manipulador.manipularString();

		System.out.println("Transforma em minúsculo: ");
		manipulador = new Minusculo();
		manipulador.manipularString();

		System.out.println("Duplicar texto: ");
		manipulador = new DuplicarString();
		manipulador.manipularString();


		System.out.println("Inverte texto: ");
		manipulador = new InverterString();
		manipulador.manipularString();
	}
}