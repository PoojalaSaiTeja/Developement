package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplic {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,2,5,6,4,9,1,2,5,4,6,7};
//        HashSet<Integer> b = new HashSet<>();
//        for(int i:a){
//            b.add(i);
//        }
        duplicate(a);
    }
    static void duplicate(int[] a){
        int[] b = new int[a.length];
        List<Integer> list = new ArrayList<>();
        b[0]=a[0];

        int k = 1;

        for (int i = 1; i < a.length; i++) {
            boolean x = true;
            for (int j = 0; j <k; j++) {
                if(a[i]==b[j]){
                    list.add(a[i]);
                    x = false;

                }



            }

            if(x==true){

                b[k] = a[i];
                k++;

            }
        }
        System.out.println(list);
    }
}
