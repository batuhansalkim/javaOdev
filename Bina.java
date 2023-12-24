public class Bina extends Konut{

    private String binaAd;
    private int binaKatSayisi;


    public Bina(String ad, int katsayisi) {
        super("Doğu Sokak/Orta Mahalle/Söğüt/Bilecik");
        this.binaAd = ad;
        this.binaKatSayisi = katsayisi;

    }

    public String getBinaAd() {
        return binaAd;
    }

        public void setBinaAd(String ad) {
            this.binaAd = ad;
        }

        public int getBinaKatSayisi() {
            return binaKatSayisi;
        }

        public void setBinaKatSayisi(int katsayisi) {
            this.binaKatSayisi = katsayisi;
        }



        public void displayInfo() {
            System.out.println("Binanın adı :" + binaAd) ;
            System.out.println("Binanın Katsayısı :"+binaKatSayisi);
            super.displayInfo();
            System.out.println("");
            }
        }