package Problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long fact = 1L;
        for (int i = 2; i <=a ; i++) fact *= i;

    }
}
