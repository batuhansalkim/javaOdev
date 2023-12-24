// Konut sınıfı
public class Konut {

    // Konut sınıfına ait değişken
    private String konutAdres; // Konutun adres bilgisi

    // Konut sınıfının kurucu metodudur
    public Konut(String adres) {
        this.konutAdres = adres;
    }

    // Konutun adres bilgisini ekrana yazdıran metod
    public void displayInfo() {
        System.out.println("Adres: " + konutAdres);
    }
}
