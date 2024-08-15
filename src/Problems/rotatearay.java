package Problems;

import java.util.Arrays;

public class rotatearay {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] revarr = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i>=0 ; i--) {
            revarr[j] = arr[i];
            j++;

        }
        System.out.println(Arrays.toString(revarr));

    }
}
