package s18_05;

public class TestCirlce {
    public static void main(String[] args) {

        //Cream obiect al clasei circle cu numele c1
        Circle c1=new Circle(2,"blue");
        System.out.println("Radius="+c1.getRadius()+" Culoare="
                +c1.getColor()+" Suprafata="+c1.getArea());

        Circle c2=new Circle(3);
        System.out.println("Radius="+c2.getRadius()+" Culoare="
                +c2.getColor()+" Suprafata="+c2.getArea());

        Circle c3=new Circle();
        System.out.println("Radius="+c3.getRadius()+" Culoare="
                +c3.getColor()+" Suprafata="+c3.getArea());

    }
}
