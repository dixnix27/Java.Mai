package s18_05;

public class Cutie {

    double latime;
    double inaltime;
    double adancime;

    // Acesta este constructorul clasei Cutie

    Cutie(double l,double i,double a){
        latime = l;
        inaltime = i;
        adancime = a;

    }

    // Calculam si returnam volumul

    double volum(){
        return latime*adancime*inaltime;
    }

    }


