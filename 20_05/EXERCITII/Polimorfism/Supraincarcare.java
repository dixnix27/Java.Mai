package s20_05.Polimorfism;

public class Supraincarcare {
    void demo(int a){
        System.out.println("a="+a);
    }
    void demo(int a,int b){
        System.out.println("b="+b);
    }
    double demo(double c){
        System.out.println("double c="+c);
        return c*c;
    }
}
