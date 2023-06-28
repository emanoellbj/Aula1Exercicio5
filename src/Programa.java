import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		String texto;

		System.out.println("Digite um texto para verificar se é um palíndromo: ");
		texto = new Scanner(System.in).nextLine();

		String textoSemEspacamento = texto.replace(" ", "").toLowerCase();

		String textoInvertido = new StringBuilder(textoSemEspacamento).reverse().toString();

		System.out.println(textoInvertido);

		if (textoInvertido.equals(textoSemEspacamento)) {
			System.out.println("O texto é um palíndromo!");
		} else {
			System.out.println("O texto não é um palíndromo!");
		}
	}
}