package Graphs;
import java.util.*;
public class Creation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        ArrayList<Integer>[] graph=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1;i<=n;i++){
            System.out.println(i+"->"+graph[i]);
        }

    }
}
