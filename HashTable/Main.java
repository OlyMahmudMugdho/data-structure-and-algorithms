/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        HashTable<String,Integer> ageTable = new HashTable<>(2);
        ageTable.put("Mila", 24);
        ageTable.put("Mugdho", 23);

        System.out.println(ageTable.get("Mila"));
        System.out.println(ageTable.get("Mugdho"));
}
}