// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Daire nesnelerini oluşturdum
        Daire daire1 = new Daire("yükseltepe", 101,"demirbaş Daire", 4);
        Daire daire2 = new Daire("yıldız",102, "demir Daire", 2);


        // Daire bilgilerini gösteriyor
        daire1.displayInfo();
        daire2.displayInfo();

        Bina bina = new Bina("etlik ",5, "yılmaz Bina");

        // Bina bilgilerini gösteriyor
        bina.displayInfo();

        // EvSahibi nesnesini oluşturdum
        EvSahibi evSahibi = new EvSahibi("cemile", "erden", 5, bina);
        //kiracı nesenesini oluşturdum
        Kiraci kiraci= new Kiraci("cansu","erdem", evSahibi);
        kiraci.displayInfo();
        // EvSahibi ve bina bilgilerini gösterme

      //ev sahibi bilgikeini cağırıyor
        evSahibi.displayInfo();

    }
}