public class Konut {
    private String konutAdres;

    public Konut(String adres) {
        this.konutAdres = adres;
    }

    public void displayInfo() {
        System.out.println("Adres : " + konutAdres);
    }

}