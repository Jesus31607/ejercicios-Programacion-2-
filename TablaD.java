import java.util.Scanner;
public class TablaD{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		int numero,resultado;
	System.out.println("Ingresa la tabla que deseas buscar");
	numero=sc.nextInt();
	for(int i=1;i<=10;i++){
	resultado=numero*i;
	System.out.println(numero+ "x"+ i +"="+resultado);
	}	
}
}