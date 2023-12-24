class Daire extends Konut implements Comparable<Daire> {

    //değişkenleri tanımladım
    private int daireNumarasi;
    private String daireAdi;
    private int odaSayisi;

    //kurucu metod
    public Daire(String adres,int daireNumarasi, String daireAdi, int odaSayisi) {
        super(adres);
        this.daireNumarasi = daireNumarasi;
        this.daireAdi = daireAdi;
        this.odaSayisi = odaSayisi;
    }

    // DisplayInfo metodu
    @Override
    public void displayInfo() {
        System.out.println("Daire Numarası: " + daireNumarasi + ", Daire Adı: " + daireAdi + ", Oda Sayısı: " + odaSayisi);
    }

    // compareTo metodu karşılaştırma yapmak için
    @Override
    public int compareTo(Daire digerDaire) {
        return Integer.compare(this.daireNumarasi, digerDaire.daireNumarasi);
    }

   //kapsülleme metodları
    public int getDaireNumarasi() {
        return daireNumarasi;
    }

    public void setDaireNumarasi(int daireNumarasi) {
        this.daireNumarasi = daireNumarasi;
    }

    public String getDaireAdi() {
        return daireAdi;
    }

    public void setDaireAdi(String daireAdi) {
        this.daireAdi = daireAdi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
}

