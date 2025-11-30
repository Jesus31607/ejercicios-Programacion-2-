import java.util.Scanner;
public class Reves{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

	int numero[]=new int[10];
	
	for(int i=0;i<10;i++){
	    System.out.println("Ingresa el numero "+(i+1));
	    numero[i]=sc.nextInt();
	}
	System.out.println("Los numeros que han ingresado fueron: ");
	for(int i=9;i>=0;i--){
	    System.out.print("  "+numero[i]);
	    System.out.println();
	}
}
}
