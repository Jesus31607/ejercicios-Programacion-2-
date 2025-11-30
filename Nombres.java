import java.util.Scanner;
public class Nombres{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int contador=0;
	while (contador<10){
	System.out.println("Ingresa el nombre " + (contador + 1) + ":");
	String nombre=sc.nextLine();
	System.out.println("nombre : "+ nombre);
	contador ++;
	}
	}
}