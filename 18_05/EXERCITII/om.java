package s18_05;

public class om {
    public String nume,prenume,functia;
    private double salariu;

    public double getSalariu(){
        return salariu;
    }
    public void setSalariu(double s){
        this.salariu=s;
    }


    public static void main(String[] args) {
        om om1=new om();
        om1.setSalariu(1000);
        System.out.println(om1.getSalariu());
    }

}
