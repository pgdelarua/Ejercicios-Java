import java.util.Scanner;

public class ActividadIVA {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		float precio;
		System.out.println("Introduce el precio");
		precio= teclado.nextFloat();
		System.out.println("El precio introducido es: " + precio + " Euros");
		
		System.out.println("Tipo de IVA: (0) 7% - (1) 10% - (2) 21%" );
		int tipoIVA=in.nextInt();
		float iva;
		if (tipoIVA == 0)
			iva = 0.07f;
		else if (tipoIVA == 1)
			iva = 0.1f;
		else if (tipoIVA == 2) 
			iva= 0.21f;
		else
			System.out.println("El tipo de IVA no es correcto");
		if ( iva!=0) {
			double totalIVA= precio * iva;
			double total= precio + totalIVA;
		}
	
	}
	
}
		
		
		
	
