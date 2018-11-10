package ba.unsa.etf.rpr.t1z4;

public class Predmet {
    private Student [] studenti;
    private String naziv_predmeta;
    private int sifra_predmeta;
    private int max_broj_studenata;
    private int br_studenata;


    public Predmet(String naziv_predmeta, int sifra_predmeta, int max_broj_studenata) {
        this.naziv_predmeta = naziv_predmeta;
        this.sifra_predmeta = sifra_predmeta;
        this.max_broj_studenata = max_broj_studenata;
        this.br_studenata = 0;
        this.studenti = new Student[max_broj_studenata];
    }
    public void upisi(Student s) {
        //if(br_studenata + 1 == max_broj_studenata)   //bacit izuzetak.
        studenti[br_studenata] = new Student(s.getIme(),s.getPrezime(),s.getBroj_indexa());
        br_studenata++;
    }
    public void ispisi(Student s) {
        int i = 0;
        for(i=0;i<br_studenata;i++){
            if(studenti[i].getIme().equals(s.getIme()) && studenti[i].getPrezime().equals(s.getPrezime()) && studenti[i].getBroj_indexa() == s.getBroj_indexa()) {
                int j = 0;
                Student pomocni;
                for(j=i; j<br_studenata-1; j++) {
                    pomocni = studenti[j];
                    studenti[j] = studenti[j+1];
                    studenti[j+1] = pomocni;
                }
                br_studenata--;
            }
        }
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
    public void ispis() {
        int i = 0;
        for(i = 0; i<br_studenata;i++) {
            System.out.println(i+1 + ". " + studenti[i].getPrezime() + " " + studenti[i].getIme() + " (" + studenti[i].getBroj_indexa() + ")");
        }
    }
}
