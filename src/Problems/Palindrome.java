package Problems;

public class Palindrome{
    public static void main(String[] args) {
        System.out.println(palindrome(123454321));
        System.out.println(palindrome2("qwertrewq"));
    }

    static boolean palindrome(long a) {
            if (a < 0 || (a % 10 == 0 && a != 0)) {
                return false;
            }
            long palinnum = 0, rem,original =a;
            while (a > 0) {
                rem = a % 10;
                palinnum = palinnum * 10 + rem;
                a = a / 10;
            }
            return palinnum == original;

    }
    static boolean palindrome2(String a){
        int st = 0;
        int b = a.length()-1;
        while(st<b){
            if(a.charAt(st)==a.charAt(b)){
                st++;
                b--;
            }else{
                return false;
            }
        }
        return true;


    }
}


