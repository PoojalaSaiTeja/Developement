package Problems;

public class IsITPrimeOrNot {
    public static void main(String[] args) {
        System.out.println(prime(200));
    }
    static boolean prime(int a){
        for (int i = 2; i <= a/2; i++) {
            if (a%i==0){
                return false;
            }else{
                i++;
            }
        }
        return true;

    }

}
