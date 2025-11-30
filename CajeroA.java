import java.util.Scanner;
public class CajeroA{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	String continuar;
	double adeudo=1000;

	do{
	   System.out.println("BIENVENIDO AL CAJERO: INGRESA LA OPCION LA QUE QUIERES REALIZAR");
	   System.out.println("\n1.Consulta"+"\n2.Pago del mes"+"\n3.Pago del adeudo"+"\n4.Salir");
	   int opcion=sc.nextInt();
	
	switch(opcion){
	case 1:
	   System.out.println("1.Consulta tu adeudo es de $: "+adeudo);
	   break;
	
	case 2:
	   System.out.println("Pago del mes: tu adeudo es de $" + adeudo + "\nTu pago ha sido procesado con exito");
	   break;

	case 3:
	   System.out.println("Pago de tu adeudo: Tu nuevo adeudo es de: "+adeudo);
	   break;

	case 4:
	   System.out.println("Salir. Gracias por visitar nuestro cajero. Vuelva pronto");
	   break;

	default:
	   System.out.println("Opcion no valida. Ingrese un numero del 1-4");
	   break;
	}

	System.out.println("Desea continuar?(si/no)");
	   continuar=sc.next().toLowerCase();
		if(!continuar.equals("S")||continuar.equals("s")){
	           System.out.println("Gracias por brindarnos tu convianza al usar este cajero. Vuelve pronto");
	           break;
	}
	}while(true);
}
}