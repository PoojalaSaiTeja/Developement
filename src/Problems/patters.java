package Problems;

public class patters {
    public static void pattern1(int n) {
        
        for (int i = 0; i <2*n; i++) {
            int c = i>n ? 2*n-i:i;
            for (int j =0 ; j<c; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3(5);
    }
}
