package s18_05;

public class Circle {
    //variabile cu acces privat

    private double radius;
    private String color;

    //Constructori supraincarcati
    public Circle(){
        radius=1.0;
        color="red";
    }

    public Circle(double r){
        radius=r;
        color="red";
    }

    public Circle(double r,String c){
        radius=r;
        color=c;
    }

    //Metode cu acces public- Getteri

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }



}
