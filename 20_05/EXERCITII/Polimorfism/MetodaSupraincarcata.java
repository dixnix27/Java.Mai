package s20_05.Polimorfism;

public class MetodaSupraincarcata {
    public static void main(String[] args) {
        Supraincarcare obj=new Supraincarcare();
        double result;
        obj.demo(10);
        obj.demo(10,28);
        result=obj.demo(5.5);
        System.out.println("5.5*5.5"+result);
    }
}
