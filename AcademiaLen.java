import java.util.Scanner; 
public class AcademiaLen{
public static void main(String [] args){
int matriz[][] =new int[3][4];
       
	String[]nivel={"Básico","Medio","Perfeccionamiento"};
	String[] idioma={"Ingles","Frances","Aleman","Ruso"};
	Scanner sc=new Scanner(System.in);
     
	System.out.println("Ingresa el nivel y idioma de cada alumno"); 
	for(int i=0; i<12; i++){
	    System.out.println("Estudiante " + (i+1));
	    int niv;

	do{
	System.out.println("Nivel (0=Basico, 1=Medio, 2=Perfecciamiento)");
	ni=sc.nextInt();
	} while(niv <0 || niv > 2); 
	int id;
	
	do{
	System.out.println("idioma (0=Ingles, 1=Frances, 2=Aleman, 3=Ruso)");
	id=sc.nextInt();
	}while(id <0 || id > 3);
	matriz[ni][id]++; 
   
	}
	System.out.println("\nAlumnos por nivel de idioma ");
	for( int i=0;i <3;i++){
	    System.out.println(nivel[i]);
	for(int n=0; n < 4;n++){
	    System.out.println(idioma[n]+ ": " + matriz[i][n]);
	}
         System.out.println();
	}
    
}
}