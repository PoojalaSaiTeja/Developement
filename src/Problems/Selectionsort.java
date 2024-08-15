package Problems;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] a = {10,6,8,9,7,3,1,4,2,5};
        //Selection(a);
        //bubblesort(a);
        circlesort(a);
        System.out.println(Arrays.toString(a));
    }
    static void swap(int[] c,int a,int b){
        int temp  = c[a];
        c[a]=c[b];
        c[b]=temp;
    }
    static int max(int[] a,int last){
        int maxi = 0;
        for (int i = 1; i<=last; i++) {
            if(a[i]>a[maxi]){
                maxi = i;
            }
        }
        return maxi;
    }
    static void Selection(int[] a){
        for (int i = 0; i < a.length; i++) {
            int last  =  a.length-i-1;
            int x = max(a,last);
            swap(a,x,last);
        }
    }
    static void bubblesort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <a.length-i; j++) {
                if(a[j]<a[j-1]){
                    swap(a,j-1,j);
                }
            }
        }
    }
    static void circlesort(int[] a){
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                int crct = a[j]-1;
                if (a[j] != a[crct]) {
                    swap(a, j, crct);
                }
            }
        }
    }
}
