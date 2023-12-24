// Bina sınıfı
class Bina extends Konut {
    //değişken tanımladım
    private int katSayisi;
    private String binaAdi;

    // Constructor
    public Bina(String adres, int katSayisi, String binaAdi) {
        super(adres); // üst sınıftan yapıcı metodunu çektik
        this.katSayisi = katSayisi;
        this.binaAdi = binaAdi;
    }

    // DisplayInfo metodu
    @Override
    public void displayInfo() {
        System.out.println("Bina Adı: " + binaAdi + ", Kat Sayısı: " + katSayisi);
    }

    //kapsülleme metodu
    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    public String getBinaAdi() {
        return binaAdi;
    }

    public void setBinaAdi(String binaAdi) {
        this.binaAdi = binaAdi;
    }
}


