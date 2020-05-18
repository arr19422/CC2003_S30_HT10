import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Clase principal para la traduccion del archivo
 * @author Diego de Jesus
 *
 */
public class principal {

	
	public static void main(String[] args) {
		
		/**
		 * Variables 
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seleccione la opcion a utilizar: ");
		System.out.println("1. Ver la Ruta Mas Corta Entre 2 Departamentos ");
		System.out.println("2. Nombre de la Ciudad Central ");
		System.out.println("3. Modificar distancias entre departamentos ");
		System.out.println("4. Salir ");
		
		int opcion= entrada.nextInt();
		
		//Si se desea la implementacion por hashmap
		if(opcion==1) {
			
		}
		//Si se desea la implementacion por splay Tree
		else if (opcion==2) {
			Maker make = new Maker();
			make.generateGraph();
		}else if (opcion==3) {
			
		}else if (opcion==4) {
			
		}else {
			System.out.println("**************************************");
			System.out.println("Ingreso Incorrecto, Intentelo de Nuevo");
			System.out.println("**************************************");
		}
	}
}
