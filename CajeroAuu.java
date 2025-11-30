import java.util.Scanner;
public class CajeroAuu{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

	double saldo=5000;
	String continuar;

	do{
	   System.out.println("Bienvenido al cajero automatico \nUsted tiene un saldo disponible de: "+saldo+"\nIngrese el monto que desea usted retirar");
	   double retiro=sc.nextDouble();
	if(retiro<=saldo && retiro>0){
	   saldo-=retiro;
	   System.out.println("Retiro realizado con exito. Su nuevo saldo es de: "+saldo);
	}else{
	   System.out.println("Monto a retirar invalido. Es mayor al que quiere retirar");
	}
	System.out.println("Desea continuar con alguna otra operacion?(si/no)");
	   continuar=sc.next().toLowerCase();
	}while(!continuar.equals("no"));
	   System.out.println("Gracias por utilizar nuestro cajero. ¡Exito!");
}
}



