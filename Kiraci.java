public class Kiraci {

    private String kiraciAd;
    private String kiraciSoyad;
    public evSahibi kiraciEvSahibi;
    private Daire kiraciDaire;
    public Kiraci(String ad, String soyad, evSahibi evsahibi) {
        this.kiraciAd = ad;
        this.kiraciSoyad = soyad;
        this.kiraciEvSahibi=evsahibi;

    }

    public String getKiraciAd() {
        return kiraciAd;
    }

    public void setKiraciAd(String ad) {
        this.kiraciAd = ad;
    }

    public String getKiraciSoyad() {
        return kiraciSoyad;
    }

    public void setKiraciSoyad(String soyad) {
        this.kiraciSoyad = soyad;
    }
    public evSahibi getKiraciEvSahibi() {
        return kiraciEvSahibi;
    }

    public void setKiraciEvSahibi(evSahibi evsahibi) {
        this.kiraciEvSahibi = evsahibi;
    }
    public Daire getKiraciDaire() {
        return kiraciDaire;
    }
    public void setKiraciDaire(Daire daire) {
        if (this.kiraciDaire != null) {
            throw new RuntimeException("Kiracının birden çok daire olamaz");
        }
        this.kiraciDaire = daire;
    }

    public void displayInfo() {
        System.out.println("Kiracinin adi: " + kiraciAd + " " + kiraciSoyad);
        System.out.println("Kiracinin evsahibi: " + kiraciEvSahibi.getEvSahibAd());
    }
}