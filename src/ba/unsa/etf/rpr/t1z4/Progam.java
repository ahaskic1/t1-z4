package ba.unsa.etf.rpr.t1z4;


public class Progam {

    public static void main(String[] args) {
        Predmet rpr = new Predmet("rpr", 1, 30);
        Student asim1 = new Student("asim", "haskic", 17735);
        Student asim2 = new Student("Asim", "haskic", 17735);
        Student asim3 = new Student("ASim", "haskic", 17735);
        rpr.upisi(asim1);
        rpr.upisi(asim2);
        rpr.upisi(asim3);
        rpr.ispis();
        rpr.ispisi(asim1);
        rpr.ispis();
        // write your code here
    }
}
