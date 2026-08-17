import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Creating a new String hashmap
        HashMap<String, String> nameHashMap = new HashMap<>();

        //Adding values to the map
        nameHashMap.put("Idan", "Magen");
        nameHashMap.put("John", "Smith");
        nameHashMap.put("Jane", "Doe");
        System.out.println(nameHashMap);

        //Remove value form the hash map
        nameHashMap.remove("John", "Smith");
        System.out.println(nameHashMap);

        //Overwriting values
        nameHashMap.put("Jane", "Smith");
        System.out.println(nameHashMap);

        //Getting values by key
        System.out.println(nameHashMap.get("Idan"));
    }
}
