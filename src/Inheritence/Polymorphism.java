package Inheritence;

public class Polymorphism {
    String dad;
    void person(){
        System.out.println("single");
    }

    void person(String dad){
        this.dad=dad;
        System.out.println("father name = "+ dad);
    }


    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.dad = "bitch";
        poly.person(poly.dad);
        poly.person();
    }
}
