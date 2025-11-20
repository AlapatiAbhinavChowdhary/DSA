import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate, will not be added
        System.out.println("size of set " + set.size());
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        if(!set.contains(4)){
            System.out.println("Set does not contain 4");
        }
        set.remove(3);
        if(!set.contains(3)){
            System.out.println("Set does not contain 3 after removal");
        }
        System.out.println("Elements in the set:"+set);

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
