package Problems;

public class SummAndFindingLargestOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 6, 4, 5, };
        sum(a);
        largest(a);
        SecondLargest(a);
    }
    static void sum(int[] a){

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
    static void largest(int[] a){
        int large = a[0];
        for (int i = 1; i < a.length; i++) {
            if(large<a[i]){
                large = a[i];
            }
        }
        System.out.println(large);
    }
    static void SecondLargest(int[] a ){
        int first = a[0];
        int second = 0;
        for (int i = 1; i < a.length; i++) {
            if (first < a[i]) {
                second = first;
                first = a[i];

            } else if (a[i]>second && a[i]!=first) {
                second = a[i];
            }
        }
        System.out.println(second);
    }
}
