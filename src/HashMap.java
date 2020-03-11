/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */

import java.util.*;

public class HashMap<K,V> extends AMap<K,V>{

	protected HashMap<K,V> map;

	public HashMap(){
		map = new HashMap<K,V>();
	}

	public void clear(){
		map.clear();
	}

	public V get(Object key){
		return map.get(key);
	}

	public V put(K key, V value){
		return map.put(key, value);
	}

	public V remove(Object key, Object value){
		return map.remove(key, value);
	}

	public int size(){
		return map.size();
	}
}