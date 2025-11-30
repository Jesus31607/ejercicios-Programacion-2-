import java.util.Scanner; 
public class VentasTie{
public static void main(String [] args){
double ventas[]= new double[7];
Scanner sc=new Scanner(System.in); 

	for(int i=0; i<7; i++){
	    System.out.println("Ingresa el monto del dia: " + (i+1));
	    venta[i]=sc.nextDouble();
	}

	double suma=0; 
	for(int i=0;i<7;i++){
	    suma+=ventas[i];
	}
	double ventam=ventas[0];
	int dia=0; 

	for(int i=1; i<7; i++){
	    if(venta[i] > ventam){
	    ventam=ventas[i];
	    dia=i;
	}
	}
    System.out.printf("\nTotal vendido de la semana: %.2f", + suma);
    System.out.println("\nEl dia con mayor venta fue: " + (dia+1) + " con $" + ventam);
}
}  
  