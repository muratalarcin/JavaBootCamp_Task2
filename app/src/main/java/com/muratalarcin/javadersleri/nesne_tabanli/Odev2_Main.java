package com.muratalarcin.javadersleri.nesne_tabanli;

public class Odev2_Main {
    public static void main(String[] args) {
        Odev2 o2 = new Odev2();
        /*--------------------S1-Soru1--------------------*/
        double km = 5;
        double x = o2.soru1(km);
        System.out.println(km + " Kilometre " + x + " Mil' e Eşittir.");

        /*--------------------S1-Soru2--------------------*/
        o2.soru2(5, 20);

        /*--------------------S1-Soru3--------------------*/
        int faktoriyel = 11;
        int y = o2.soru3(faktoriyel);
        System.out.println(faktoriyel + " Sayısının Faktoriyeli : " + y);

        /*--------------------S1-Soru4--------------------*/
        o2.soru4("Elektron Alan İndirgenir");

        /*--------------------S2-Soru1--------------------*/
        int kenar = 4;
        int z = o2.s2_soru1(kenar);
        System.out.println(kenar + " Kenarlı Şeklin İç Açıları Toplamı : " + z);

        /*--------------------S2-Soru2--------------------*/
        int gunler = 21;
        int c = o2.s2_soru2(gunler);
        System.out.println(gunler + " Gün Çalışan Bir Vatandaşın Maaşı : " + c);

        /*--------------------S2-Soru3--------------------*/
        int saat = 3;
        int v = o2.s2_soru3(saat);
        System.out.println("Otoparkta geçirdiğiniz " + saat + " Saatin ücreti : " + v);
    }
}
