import java.util.Random;
public class AnexoAEjercicio1 {

	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero1 = r.nextInt();
		int numero2 = r.nextInt();
		
		
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		   if (numero1>numero2)
	         {
			         System.out.println("El número mayor es" + numero1);
	         } 
	         else
	         {		  System.out.println("El número mayor es " + numero2);
			         
	         }
	         
	
	}

}

