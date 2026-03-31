package Arrays;


import java.util.*;
public class SwapElements {
    public static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + " b=" + b);
    }

    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        swapping(a, b);
    }
}
