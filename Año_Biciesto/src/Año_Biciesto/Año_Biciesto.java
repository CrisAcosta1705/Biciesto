package Año_Biciesto;
import java.util.Scanner;
public class Año_Biciesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla =  new Scanner(System.in);
		int año;
		
		System.out.println("Ingrese el Año");
		año = tecla.nextInt();
		
		if ((año%4 == 0) && (año%100 != 0 || año%400 == 0)) {
		System.out.println("Año biciesto");
		} else {
		System.out.println("Año no biciesto");
		}
	}

}
