import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("ingrese un numero entero: ");
		Integer numero = teclado.nextInt();

		if(numero == 10)
			System.out.println("usted ingreso el numero: 10");
	}
}
