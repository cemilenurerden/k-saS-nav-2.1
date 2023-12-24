public abstract class Konut {

    //değişken tanımladım
        private String konutAdi;

        //yapıcı metod
        public Konut(String konutAdi) {
            this.konutAdi = konutAdi;
        }

        // DisplayInfo metodu
        public abstract void displayInfo();

        //kapsülleme metodu
        public String getKonutAdi() {
            return konutAdi;
        }

        public void setKonutAdi(String konutAdi) {
            this.konutAdi = konutAdi;
        }
    }




