/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){


        Factory fact = new Factory();
        ArrayList<String> cardNames= new ArrayList<String>();
        ArrayList<String> cardType = new ArrayList<String>();
        Map<String, String> map = null;
        fileRead file = new fileRead();
        boolean valid = false;
        Iterator<String> it;
        String type;
        IMap original;
        IMap collection;

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
                        original = fact.getType(option);
                        collection = fact.getType(option);
                        cardNames = file.ReadName();
                        cardType = file.ReadType();

                        for(int i=0; i<cardNames.size();i++){
                            original.put(cardNames.get(i),cardType.get(i));
                        }




                        while(exit){
                            System.out.println("MENU:");
                            System.out.println("________________________________________________________--");
                            System.out.println("1. Agregar una carta a la coleccion");
                            System.out.println("2. Mostrar el tipo de una carta específica en la coleccion");
                            System.out.println("3. Mostrar el nombre, tipo y cantidad de cada cartas en la coleccion");
                            System.out.println("4. Mostrar el nombre, tipo y cantidad de cada cartas que tiene en su colección, ordenadas por tipo.");
                            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
                            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
                            System.out.println("7. Salir");
                            System.out.println("________________________________________________________--");
                            System.out.println("Seleccione una opcion:");
                            int opt = scan.nextInt();


                            if(opt == 7){
                                exit = false;
                            }

                            

                            else if (opt == 1) {
                            
                                while(valid == false){
                                    System.out.println("");
                                    scan.nextLine();
                                    System.out.println("Ingrese el nombre de la carta que desea agregar: ");
                                    String name = scan.nextLine();

                                    try{
                                        collection.put(name,original.get(name));
                                        System.out.println("Se ha agregado con exito la carta:\n"+name+" tipo: "+collection.get(name));
                                        valid = true;

                                    }catch(Exception e){
                                        System.out.println("La carta ingresada no existe");
                                    }
                                    
                                    
                                }
                            }

                            
                            if (opt == 5) {
                                for(int i=0; i<cardNames.size();i++){
                                    map.put(cardNames.get(i),cardType.get(i));
                                }
                                it = map.keySet().iterator();
                                while(it.hasNext()){
                                    String key = it.next();
                                    System.out.println("Nombre de la carta: " + key + " -> Tipo: " + map.get(key));
                                }
                                System.out.println("---------------------------------");
                            }
                            if (opt == 6) {
                                it = map.keySet().iterator();
                                while(it.hasNext()){
                                    String key = it.next();
                                    System.out.println("Nombre de la carta: " + key + " -> Tipo: " + map.get(key));
                                }
                                System.out.println("---------------------------------");
                            }
                        }
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
