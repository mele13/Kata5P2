package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram_v2<T> {
    private final Map<T, Integer> map = new HashMap<>();
    
    /**
     * Método que recibe un objeto genérico key y devuelve un valor 
     * asociado a una clave.
     * 
     * @param key objeto genérico
     * @return valor asociado a una clave
     */
    public Integer get(T key) {
        return this.map.get(key);
    }
    
    /**
     * Método genérico sin parámetros que devuelve map.keySet().
     * 
     * @return map.keySet()
     */
    public Set<T> keySet() {
        return this.map.keySet();
    }
    
    /**
     * Método que recibe como parámetro un tipo genérico llamado key. El mapa 
     * se rellena a través de un operador ternario. Si el mapa contiene la clave, 
     * se guarda su valor correspondiente + 1. Si no, guardamos 1.
     * 
     * @param key objeto genérico
     */
    public void increment(T key) {
        this.map.put(key, map.containsKey(key) ? this.get(key) +1 : 1);
    } 
}