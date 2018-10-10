import java.util.Scanner;

public class PrimerEjercicioBanco {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		float dinero; 
		float ganancia;
	System.out.println("Introduce el capital: ");
		dinero= teclado.nextFloat();
		ganancia= dinero*.02f;      /*El fallo es porque estamos multiplicando un float por un double y ya que float es más preciso que double...
									->poniendo f seguidamente del dato double le decimos a Eclipse que aunque sea un doble lo interprete como float*/
		System.out.println("Tu dinero después de un mes al 2% de interés ha generado: " + ganancia + "€.");//Podriamos ahorrarnos la variable ganancia sustituyéndola simplemente por "capital*.02f//
		teclado.close();
	}						

}
