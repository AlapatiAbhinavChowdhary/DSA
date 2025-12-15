public class patterns {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print(" ");
            }

            char ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }

            ch--;
            for(int j=0;j<i;j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
