import java.util.*;
public class travel {
    public static String getstart(HashMap<String,String> tickets){
        HashMap<String,String> rev=new HashMap<>();
        for(String key:tickets.keySet()){
            rev.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai","Banglore");
        tickets.put("Bombay","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start=getstart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start=tickets.get(start);
        }
        System.out.println(start);
    }
}
