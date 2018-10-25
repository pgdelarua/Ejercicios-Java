import java.util.Scanner;

	public class Nicómaco {

	public static void main(String[] args) {	/*Utilizaremos la variable impar para que vaya tomando
	 											los valores de los números impares. Su valor inicial es -1, ya que así, 
	 											al incrementarla sucesivamente  en 2 unidades, se irán generando los valores impares. 
	 											El valor de n lo pediremos por teclado, almacenándolo en la variable n:*/
	Scanner sc = new Scanner(System.in);
	int impar = -1;
	int n;
	System.out.println("Cubos a calcular");;
	n = sc.nextInt();

	for (int i = 1; i <= n; i++) {

	impar = impar + 2;
	int suma = impar;
	for (int j = 2; j <= i; j++) {
	impar = impar + 2;
	suma = suma + impar;
	}
	System.out.println(suma);
	}

	}

	}

/*Sumando el primer impar, se obtiene el primer cubo;

sumando los dos siguientes impares, se obtiene el segundo cubo;

sumando los tres siguientes impares, se obtiene el tercer cubo, etc;*/