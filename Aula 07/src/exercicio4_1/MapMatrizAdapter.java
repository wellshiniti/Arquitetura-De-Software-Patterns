package exercicio4_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMatrizAdapter implements Map {
	private HashMap mapa;

	public MapMatrizAdapter (Object [ ][ ] dados){
		for (int i = 0; i < dados[0].length; i++){
			mapa.put (dados [ 0 ] [ i ], dados[ 1 ] [ i ]);
		}
	}
	
	Object [] [] matriz = new Object [2] [2];
	Map meuMapa = new MapMatrizAdapter (matriz);

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}




	
}
