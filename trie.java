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
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null){
                root.children[idx]=new Node();
            }
            if(i==word.length()-1){
                root.children[idx].isend=true;
            }
            root=root.children[idx];
        }
    }


    public static boolean search(String key){
        
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(root.children[idx]==null){
                System.out.println("word not found");
                return false;
            }
            if(i==key.length()-1 && root.children[idx].isend==false){
                System.out.println("word not found");
                return false;
            }
            root=root.children[idx];
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
