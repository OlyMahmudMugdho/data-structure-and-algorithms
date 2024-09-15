
import java.util.ArrayList;


public class HashTable<K,V> {
    public int size = 10;

    public ArrayList<V> items;
    
    public HashTable(){
        this.items = new ArrayList<>(10);

        for(int i=0; i<10; i++) {
            this.items.add(null);
        }
    }

    public HashTable(int size){
        this.size = size;
        this.items = new ArrayList<>(size);        

        for(int i=0; i<size; i++) {
            this.items.add(null);
        }
    }



    public void put(K key, V value){
        int hashCode = key.hashCode();
        int index = hashCode % size;
        items.set(index, value);
    }

    public V get(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % size;
        return items.get(index);
    }

}