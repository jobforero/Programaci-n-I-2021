package enunciados3; //Vocal_Cadena

//Ingrese una cadena por teclado y determine si el primer caracter es una vocal o una consonante.

import java.util.Scanner;

class Vocal_Ca {

	private String cadena;
	private boolean esConsonante;
	private char arv[] = { 'a', 'e', 'i', 'o', 'u' };
	private char arc[] = { 'B', 'C', 'D', 'F', 'G', 'H', 'J',
			'K', 'L', 'M', 'Ñ', 'P', 'Q', 'R', 'S','T', 'V', 'W', 'X', 'Y', 'Z',
			'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};

	Vocal_Ca() {
		cadena = null;
		esConsonante = false;
	}

	void ingresa() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar la cadena que se estara evaluando");
		cadena = entrada.next();

	}

	void Proces_Voc() {

		char caracterActual;
		boolean esVocal;

		caracterActual = cadena.charAt(0);
		esVocal = false;

		if (esVocal != true) {
			for (int j = 0; j < arv.length && !esVocal; j++) {
				if (caracterActual == arv[j]) {
					esVocal = true;
				}

			}
			if (esVocal) {
				System.out.println("El primer caracter si es una Vocal");
				esConsonante = true;
			}
		}
	}

	void Proces_Con() {
		char caracterActual;
		boolean esConson;

		caracterActual = cadena.charAt(0);
		esConson = false;

		if (esConson != true) {
			for (int x = 0; x < arc.length && !esConson; x++) {
				if (caracterActual == arc[x]) {
					esConson = true;
				}
				if (esConson) {
					System.out.println("El primer caracter si es una consonate");
					esConsonante = true;
				}
			}

		}

	}

	void valida() {
		if (esConsonante != true) {
			// Ingrese una cadena por teclado y determine si el primer caracter es una vocal
			// o una consonante.
			System.out.println("El primer caracter ingresado no es una vocal y no es una consonante");
		}
	}
}

public class Vocal_Cadena {

	public static void main(String[] args) {

		Vocal_Ca cv = new Vocal_Ca();
		cv.ingresa();
		cv.Proces_Voc();
		cv.Proces_Con();
		cv.valida();
	}

}
