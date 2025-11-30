import java.util.Scanner;
public class CalAlumn{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);


	int aprobados=0,reprobados=0;
	double calificacion=0,suma=0,promedio;

	for(int i=1;i<=5;i++){
		System.out.println("Ingrese la calificacion que obtuvo el alumno " + i + ":");
		calificacion=sc.nextDouble();
	
	suma=calificacion;
	if(calificacion>=6){
	      aprobados++;
	}else{
	      reprobados++;
	}
	}
	promedio=suma/5;
	System.out.println("----------CALIFICACIONES----------");
	System.out.println("Numero de aprobados es: "+aprobados);
	System.out.println("Numero de reprobados es: "+reprobados);
	System.out.println("El promedio del grupo es: "+promedio);
}
}