package Problems;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int i =1;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(rev("Sai"));
        System.out.println(rev2(1122));
    }
    static String rev(String a){
       char[] b = a.toCharArray();
        for (int i = 0; i < b.length/2; i++) {
            int last = b.length-1;
            char temp = b[i];
            b[i] = b[last-i];
            b[last-i] = temp;
        }
        return new String(b);
    }
    static int rev2(int a){
        int palinnum = 0, rem;
        while (a > 0) {
            rem = a % 10;
            palinnum = palinnum * 10 + rem;
            a = a / 10;
        }
        return palinnum;
    }
}
