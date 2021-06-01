package s20_05.ex3;

public class JavaExample extends Teacher{
    String mainsubject="Physics";
    public static void main(String[] args) {
        JavaExample obj=new JavaExample();

//        We arent accesing the data members directly,
//        we are using public getter and setter methods
//        to acced the private members of a parent class
        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainsubject);
        obj.does();




    }
}
