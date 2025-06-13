package IonCarlos;

import java.util.ArrayList;
import java.util.Date;

public class ImprimirIonCarlosGrosu {
	
	public void imprimirDatosJulioHornos(String nombre, String apellido, int AnyoNacimiento, String ciudadNac) {
		

		// serie de Fibonacci
		ArrayList<Integer> miArray = new ArrayList();	
		int m = 0, j = 1, k = 1;
		miArray.add(m);		
		while (j < AnyoNacimiento) {
			miArray.add(j);
			k = j;
			j = m+j;
			m = k;												
		}										
		
		
		int contador = 0;
		String caracter;				
		for (int i = 0; i < nombre.length(); i++) {
			caracter = nombre.substring(i,i+1).toLowerCase();						
			switch (caracter) { 
			    case "a", "e", "i", "o", "u":		     	
			     	break;		   
			    default:
			    	contador ++;
			    	break;			    		    
			} 			
		}			
		
		if (contador>4) System.out.println("El nombre tiene muchas consonantes"); 
		else System.out.println("El nombre tiene pocas consonantes");

		
		if(ciudadNac.equalsIgnoreCase("Madrid")) {
			System.out.println("El alumno estudia en la misma ciudad que nació");
		} else {
			System.out.println("El alumno NO estudia en la misma ciudad que nació");
		}
		
		int suma = 0;		
		String AnyoNacimientoString = Integer.toString(AnyoNacimiento);
		
		for (int i =0; i< AnyoNacimientoString.length(); i++) {
			suma += Integer.parseInt(AnyoNacimientoString.substring(i, i+1));
		}
		
		System.out.println("La suma de tu año de nacimiento es " + suma);

		contador = 0;
		for (int i = 0; i < apellido.length(); i++) {
			caracter = apellido.substring(i,i+1).toLowerCase();					
			switch (caracter) { 
			    case "a", "e", "i", "o", "u":
			    	contador ++;	
			     	break;		   
			    default:
			    	break;
			    		    	
			} 		
		}			
	
		if (contador>4) System.out.println("El apellido tiene muchas consonantes");
		else System.out.println("El apellido tiene pocas consonantes");
		
		System.out.println("La serie de Fibonacci de numeros menores a tu año de nacimiento es: "+miArray);
	}

}
