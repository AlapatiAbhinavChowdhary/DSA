public class smallandlargeascii_instr {
    public static void main(String[] args){
        String str="LovelyProfessionaluniversity";
        int small=122,large=65;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>large){
                large=str.charAt(i);
            }else if(str.charAt(i)<small){
                small=str.charAt(i);
            }else{
                continue;
            }
        }
        System.out.println("Smallest character: "+(char)small);
        System.out.println("Largest character: "+(char)large);
    }
}
