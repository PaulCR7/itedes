import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("ingrese un numero: ");
		Integer number1 = keyboard.nextInt();

		System.out.print("ingrese otro numero: ");
		Integer number2 = keyboard.nextInt();

		Integer result = number1 - number2;
		System.out.println("el resultado de la suma es: "- result.toString());
	}
}
