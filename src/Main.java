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
        Iterator<String> iterator;
        String type;

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
                        while(exit){
                            System.out.println("MENU:");
                            System.out.println("________________________________________________________--");
                            System.out.println("1. Agregar una carta a la coleccion");
                            System.out.println("2. Mostrar el tipo de una carta específica en la coleccion");
                            System.out.println("3. Mostrar el nombre, tipo y cantidad de cada cartas en la coleccion");
                            System.out.println("4. Mostrar el nombre, tipo y cantidad de cada cartas que tiene en su colección, ordenadas por tipo.");
                            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
                            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
                            System.out.println("________________________________________________________--");
                            System.out.println("Seleccione una opcion:");
                            int opt = scan.nextInt();

                            cardNames = file.ReadName();
                            cardType = file.ReadType();

                            if (opt == 1) {
                                for(int i=0; i<cardNames.size();i++){
                                    map.put(cardNames.get(i),cardType.get(i));
                                }
                                while(valid == false){
                                    System.out.println("");
                                    System.out.println("Ingrese el nombre de la carta que desea agregar: ");
                                    String name = scan.nextLine();

                                    System.out.println("");
                                    System.out.println("Ingrese el tipo de la carta que desea agregar: ");
                                    type = scan.nextLine();
                                    if(map.containsValue(type)){
                                        map.put(name,type);
                                        iterator = map.keySet().iterator();
                                        while(iterator.hasNext()){
                                            String key = iterator.next();
                                            System.out.println("Nombre Carta: (" + key + ") -> Tipo: (" + map.get(key)+")");
                                        }
                                        System.out.println("\n-Se ha agregado con exito");
                                        valid = true;
                                    }else{
                                        System.out.println("-Lo siento... El tipo que desea agregar no exite en el juego...");
                                        continue;
                                    }
                                }
                            }
                            if (opt == 5) {
                                for(int i=0; i<cardNames.size();i++){
                                    map.put(cardNames.get(i),cardType.get(i));
                                }
                                iterator = map.keySet().iterator();
                                while(iterator.hasNext()){
                                    String key = iterator.next();
                                    System.out.println("Nombre de la carta: " + key + " -> Tipo: " + map.get(key));
                                }
                                System.out.println("---------------------------------");
                            }
                            if (opt == 6) {
                                iterator = map.keySet().iterator();
                                while(iterator.hasNext()){
                                    String key = iterator.next();
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
