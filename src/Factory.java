/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */

public class Factory{
	public IMap getType(int option){

		if(option == 1){
			return new LinkedHashMap();
		}else if(option == 2){
			return new HashMap();
		}else{
			return new TreeMap();
		}
		
	}
}