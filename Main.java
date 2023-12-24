// Main sınıfı
public class Main {

    public static void main(String[] args) {

        // Daire nesnelerini oluştur
        Daire daire11 = new Daire("11", 500, 3);
        Daire daire22 = new Daire("11", 400, 2);
        Daire daire33 = new Daire("11", 300, 3);
        Daire daire44 = new Daire("11", 200, 2);
        Daire daire55 = new Daire("11", 100, 3);
        Daire daire66 = new Daire("11", 600, 2);
        // Bina nesnelerini oluştur
        Bina bina11 = new Bina("Salkim", 6);
        Bina bina22 = new Bina("Salkim", 6);
        Bina bina33 = new Bina("Salkim", 6);
        Bina bina44 = new Bina("Salkim", 6);
        Bina bina55 = new Bina("Salkim", 6);
        Bina bina66 = new Bina("Salkim", 6);
        // EvSahibi nesnelerini oluştur
        evSahibi evsahibi11 = new evSahibi("Fahrettin", "Koca", bina11);
        evSahibi evSahibi22 = new evSahibi("Hakan", "Fidan", bina22);
        evSahibi evSahibi33 = new evSahibi("Ali", "Yerlikaya", bina33);
        evSahibi evSahibi44 = new evSahibi("Yaşar", "Güler", bina44);
        evSahibi evSahibi55 = new evSahibi("Aboubakar", "Türk", bina55);
        evSahibi evSahibi66 = new evSahibi("Hadise", "Açıkgöz", bina66);
        // Kiracı nesnelerini oluştur
        Kiraci kiraci11 = new Kiraci("Necla", "Salkım", evsahibi11);
        Kiraci kiraci22 = new Kiraci("Mustafa", "Salkım", evSahibi22);
        Kiraci kiraci33 = new Kiraci("Tunahan", "Güneş", evSahibi33);
        Kiraci kiraci44 = new Kiraci("Necati", "Fırat", evSahibi44);
        Kiraci kiraci55 = new Kiraci("Hasan", "Açık", evSahibi66);
        Kiraci kiraci66 = new Kiraci("Fatih", "Cörüt", evSahibi55);
        // Kiracılara daireler atanır
        kiraci11.setKiraciDaire(daire11);
        kiraci22.setKiraciDaire(daire22);
        kiraci33.setKiraciDaire(daire33);
        kiraci44.setKiraciDaire(daire44);
        kiraci55.setKiraciDaire(daire55);
        kiraci66.setKiraciDaire(daire66);
        // Kiracıların bilgileri gösterilir
        System.out.println("Kiracılar Listesi:");
        kiraci11.displayInfo();
        kiraci22.displayInfo();
        kiraci33.displayInfo();
        kiraci44.displayInfo();
        kiraci55.displayInfo();
        kiraci66.displayInfo();
        // Dairelerin bilgileri gösterilir
        System.out.println("\nDaireler Listesi:");
        daire11.displayInfo();
        daire22.displayInfo();
        daire33.displayInfo();
        daire44.displayInfo();
        daire55.displayInfo();
        daire66.displayInfo();
        // Binaların bilgileri gösterilir
        System.out.println("\nBinalar Listesi:");
        bina11.displayInfo();
        bina22.displayInfo();
        bina33.displayInfo();
        bina44.displayInfo();
        bina55.displayInfo();
        bina66.displayInfo();
    }
}
