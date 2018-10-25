import java.util.Scanner;

public class Triángulo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		float ladoa;
		System.out.println("El lado A mide: ");
		ladoa = teclado.nextFloat();
		float ladob;
		System.out.println("El lado B mide: ");
		ladob = teclado.nextFloat();
		float ladoc;
		System.out.println("El lado C mide: ");
		ladoc = teclado.nextFloat();
		if (ladoa<ladob+ladoc && ladoa>ladob-ladoc) {
			System.out.println("Se puede formar un triángulo");
		/*} 
		if (ladoa>ladob-ladoc) {
			System.out.println("Se puede formar un triángulo");
		}
		else {
			System.out.println("No se puede formar un triángulo");
		}*/
		}else {
				System.out.println("No se puede formar un triángulo");
			
	
	}

}
}
