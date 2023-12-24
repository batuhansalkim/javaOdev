public class Daire extends Konut implements Comparable<Daire>{

    private String ApartmanNumara;
    private int kiraUcret;
    private int daireSayisi;


    public Daire(String ApartmanNo, int kiraFiyati,  int daireSayisi) {
        super("Doğu Sokak/Orta Mahalle/Söğüt/Bilecik");
        this.kiraUcret = kiraFiyati;
        this.daireSayisi = daireSayisi;
        this.ApartmanNumara= ApartmanNo;
    }

    public String getApartmanNumara() {
        return ApartmanNumara;
    }

    public void setApartmanNumara(String ApartmanNo) {
        this.ApartmanNumara = ApartmanNo;
    }

    public int getKiraUcret() {
        return kiraUcret;
    }

    public void setKiraUcret(int kiraFiyati) {
        this.kiraUcret = kiraFiyati;
    }

    public int getDaireSayisi() {
        return daireSayisi;
    }

    public void setDaireSayisi(int daireSayisi) {
        this.daireSayisi = daireSayisi;
    }
    public void displayInfo() {
        System.out.println("Apartmanin numarasi :" + ApartmanNumara);
        System.out.println("Kira ücreti : " + kiraUcret);
        System.out.println("Daire sayisi: " + daireSayisi);
        super.displayInfo();
        System.out.println("");
    }

    @Override
    public int compareTo(Daire otherDaire) {
        return Integer.compare(this.kiraUcret, otherDaire.kiraUcret);
    }
}