import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Numero de filas");
		
		int n =in.nextInt();
		System.out.println("Número de columnas");
		int m = in.nextInt();
		for (int i=0; i<n; i++) {
			
			if (i == n / 2) {
		for(int j =0; j<=m; j++)
			System.out.print("*");
		

		
			}
			
			else {
				for (int j = 0; j<m; j++) {
					if (j == m/2) {
						System.out.print("*");
					}
					else 
						System.out.print(" ");
					}
				}
			System.out.println();
			}
	}
}	


/*System.out.println((i== n/2 || j==m/2) ?*/


	
