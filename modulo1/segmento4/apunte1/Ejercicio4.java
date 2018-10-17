import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
	Scanner teclado = new Scanner (System.in);

	System.out.print("ingrese un numero: ");
	Integer numero= Integer.parseInt(teclado.nextLine());

	Integer resto = numero % 2;

if(resto == 0){
		System.out.println(numero.toString() + " es par ");
}else{
		System.out.println(numero.toString() + " no es par ");
		}
	}
}
