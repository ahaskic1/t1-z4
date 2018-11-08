package ba.unsa.etf.rpr.t1z4;

public class Predmet {
    private Student [] studenti;
    private String naziv_predmeta;
    private int sifra_predmeta;
    private int max_broj_studenata;

    public Predmet(String naziv_predmeta, int sifra_predmeta, int max_broj_studenata) {
        this.naziv_predmeta = naziv_predmeta;
        this.sifra_predmeta = sifra_predmeta;
        this.max_broj_studenata = max_broj_studenata;
    }

}
