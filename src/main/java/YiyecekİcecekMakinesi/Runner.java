package YiyecekİcecekMakinesi;

public class Runner {

    public static void main(String[] args) {

        double hesapBakiyesi=10;
        Urun urun=new Urun();

        Options opt=new Options();

        urun.urunNumarasiAyarla((int) opt.secme(urun));

        hesapBakiyesi=opt.balance(urun.fiyatAl(),hesapBakiyesi,urun);

        System.out.println("hesapBakiyesi = " + hesapBakiyesi);

        opt.satinAlma(urun.fiyatAl(),hesapBakiyesi,urun);

    }

}

