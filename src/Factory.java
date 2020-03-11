/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Factory{

	public IMap getType(int option){

		if(option == 1){
			return new LHMap();
		}else if(option == 2){
			return new HMap();
		}else{
			return new TMap();
		}
		
	}
}
/*
	public Map<String, String> getMap(String mapType){

		if(mapType == null){
			System.out.println("-Se ha ingresado un valor no valido, por favor ingresar de nuevo...");
			return null;
		}

		if(mapType.equalsIgnoreCase("HashMap")){
			return new HashMap<String, String>();
		}

		if(mapType.equalsIgnoreCase("TreeMap")){
			return new TreeMap<String, String>();
		}

		if(mapType.equalsIgnoreCase("LinkedHashMap")){
			return new LinkedHashMap<String, String>();
		}
		System.out.println("-Se ha ingresado un valor no valido, por favor ingresar de nuevo...");
		return null;
	}
	
}*/

