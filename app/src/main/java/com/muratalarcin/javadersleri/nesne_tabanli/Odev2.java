package com.muratalarcin.javadersleri.nesne_tabanli;

public class Odev2 {
    /*--------------------S1-Soru1--------------------*/
    public Double soru1(double km) {
        double mil = km * 0.621;
        return mil;
    }

    /*--------------------S1-Soru2--------------------*/
    public void soru2(double kenar1, double kenar2) {
        double alan = kenar1 * kenar2;
        System.out.println("Dörtgenin Alanı : " + alan);
    }

    /*--------------------S1-Soru3--------------------*/
    public int soru3(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    /*--------------------S1-Soru4--------------------*/
    public void soru4(String kelime) {
        int eSayisi = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E') {
                eSayisi++;
            }
        }
        System.out.println(kelime + " Cümlesinde " + eSayisi + "Tane 'E' Harfi Vardır.");
    }

    /*--------------------S2-Soru1--------------------*/
    public int s2_soru1(int kenarSayisi) {
        int aciToplami = ((kenarSayisi - 2) * 180);
        return aciToplami;
    }

    /*--------------------S2-Soru2--------------------*/
    public int s2_soru2(int gun) {
        int ucret = 0;
        if (gun < 19) {
            ucret = gun * 8 * 40;
        } else {
            ucret = (19 * 8 * 40) + (gun * 8 * 80);
        }
        return ucret;
    }

    /*--------------------S2-Soru3--------------------*/
    public int s2_soru3(int sure) {
        int ucret = 0;
        if (sure <= 1) {
            ucret = 50;
        } else {
            ucret = (sure-1) * 10 + 50;
        }
        return ucret;
    }
}
