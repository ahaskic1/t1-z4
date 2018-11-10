package ba.unsa.etf.rpr.t1z4;

public class Student {
    private String ime;
    private String prezime;
    private int broj_indexa;

    public Student(String ime, String prezime, int broj_indexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj_indexa = broj_indexa;
    }
    public String getIme() {
        return this.ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    public int getBroj_indexa() {
        return this.broj_indexa;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBroj_indexa(int broj_indexa) {
        this.broj_indexa = broj_indexa;
    }

}
