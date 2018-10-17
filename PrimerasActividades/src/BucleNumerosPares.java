import java.util.Scanner;

public class BucleNumerosPares {


	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("¿Comprobar si el numero es divisible entre otros?");
		String respuesta = in.next();
		
		while (respuesta.equals("s".toLowerCase()));
		// .toLowerCase es para que reconozca la S mayuscula y minuscula.s
		
			System.out.println("Introduce el número");
			int x =in.nextInt();
			System.out.println("Introduce otro número");
			int y = in.nextInt();
			if (x % y == 0)
				System.out.println(x + " es divisible entre " + y);
			else
				System.out.println(x + "no es divisible entre " + y);
			System.out.println("¿Comprobar si el numeroe s divisible entre?");
			
	}
	

}
