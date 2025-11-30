import java.util.Scanner; 
public class Ej8{
public static void main(String [] args){ 
int num[]=new int[8]; 
Scanner sc=new Scanner(System.in); 
   
	for(int i=0; i<8; i++){
	    System.out.println("Ingresa el numero que quieras: " + (i+1));
	    num[i]=sc.nextInt();
	}
	
	System.out.println("Ingresa el numero a buscar de los que ingresaste: "); 
	int numb=sc.nextInt(); 
  
	boolean encontrado= false; 
	for(int i=0 ; i<8; i++){
            if(num[i]==numb){
            encontrado=true; 
	break; 
   	}
  } 
	if(encontrado){
	    System.out.println("El numero que has ingresado" + numb + " existe en el arreglo");
	}else{
	System.out.println("El numero que has ingresado: " + numb + " no existe en el arreglo");
	}
   }
}