public class trie {
    static class Node{
        Node[] children;
        boolean isend;
        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            } 
            isend=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].isend=true;
            }
            curr=curr.children[idx];
        }
    }


    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                System.out.println("word not found");
                return false;
            }
            if(i==key.length()-1 && curr.children[idx].isend==false){
                System.out.println("word not found");
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    
    public static void main(String[] args){
        String words[]={"apple","app","bat","ball"};  
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key="bat";
        System.out.println(search(key));
    }
}
