package s18_05;

public class RunEncap {


    public static void main(String[] args) {
        Encapsulation om=new Encapsulation();
        om.setName("Jora");
        om.setAge(11);
        om.setIdNum("333d");

        System.out.println("Name:"+om.getName()+" Age:"+om.getAge());
    }

}
