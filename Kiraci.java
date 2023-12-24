// Kiraci sınıfı
public class Kiraci {

    // Kiraci sınıfına ait değişkenler
    private String kiraciAd; // Kiracının adı
    private String kiraciSoyad; // Kiracının soyadı
    public evSahibi kiraciEvSahibi; // Kiracının ev sahibi
    private Daire kiraciDaire; // Kiracının daire bilgisi

    // Kiraci sınıfının kurucu metodudur
    public Kiraci(String ad, String soyad, evSahibi evsahibi) {
        this.kiraciAd = ad;
        this.kiraciSoyad = soyad;
        this.kiraciEvSahibi = evsahibi;
    }

    // Kiracının adını döndüren metod
    public String getKiraciAd() {
        return kiraciAd;
    }

    // Kiracının adını ayarlayan metod
    public void setKiraciAd(String ad) {
        this.kiraciAd = ad;
    }

    // Kiracının soyadını döndüren metod
    public String getKiraciSoyad() {
        return kiraciSoyad;
    }

    // Kiracının soyadını ayarlayan metod
    public void setKiraciSoyad(String soyad) {
        this.kiraciSoyad = soyad;
    }

    // Kiracının ev sahibini döndüren metod
    public evSahibi getKiraciEvSahibi() {
        return kiraciEvSahibi;
    }

    // Kiracının ev sahibini ayarlayan metod
    public void setKiraciEvSahibi(evSahibi evsahibi) {
        this.kiraciEvSahibi = evsahibi;
    }

    // Kiracının daire bilgisini döndüren metod
    public Daire getKiraciDaire() {
        return kiraciDaire;
    }

    // Kiracının daire bilgisini ayarlayan metod
    public void setKiraciDaire(Daire daire) {
        if (this.kiraciDaire != null) {
            throw new RuntimeException("Kiracının birden çok daire olamaz");
        }
        this.kiraciDaire = daire;
    }

    // Bilgileri ekrana yazdıran metod
    public void displayInfo() {
        System.out.println("Kiracının adı: " + kiraciAd + " " + kiraciSoyad);
        System.out.println("Kiracının ev sahibi: " + kiraciEvSahibi.getEvSahibAd());
        if (kiraciDaire != null) {
            System.out.println("Kiracının daire bilgisi:");
            kiraciDaire.displayInfo();
        } else {
            System.out.println("Kiracının henüz bir daire bilgisi yok.");
        }
        System.out.println();
    }
}
