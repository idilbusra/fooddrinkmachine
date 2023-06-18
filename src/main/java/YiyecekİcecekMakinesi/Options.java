package YiyecekİcecekMakinesi;

import java.util.Scanner;

public class Options {
    /*
Urun urun = new Urun();

1) Kullanıcı ürünleri göstermeliyiz. ----> Urun clasın da bir obj. toString()
2) Scanner --> Scanner clasından bir obj yazınız
3) Loop --> Do-While Loop --> kullanıcı 0-7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
1 den küçük ve ya 7 den büyük ise döngü devam etmeli ve kullanıcı 1-7 arasında bir seçim yapmaya force edilmeli.
4) 0 a basarak ta menuden cıkabilmeli. --> Yine Bekleriz... Yazısını konsola yazdıralım....
5) Kullanıcıdan urunNumarasi (1-7 arasında rakam {Kullanıcı 1 rakamı seçerse, Kraker, 2 rakamını seçerse cips .... }) --> switch-case yapısı kurmalıyım...
6) switch benden urunNumarasi ve alınan bu urunNumarasina göre ilgili ürünün fiyat ı alınmalı. urun.krakerAl(), urun.CipsAl(), urun.cayAl(), cocaColaAl() ....
(fiyat belirlemek icin ben fiyatBelirle())

Bir metodun farklı davranışlarını ayarlamak veya özelleştirmek için kullanılabilir.
Örneğin, bir metodun farklı seçeneklerle çalışmasını istiyorsanız, bu seçenekleri
"options" olarak adlandırılan bir nesne aracılığıyla iletebilirsiniz.
 Bu sayede, metodun farklı senaryolarda farklı davranışlar sergilemesini
 sağlayabilirsiniz.
 */




    public double secme(Urun urun){
        System.out.println(urun.toString());

        Scanner sc=new Scanner(System.in);



        do {
            System.out.println("lütfen 1 ile 7 arasında bir rakam girerek almak istediğiniz ürünü seciniz ");
            System.out.println("cıkıs için 0 giriniz ");
            urun.urunNumarasiAyarla(sc.nextInt());
            if (urun.urunNumarasi()<0 || urun.urunNumarasi()>=7){
                System.out.println("lütfen belirtilen aralıkta bir rakam giriniz");
            }

        }while (urun.urunNumarasi()<0 || urun.urunNumarasi()>7);



        switch (urun.urunNumarasi()){
            case 0:
                System.out.println("yine bekleriz");
                System.exit(0);

                break;

            case 1:
                urun.fiyatBelirle(urun.krakerAl());
                break;
            case 2:
                urun.fiyatBelirle(urun.cipsAl());
                break;
            case 3:
                urun.fiyatBelirle(urun.cocaColaAl());
                break;
            case 4:
                urun.fiyatBelirle(urun.fantaAl());
                break;
            case 5:
                urun.fiyatBelirle(urun.suAl());
                break;
            case 6:
                urun.fiyatBelirle(urun.cayAl());
                break;
            case 7:
                urun.fiyatBelirle(urun.filtreKahveAl());
                break;
        }



        return urun.fiyatAl();
    }
    public double balance(double fiyat, double hesapBakiyesi, Urun urun){
        double fonlama;

        while (hesapBakiyesi<fiyat){
            Scanner sc=new Scanner(System.in);
            System.out.println("bakiyeniz yetersiz.. Ekleme yapmak istiyor musunuz (Y/N)");
            char onay=sc.next().toLowerCase().charAt(0);

            if (onay=='n'){
                System.out.println("mevcut bakiyeniz : " + hesapBakiyesi);
                System.out.println("yine beekleriz");
                break;
            }else {
                System.out.println("ne kadar ekleme yapmak istiyorsunuz ...");
                fonlama=sc.nextDouble();
                hesapBakiyesi=hesapBakiyesi+fonlama;
                System.out.println("yeni bakiyeniz : " + hesapBakiyesi);
                fiyat = secme(urun);
            }

        }

        return hesapBakiyesi;
    }

    public  void satinAlma(double fiyat, double hesapBakiyesi, Urun urun) {

        while (hesapBakiyesi>=fiyat){
            hesapBakiyesi=hesapBakiyesi-fiyat;
            System.out.println("kalan bakiye : " + hesapBakiyesi);
            Scanner sc=new Scanner(System.in);
            System.out.println("baska bir ürün almak istiyor musunuz? (Y/N)");
            char onay = sc.next().toLowerCase().charAt(0);

            if (onay=='n'){
                System.out.println("yine bekleriz");
                break;
            }else {
                urun.fiyatBelirle(secme(urun));
                hesapBakiyesi = balance(urun.fiyatAl(), hesapBakiyesi,urun);
            }

        }
    }}

