public class Lowtohigh_hightolow_instringofchar {
    public static void main(String[] args){
        String str="WcEssA";
        StringBuilder result=new StringBuilder();
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else{
                result.append(Character.toUpperCase(c));
            }
        }
        System.out.println(result.toString());
    }
}




class Main{
    public static void main(String[] args){
        String inp = " WcEssA";
        String result = "";
        for(char c:inp.toCharArray()){
            if(c>='A'&&c<='Z'){
                result += (char)(c+32);
            }
            else if(c>='a'&&c<='z'){
                result += (char)(c-32);
            }
            else{
                result += c;
            }
        }
        System.out.println(result);
    }
}