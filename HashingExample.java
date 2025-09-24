import java.util.*;
public class HashingExample {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        System.out.println(map.get("Apple"));

        map.put("apple",4);
        map.remove("Banana");

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    

   
}
