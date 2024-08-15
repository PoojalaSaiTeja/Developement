package Inheritence;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(double h,double l,double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
