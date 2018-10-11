import java.util.Random;

public class AnexoAEjercicio3 {

	
	public static void main(String[] args) {
			Random r = new Random(System.nanoTime());
			int numero = r.nextInt(1000);
			System.out.println("Número: " + numero);
			if (numero % 2 == 0) {
			    System.out.println("es par!");
			} else {
			    System.out.println("es impar!");
			}
	}
	
}

