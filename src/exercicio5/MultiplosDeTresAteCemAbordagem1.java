package exercicio5;

/**
 * Utilizando um laço do tipo for imprima todos os múltiplos de 3, entre 1 e 100
 */

public class MultiplosDeTresAteCemAbordagem1 {

    public static void main(String... args) {
	for (int numero = 1; numero < 100; numero++) {

	    // Se o resto for iqual a zero, ele é divisível por 3
	    if (numero % 3 == 0) {
		System.out.println(numero);
	    }
	}
    }

}
