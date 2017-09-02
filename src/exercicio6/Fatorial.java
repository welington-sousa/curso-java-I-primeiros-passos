package exercicio6;

public class Fatorial {

    public static void main(String... args) {
	long fatorial = 1;
	for (int n = 1; n <= 10; n++) {
	    fatorial *= n;
	    System.out.println("fatorial(" + n + "!" + ") = " + fatorial);
	}
    }

}
