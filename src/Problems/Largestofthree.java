package Problems;

public class Largestofthree {
    public static void main(String[] args) {
        System.out.println(largest(641,651,785));
    }
    static int largest(int a,int b,int c){
        int great = a;
        if(b>a&&b>c){
            great = b;
        } else if (c>b&&c>a) {
            great = c;
        }
        return great;
    }
}
