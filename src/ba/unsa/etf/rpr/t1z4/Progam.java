package ba.unsa.etf.rpr.t1z4;

public class Progam {

    public static void main(String[] args) {
        Predmet rpr = new Predmet("rpr",1, 30);
        Student asim = new Student("asim", "haskic", 17735);
        System.out.println(rpr.getNaziv_predmeta() + rpr.getSifra_predmeta() + rpr.getMax_broj_studenata());
        rpr.setNaziv_predmeta("RPR");
        rpr.setSifra_predmeta(100);
        System.out.println(rpr.getNaziv_predmeta() + rpr.getSifra_predmeta() + rpr.getMax_broj_studenata());
        System.out.println(asim.getIme() + asim.getPrezime() + asim.getBroj_indexa());
        asim.setIme("ASIM");
        asim.setPrezime("HASKIC");
        asim.setBroj_indexa(0);
        System.out.println(asim.getIme() + asim.getPrezime() + asim.getBroj_indexa());
	// write your code here
    }
}
