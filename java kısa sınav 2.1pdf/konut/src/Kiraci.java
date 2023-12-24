class Kiraci {
    //değişken tanımladım
    private String ad;
    private String soyad;
    private EvSahibi evSahibi;


    //yapıcı metod
    public Kiraci(String ad, String soyad, EvSahibi evSahibi) {
        this.ad = ad;
        this.soyad = soyad;
        this.evSahibi=evSahibi;
    }

    // DisplayInfo metodu
    public void displayInfo() {
        System.out.println("Kiracı Adı: " + ad + ", Soyadı: " + soyad);}
}
