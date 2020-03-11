/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		

		Factory fact = new Factory();
		
		System.out.println("------------------\n|   Bienvenido   |\n------------------");


		File archive = new File("cards_desc.txt");
		if(archive.exists()){
			
			Scanner scan = new Scanner(System.in);

			boolean exit = true;
			while (exit){
				System.out.println("Con que mapa desea trabajar?\n1. LinkedHashMap\n2. HashMap\n3. TreeMap\n4. Salir");
				try{
					int option = scan.nextInt();
					if (option >4 || option < 1){
						throw new Exception();
					}else if(option == 4){
						exit = false;
					}else{
						IMap<String, String> original = fact.getType(option);
						IMap<String, String> colection = fact.getType(option);



					}
				}catch(Exception e){
					System.out.println("\n\nLa opcion seleccionada no es valida\n\n");
				}	
			}
			
			


		}

		else{
			System.out.println("El archivo seleccionado no existe");
		}

	}
}