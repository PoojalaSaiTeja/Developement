package Problems;

public class isomorphic {
    public static void main(String[] args) {
        String a = "xxy";
        String b = "aab";
        System.out.println(Isomorphic(a,b));
    }
    static boolean Isomorphic(String a,String b){
        if(a.length()==b.length() && count(a)==count(b)){
            return true;
        }
        return false;
    }
    static int count(String a){
        int Count =0;
        if(!a.isEmpty()){
            Count++;
        }
        for (int i = 1; i < a.length(); i++) {
            if(a.charAt(i)==a.charAt(i-1)){
                i++;
            }else{
                Count++;
            }

        }
        return Count;
    }
}
