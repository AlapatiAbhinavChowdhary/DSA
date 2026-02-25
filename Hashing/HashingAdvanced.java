import java.util.*;
public class Hashing1 {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",120);
        map.put("usa",30);
        map.put("china",150);
        System.out.println(map);
        map.put("india",130); // Update the value for key "india"
        System.out.println(map);

        if(map.containsKey("china")){
            System.out.println("China is present in the map");
        }else{
            System.out.println("China is not present in the map");
        }

        System.out.println(map.get("usa"));
         // Get the value for key "usa"
         System.out.println(map.get("pakistan")); // Key not present, returns null
         for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
         }

         Set<String> keys=map.keySet();
         for(String key : keys){
            System.out.println(key+" "+map.get(key));
         }

         map.remove("china");
         System.out.println(map);
    }
}
