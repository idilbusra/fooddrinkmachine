package YiyecekİcecekMakinesi;

public class Urun {

     /*
kraker=3.5;
cips=12.0;
cocaCola=8.5;
fanta=7.0;
su=3.0;
cay=3.5;
filtreKahve=10.99;
productNum;
price;
 */

    private double kraker = 3.5;
    private double cips = 12.0;
    private double cocaCola = 8.5;
    private double fanta = 7.0;
    private double su = 3.0;
    private double cay = 3.5;
    private double filtreKahve = 10.99;
    private int urunNumarasi;
    private double fiyat;


    public double krakerAl() {

        return kraker;
    }

    public void krakerFiyatiAyarla(double kraker) {

        this.kraker = kraker;
    }

    public double cipsAl() {

        return cips;
    }

    public void cipsFiyatiAyarla(double cips) {

        this.cips = cips;
    }

    public double cocaColaAl() {

        return cocaCola;
    }

    public void cocaColaFiyatiAyarla(double cocaCola) {

        this.cocaCola = cocaCola;
    }

    public double fantaAl() {
        return fanta;
    }

    public void fantaFiyatiAyarla(double fanta) {

        this.fanta = fanta;
    }

    public double suAl() {

        return su;
    }

    public void suFiyatiAyarla(double su) {

        this.su = su;
    }

    public double cayAl() {
        return cay;
    }

    public void cayFiyatiAyarla(double cay) {

        this.cay = cay;
    }

    public double filtreKahveAl() {
        return filtreKahve;
    }

    public void filtreKahveFiyatiAyarla(double filtreKahve) {

        this.filtreKahve = filtreKahve;
    }

    public int urunNumarasi() {

        return urunNumarasi;
    }

    public void urunNumarasiAyarla(int urunNumarasi) {

        this.urunNumarasi = urunNumarasi;
    }

    public double fiyatAl() {

        return fiyat;
    }

    public void fiyatBelirle(double fiyat) {

        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urun: " +
                "\nKraker=₺" + kraker +
                ",\ncips=₺" + cips +
                ",\ncocaCola=₺" + cocaCola +
                ",\nfanta=₺" + fanta +
                ",\nsu=₺" + su +
                ",\ncay=₺" + cay +
                ",\nfiltreKahve=₺" + filtreKahve
                ;
    }


}
