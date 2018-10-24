import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("ingrese su genero (M/F): ");
		String genero = teclado.nextLine();

		if(genero.toUpperCase().equals("M")) {
			System.out.println("es Varon");
		} else {
			System.out.println("es Mujer");
		}
	}
}

	


