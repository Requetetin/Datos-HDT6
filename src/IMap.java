/**
 * @author Martin Amado 19020, Jose Abraham Gutierrez 19111
 * @date 11/03/2020
 * Hoja de trabajo 6
 */

import java.util.*;

interface IMap<K,V>{

	/*
	*
	* @param 
	* pre: Map is not empty
	* post: Map is empty
	*
	*/
	public void clear();

	/*
	*
	* @param: key 
	* pre: Map is not empty
	* post: Returns the value of the specified key
	*
	*/
	public V get(Object key);

	/*
	*
	* @param 
	* pre: 
	* post: Returns true if map is empty
	*
	*/
	public boolean isEmpty();

	/*
	*
	* @param key, value
	* pre: 
	* post: The map has a new item
	*
	*/
	public V put(K key, V value);

	/*
	*
	* @param key, value
	* pre: Map is not empty
	* post: Returns value
	*
	*/
	public boolean remove(Object key, Object value);

	/*
	*
	* @param 
	* pre: Map is not empty
	* post: Returns number of key-value mappings
	*
	*/
	public int size();

	/*
	*
	* @param value
	* pre: Map is not empty
	* post: Returns true if value is contained
	*
	*/
	public boolean containsValue(Object value);

	/*
	*
	* @param 
	* pre: Map is not empty
	* post: Returns a set of keys in this map
	*
	*/
	public Set<K> keySet();	
}