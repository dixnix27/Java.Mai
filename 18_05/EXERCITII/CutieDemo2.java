package s18_05;

public class CutieDemo2 {
    public static void main(String[] args) {

        // Declaram si alocam memo pt cutie
        Cutie cutia1=new Cutie(1,2,3);
        Cutie cutia2=new Cutie(10,20,30                                                                                                                                                                                                                                                                                                                                                                                                        );

        double vol;

        //Primim volumul primei cutii
        vol=cutia1.volum();
        System.out.println("vol="+vol);

        vol=cutia2.volum();
        System.out.println("vol="+vol);






    }
}
