// evSahibi sınıfı
public class evSahibi {

    // evSahibi sınıfına ait değişkenler
    private String evSahibAd; // Ev sahibinin adı
    private String evSahibSoyad; // Ev sahibinin soyadı
    private Bina bina; // Ev sahibine ait bina

    // evSahibi sınıfının kurucu metodudur
    public evSahibi(String ad, String soyad, Bina bina) {
        this.evSahibAd = ad;
        this.evSahibSoyad = soyad;
        this.bina = bina;
    }

    // Ev sahibinin adını döndüren metod
    public String getEvSahibAd() {
        return evSahibAd;
    }

    // Ev sahibinin adını ayarlayan metod
    public void setEvSahibAd(String ad) {
        this.evSahibAd = ad;
    }

    // Ev sahibinin soyadını döndüren metod
    public String getEvSahibSoyad() {
        return evSahibSoyad;
    }

    // Ev sahibinin soyadını ayarlayan metod
    public void setEvSahibSoyad(String soyad) {
        this.evSahibSoyad = soyad;
    }

    // Ev sahibine ait binayı döndüren metod
    public Bina getBina() {
        return bina;
    }

    // Ev sahibine ait binayı ayarlayan metod
    public void setBina(Bina bina) {
        if (this.bina != null) {
            throw new RuntimeException("Ev sahibi zaten bir evin sahibi, başka bir ev eklenemez.");
        }
        this.bina = bina;
    }

    // Bilgileri ekrana yazdıran metod
    public void displayInfo() {
        System.out.println("Ev sahibinin adı: " + evSahibAd);
        System.out.println("Ev sahibinin soyadı: " + evSahibSoyad);
        if (bina != null) {
            System.out.println("Ev sahibine ait bina bilgileri:");
            bina.displayInfo();
        } else {
            System.out.println("Ev sahibinin henüz bir binası yok.");
        }
        System.out.println();
    }
}
