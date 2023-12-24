
class EvSahibi {
    private String evSahibiAdi;
    private String evSahibiSoyadi;
    private Bina bina; // Bina sınıfından bir örnek

    // Constructor
    public EvSahibi(String evSahibiAdi, String evSahibiSoyadi, int katSayisi, Bina bina) {
        this.evSahibiAdi = evSahibiAdi;
        this.evSahibiSoyadi = evSahibiSoyadi;
        this.bina=bina;
    }

    // DisplayInfo metodu
    public void displayInfo() {
        System.out.println("Ev Sahibi Adı: " + evSahibiAdi + ", Soyadı: " + evSahibiSoyadi);
        bina.displayInfo(); // Bina bilgilerini ekrana yazdırma
    }

    // Getter ve Setter metotları
    public String getEvSahibiAdi() {
        return evSahibiAdi;
    }

    public void setEvSahibiAdi(String evSahibiAdi) {
        this.evSahibiAdi = evSahibiAdi;
    }

    public String getEvSahibiSoyadi() {
        return evSahibiSoyadi;
    }

    public void setEvSahibiSoyadi(String evSahibiSoyadi) {
        this.evSahibiSoyadi = evSahibiSoyadi;
    }
}
