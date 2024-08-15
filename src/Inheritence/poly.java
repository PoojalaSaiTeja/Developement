package Inheritence;

public class poly extends Polymorphism{
    void person(){
        System.out.println("i am happy to be fucked up");
    }
    void person(String dad){
        System.out.println("let me fuck you "+ dad);
    }
    void person(poly dad){
        System.out.println();
    }

    public static void main(String[] args) {

        poly poli = new poly();
        Polymorphism poli2 = new poly();
        poli.person("george");
        poli2.dad = "teja";
        poli2.person(poli.toString());



    }
}
