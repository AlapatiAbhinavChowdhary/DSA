//power of hanoi
// public class recursion2 {

//     public static void towerofhanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("Move disk 1 from "+src+" to "+dest);
//             return;
//         }
//         towerofhanoi(n-1,src,dest,helper);
//         System.out.println("Move disk "+n+" from "+src+" to "+dest);
//         towerofhanoi(n-1,helper,src,dest);
//     }
//     public static void main(String[] args){
//         int n=2;
//         towerofhanoi(n,"S","H","D");
//     }
// }



//print string in reverse
// public class recursion2{
//     public static void printrev(String str,int idx){
//         if(idx==0){
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.println(str.charAt(idx));
//         printrev(str,idx-1);
//     }
//     public static void main(String[] args){
//         String str="abcd";
//         printrev(str,str.length()-1);
//     }
// }




//find the 1st & last occurance of an element in string
// public class recursion2{
//     public static int first=-1;
//     public static int last=-1;
//     public static void findocc(String str,int idx,char target){
//         if(idx==str.length()){
//             System.out.println("First occurance: "+first);
//             System.out.println("Last occurance: "+last);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         if(currchar==target){
//             if(first==-1){
//                 first =idx;

//             }else{
//                 last=idx;
//             }
//         }
//         findocc(str,idx+1,target);
//     }
//     public static void main(String[] args){
//         String str="abcaeraca";
//         findocc(str,0,'a');

//     }
// }



//check if array is sorted strictly increasing
// public class recursion2{
//     public static boolean issorted(int arr[], int idx){
//        if(idx==arr.length-1){
//             return true;
//        } 
//        if(arr[idx]<arr[idx+1]){
//             return issorted(arr,idx+1);
//        }else{
//             return false;
//        }

//     }
//     public static void main(String[] args){
//         int arr[] ={1,2,3,4,4};
//         System.out.println(issorted(arr,0));
//     }
// }


//move all x to the end of string
// public class recursion2{
//     public static void moveallx(String str,int idx,int count,String newString){
//         if(idx==str.length()){
//             for(int i=0;i<count;i++){
//                 newString+='x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         if(currchar=='x'){
//             count++;
//             moveallx(str,idx+1,count ,newString);
//         }else{
//             newString+=currchar;
//             moveallx(str,idx+1,count,newString);
//         }
//     }
//     public static void main(String[] args){
//         String str="axbcxxd";
//         moveallx(str,0,0,"");
//     }
// }


//remove dupliates in string
// public class recursion2{
//     public static boolean[] map=new boolean[26];
//     public static void removedup(String str,int idx,String newstring){
//         if(idx==str.length()){
//             System.out.println(newstring);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         if(map[currchar-'a']){
//             removedup(str,idx+1,newstring);
//         }else{
//             newstring+=currchar;
//             map[currchar-'a']=true;
//             removedup(str,idx+1,newstring);
//         }

//     }
//     public static void main(String[] args){
//         String str="aabbccdd";
//         removedup(str,0,"");

//     }
// }




//print all the subsequence of a string
// public class recursion2{
//     public static void subseq(String str,int idx,String newstring){
//         if(idx==str.length()){
//             System.out.println(newstring);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         //to be
//         subseq(str,idx+1,newstring+currchar);
//         //not to be
//         subseq(str,idx+1,newstring);
//     }

//     public static void main(String[] args){
//         String str="abc";
//         subseq(str,0,"");
//     }

// }




//print keypad combination

public class recursion2{
    public static String[] keypad={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombo(String str,int idx,String comb){
        if(idx==str.length()){
            System.out.println(comb);
            return;
        }
        char currchar=str.charAt(idx);
        String mapping=keypad[currchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printcombo(str,idx+1,comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args){
        String str="23";
        printcombo(str,0,"");
    }
}
 