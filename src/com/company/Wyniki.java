package com.company;

public class Wyniki {

    static void podajWynik(){
        System.out.println("Twoje wewnętrzne zwierzę to:");

        if (Pytania.punkty<17){
            System.out.println("PIES" +
                    "\nDobrze się czujesz wśród ludzi, jesteś przez nich postrzegany" +
                    "\njako osoba przyjacielska i pełna optymizmu. Jesteś godny zaufania i szczery.");
        }
        else if (Pytania.punkty<24) {
            System.out.println("KOT" +
                    "\nNajważniejsza jest dla Ciebie niezależność. Ciężko Ci się porozumieć z innymi," +
                    "\nale gdy komuś uda się do Ciebie zbliżyć, stajesz się wspaniałym przyjacielem.");
        }
        else if (Pytania.punkty<33) {
            System.out.println("MYSZ" +
                    "\nCechuje Cię spokój i duchowa równowaga. Czasem bywasz zbyt nieśmiały." +
                    "\nBardzo ważna jest dla Ciebie rodzina, którą obdarzasz dużą troską.");
        }
        else {
            System.out.println("WILK" +
                    "\nJesteś prawdziwym liderem, stanowisz wsparcie zarówno dla rodziny" +
                    "\njak i dla współpracowników. Ludzie podziwiają Twoją pewność siebie i odwagę.");
        }
    }
}
