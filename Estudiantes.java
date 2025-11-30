import java.util.Scanner;
public class Estudiantes{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

	double calificaciones[]=new double[6];
	
	for(int i=0;i<6;i++){
	    System.out.println("Ingresa la calificacion del estudiante: "+(i+1));
	    calificaciones[i]=sc.nextDouble();
	}
	
	double suma=0;
	    for(int i=0;i<6;i++){
	    suma+=calificaciones[i];
	}
	
	double promedio=suma/6;
	    for(int i=0;i<6;i++){
	    System.out.println("Las calificaciones de los estudiantes en la posicion: "+(i+1));
	    System.out.println(calificaciones[i]);
	}

	System.out.printf("\nEl promedio de las calificaciones es de: %.2f", +promedio);
}
}