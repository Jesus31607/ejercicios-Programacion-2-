public class Ahorro{
public static void main(String args[]){
	
	double saldo=0;
	
	for(int mes=1;mes<=12;mes++){
	saldo+=500;
	saldo*=1.09;

	System.out.printf("\nAl finalizar el mes " + mes + " el ahorro acumulado fue por un monto de: %.2f", + saldo);
	}
	System.out.printf("\nAl finalizar el año el ahorro fue de: %.2f", + saldo);


}
}