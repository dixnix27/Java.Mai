package s20_05;

public class Rectangle extends Forma{


     void perimetru(double x,double y){
        double result=(2*x)+(2*y);
         System.out.println(result);
    }


    public static void main(String[] args) {
        Rectangle a=new Rectangle();
        a.a=1;
        a.b=3;
        System.out.println(a.a+" "+a.b);
        a.perimetru(a.a,a.b);
    }

}
