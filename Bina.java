// Konut sınıfından türetilmiş Bina sınıfı
public class Bina extends Konut {

    // Bina sınıfına ait değişkenler
    private String binaAd; // Bina adı
    private int binaKatSayisi; // Bina kat sayısı

    // Bina sınıfının kurucu metodudur
    public Bina(String ad, int katsayisi) {
        super("Doğu Sokak/Orta Mahalle/Söğüt/Bilecik"); // Üst sınıfın kurucu metodunu çağırır
        this.binaAd = ad;
        this.binaKatSayisi = katsayisi;
    }

    // Bina adını döndüren metod
    public String getBinaAd() {
        return binaAd;
    }

    // Bina adını ayarlayan metod
    public void setBinaAd(String ad) {
        this.binaAd = ad;
    }

    // Bina kat sayısını döndüren metod
    public int getBinaKatSayisi() {
        return binaKatSayisi;
    }

    // Bina kat sayısını ayarlayan metod
    public void setBinaKatSayisi(int katsayisi) {
        this.binaKatSayisi = katsayisi;
    }

    // Bilgileri ekrana yazdıran metod
    public void displayInfo() {
        System.out.println("Binanın adı: " + binaAd);
        System.out.println("Binanın Kat Sayısı: " + binaKatSayisi);
        super.displayInfo(); // Üst sınıfın displayInfo metodunu çağırır
        System.out.println("");
    }
}
