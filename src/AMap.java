/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */

import java.util.*

public abstract class AMap<K,V> implements IMap<K,V>{

	public boolean isEmpty(){
		return size ==0;
	}
}