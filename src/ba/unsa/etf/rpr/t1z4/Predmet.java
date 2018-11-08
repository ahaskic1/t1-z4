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
    public String getNaziv_predmeta() {
        return this.naziv_predmeta;
    }
    public int getSifra_predmeta() {
        return this.sifra_predmeta;
    }
    public int getMax_broj_studenata() {
        return this.max_broj_studenata;
    }
    public void setNaziv_predmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }
    public void setSifra_predmeta(int sifra_predmeta) {
        this.sifra_predmeta = sifra_predmeta;
    }

}
