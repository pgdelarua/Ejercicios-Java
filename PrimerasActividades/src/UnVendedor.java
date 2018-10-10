import java.util.Scanner;

public class UnVendedor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float venta1;
		float venta2;
		float venta3;
		final float sueldo = 1300;
		final float porcentaje = 0.1f;
		System.out.println("Valor de la venta 1: ");
		venta1 = teclado.nextFloat() * porcentaje;

		System.out.println("Valor de la venta 2: ");
		venta2 = teclado.nextFloat() * porcentaje;

		System.out.println("Valor de la venta 3: ");
		venta3 = teclado.nextFloat() * porcentaje;

		System.out.println("Valor de la venta 1: " + venta1);
		System.out.println("Valor de la venta 2: " + venta2);
		System.out.println("Valor de la venta 3: " + venta3);

		System.out.println("Sueldo final: " + (venta1 + venta2 + venta3 + sueldo) +" €.");
	}

}
