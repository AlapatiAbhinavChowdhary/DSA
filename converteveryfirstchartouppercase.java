public class converteveryfirstchartouppercase {
    public static void main(String[] args){
        String str="hello world. the world is beautiful.";
        for(int i=0;i<str.length();i++){
            if(i==0 || str.charAt(i-1)==' '){
                if(str.charAt(i)>=97 && str.charAt(i)<=122){
                    System.out.print((char)(str.charAt(i)-32));
                } else {
                    System.out.print(str.charAt(i));
                }
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
