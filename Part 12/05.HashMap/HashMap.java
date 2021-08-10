 
import java.util.ArrayList;
import java.util.List;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class HashMap<K, V> {
 
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;
 
    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }
 
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
 
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
 
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
 
        return null;
    }
 
    private void grow() {
        // crete a new array
        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];
 
        copy(newValues, 0);
 
        // replace the old array with the new one
        this.values = newValues;
    }
 
    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);
 
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }
 
            newArray[hashValue].add(value);
        }
    }
}
 
