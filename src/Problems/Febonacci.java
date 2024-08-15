package Problems;
class Febonacci{
    public static void main(String[] args) {

        System.out.println(fi(130));
    }
    static  int fi(int a){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        return fi(a-1)+fi(a-2);
    }
}