public class evSahibi {


        private String evSahibAd;
        private String evSahibSoyad;
        private Bina bina;

        public evSahibi(String ad, String soyad,Bina bina) {
            this.evSahibAd = ad;
            this.evSahibSoyad = soyad;
            this.bina = bina;
        }

        public String getEvSahibAd() {
            return evSahibAd;
        }

        public void setEvSahibAd(String ad) {
            this.evSahibAd = ad;
        }

        public String getEvSahibSoyad() {
            return evSahibSoyad;
        }

        public void setEvSahibSoyad(String soyad) {
            this.evSahibSoyad = soyad;
        }

        public Bina getBina() {
            return bina;
        }

        public void setBina(Bina bina) {
            if (this.bina != null) {
                throw new RuntimeException("Evi yok ev sahibi değil ");
            }
            this.bina = bina;
        }

        public void displayInfo() {
            System.out.println("Ev sahibinin adi: " + evSahibAd);
            System.out.println("Ev Sahibinin soyadi: " + evSahibSoyad);
            System.out.println();
        }


}