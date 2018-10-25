import java.util.Scanner;

public class ActividadIVA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		float precio = in.nextFloat();
		System.out.println("Tipo de iva: (0) 7% - (1) 10% - (2) 21%");
		int tipoIVA = in.nextInt();
		float iva = 0;
		if (tipoIVA == 0)
			iva = 0.07f;
		else if (tipoIVA == 1)
			iva = 0.1f;
		else if (tipoIVA == 2)
			iva = 0.21f;
		else
			System.out.println("El tipo de IVA no es correcto");
		
		if (iva != 0) {
			double totalIVA = precio * iva;
			double total = precio + totalIVA;
			System.out.println("Total IVA: " + totalIVA);
			System.out.println("Total: " + total);
		}
		
		in.close();
		
	}

}

		
		
	
