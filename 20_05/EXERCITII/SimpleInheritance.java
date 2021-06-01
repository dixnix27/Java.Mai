package s20_05;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();

        //superclass can be used itself
        superOb.i=10;
        subOb.j=20;
        System.out.println("Continutul obiect");
        superOb.showij();

        // subclasa are acces la toti submembrii clasei
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("continutul subob");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Suma i,j,k,in obiect subob");
        subOb.sum();

    }
}
