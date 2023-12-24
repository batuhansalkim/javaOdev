// Konut sınıfından türetilmiş Daire sınıfı
public class Daire extends Konut implements Comparable<Daire> {

    // Daire sınıfına ait değişkenler
    private String ApartmanNumara; // Apartman numarası
    private int kiraUcret; // Kira ücreti
    private int daireSayisi; // Daire sayısı

    // Daire sınıfının kurucu metodudur
    public Daire(String ApartmanNo, int kiraFiyati, int daireSayisi) {
        super("Doğu Sokak/Orta Mahalle/Söğüt/Bilecik"); // Üst sınıfın kurucu metodunu çağırır
        this.kiraUcret = kiraFiyati;
        this.daireSayisi = daireSayisi;
        this.ApartmanNumara = ApartmanNo;
    }

    // Apartman numarasını döndüren metod
    public String getApartmanNumara() {
        return ApartmanNumara;
    }

    // Apartman numarasını ayarlayan metod
    public void setApartmanNumara(String ApartmanNo) {
        this.ApartmanNumara = ApartmanNo;
    }

    // Kira ücretini döndüren metod
    public int getKiraUcret() {
        return kiraUcret;
    }

    // Kira ücretini ayarlayan metod
    public void setKiraUcret(int kiraFiyati) {
        this.kiraUcret = kiraFiyati;
    }

    // Daire sayısını döndüren metod
    public int getDaireSayisi() {
        return daireSayisi;
    }

    // Daire sayısını ayarlayan metod
    public void setDaireSayisi(int daireSayisi) {
        this.daireSayisi = daireSayisi;
    }

    // Bilgileri ekrana yazdıran metod
    public void displayInfo() {
        System.out.println("Apartmanın numarası: " + ApartmanNumara);
        System.out.println("Kira ücreti: " + kiraUcret);
        System.out.println("Daire sayısı: " + daireSayisi);
        super.displayInfo(); // Üst sınıfın displayInfo metodunu çağırır
        System.out.println("");
    }

    // Comparable arayüzünden türetilen compareTo metodudur
    // Daireleri kira ücretine göre karşılaştırır
    @Override
    public int compareTo(Daire otherDaire) {
        return Integer.compare(this.kiraUcret, otherDaire.kiraUcret);
    }
}