import java.util.Random;
public class AnexoAEjercicio1 {

	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero1 = r.nextInt(1000);
		int numero2 = r.nextInt(1000);
		
		
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		   if (numero1>numero2)
	         {
			         System.out.println(numero1 + " es mayor que " + numero2);
	         } 
	         else {
	        	 if (numero2>numero1) {
	         	  System.out.println(numero1 + " es menor que " + numero2);
	         }
	        	 else {
	        		 System.out.println(numero1 + " es igual que " + numero2);
	        	 }
	 
	         }
	}

}