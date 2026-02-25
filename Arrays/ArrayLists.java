import java.util.ArrayList;
import java.util.Collections;
class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println(num);

        int ele=num.get(1);
        System.out.println(ele);

        //add ele in btw
        num.add(1,1);
        System.out.println(num);



        //set ele
        num.set(2,100);
        System.out.println(num);

        //remove ele
        num.remove(2);
        System.out.println(num);

        int size=num.size();
        System.out.println(size);


        //loop to iterate
        for(int i=0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
        }

        //sorting
        Collections.sort(num);
        System.out.println("\n"+num);
    }
}
