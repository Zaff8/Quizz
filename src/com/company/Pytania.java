package com.company;
import java.util.Scanner;

public class Pytania {
    static int punkty = 0;
    static Scanner sc = new Scanner(System.in);
    static boolean x;

    static void pytanie1() {
        do {
       System.out.println("Pytanie 1:\nJak się czujesz wśród innych ludzi?" +
                "\nA) Bardzo dobrze. Nawet wśród obcych." +
                "\nB) Raczej słabo. Wolę samotność." +
                "\nC) Dobrze, o ile to moi znajomi." +
                "\nD) Wspaniale, o ile mogę przejąć rolę lidera.");
        String odp = sc.nextLine();

        switch (odp.toUpperCase()) {
            case "A":
                punkty += 1;
                break;
            case "B":
                punkty += 2;
                x = true;
                break;
            case "C":
                punkty += 3;
                x = true;
                break;
            case "D":
                punkty += 4;
                x = true;
                break;
            default:
                System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                x = false;
        }
    } while (x==false);
    }

    static void pytanie2(){
        do {
            System.out.println("Pytanie 2:\nWeekend najchętniej spędzasz:" +
                    "\nA) W kinie lub restauracji z partnerem/partnerką." +
                    "\nB) Czytając książki lub zgłębiając wiedzę na ciekawy temat." +
                    "\nC) Aktywnie - pójdę pobiegać lub poćwiczyć na siłowni." +
                    "\nD) Na imprezie ze znajomymi.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 2;
                    x = true;
                    break;
                case "B":
                    punkty += 3;
                    x = true;
                    break;
                case "C":
                    punkty += 4;
                    x = true;
                    break;
                case "D":
                    punkty += 1;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }

    static void pytanie3(){
        do {
            System.out.println("Pytanie 3:\nJaka cecha denerwuje Cię u innych ludzi?" +
                    "\nA) Brak szacunku do innych." +
                    "\nB) Nieśmiałość." +
                    "\nC) Zbyt duża pewność siebie." +
                    "\nD) Gadatliwość.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 4;
                    x = true;
                    break;
                case "B":
                    punkty += 1;
                    x = true;
                    break;
                case "C":
                    punkty += 3;
                    x = true;
                    break;
                case "D":
                    punkty += 2;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }

    static void pytanie4(){
        do {
            System.out.println("Pytanie 4:\nJak się czujesz podczas udzielania się w tłumie?" +
                    "\nA) Dobrze, nie mam z tym problemów." +
                    "\nB) Przeciętnie, ale jak trzeba, to sobie poradzę." +
                    "\nC) Okropnie, unikam takich sytuacji." +
                    "\nD) Bardzo dobrze, zazwyczaj inni słuchają mnie z przejęciem.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 1;
                    x = true;
                    break;
                case "B":
                    punkty += 2;
                    x = true;
                    break;
                case "C":
                    punkty += 3;
                    x = true;
                    break;
                case "D":
                    punkty += 4;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }

    static void pytanie5(){
        do {
            System.out.println("Pytanie 5:\nJak jest Twój stosunek do porządku?" +
                    "\nA) Dbam o czystość i pilnuję, by inni też to robili." +
                    "\nB) Dobrze jak jest czysto, ale nie jest to najważniejsze na świecie." +
                    "\nC) Bardzo dbam o czystość wokół siebie." +
                    "\nD) Nie przykładam do tego wagi.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 4;
                    x = true;
                    break;
                case "B":
                    punkty += 3;
                    x = true;
                    break;
                case "C":
                    punkty += 2;
                    x = true;
                    break;
                case "D":
                    punkty += 1;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }
    static void pytanie6(){
        do {
            System.out.println("Pytanie 6:\nTwój przyjaciel powinien:" +
                    "\nA) Stanąć za Tobą w razie potrzeby." +
                    "\nB) Akceptować Twoją przestrzeń osobistą." +
                    "\nC) Rozumieć Cię bez słów." +
                    "\nD) Mieć podobne zainteresowania do Twoich.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 4;
                    x = true;
                    break;
                case "B":
                    punkty += 2;
                    x = true;
                    break;
                case "C":
                    punkty += 3;
                    x = true;
                    break;
                case "D":
                    punkty += 1;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }
    static void pytanie7(){
        do {
            System.out.println("Pytanie 7:\nPrawdziwe szczęście to:" +
                    "\nA) Bycie niazależnym, realizowanie własnych pasji." +
                    "\nB) Posiadanie wielu przyjaciół, z którymi można się dobrze bawić." +
                    "\nC) Bycie ważnym dla innych i szanowanym." +
                    "\nD) Posiadanie rodziny, która Cię wesprze w każdej sytuacji.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 2;
                    x = true;
                    break;
                case "B":
                    punkty += 1;
                    x = true;
                    break;
                case "C":
                    punkty += 4;
                    x = true;
                    break;
                case "D":
                    punkty += 3;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }
    static void pytanie8(){
        do {
            System.out.println("Pytanie 8:\nJaka praca byłaby dla Ciebie najlepsza?" +
                    "\nA) Niestresująca, nie stawiająca wielu wymagań." +
                    "\nB) Kreatywna, najlepiej wykonywana w samotności." +
                    "\nC) Przyjemna i wymagająca współpracy z zespołem." +
                    "\nD) Ambitna, w której mogę kierować zespołem.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 3;
                    x = true;
                    break;
                case "B":
                    punkty += 2;
                    x = true;
                    break;
                case "C":
                    punkty += 1;
                    x = true;
                    break;
                case "D":
                    punkty += 4;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }
    static void pytanie9(){
        do {
            System.out.println("Pytanie 9:\nTwój ulubiony typ gry wideo to:" +
                    "\nA) Gra akcji z elementami strzelania i skradania." +
                    "\nB) Gra przygodowa." +
                    "\nC) MMORPG." +
                    "\nD) Kolorowa platformówka.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 2;
                    x = true;
                    break;
                case "B":
                    punkty += 3;
                    x = true;
                    break;
                case "C":
                    punkty += 4;
                    x = true;
                    break;
                case "D":
                    punkty += 1;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }
    static void pytanie10(){
        do {
            System.out.println("Pytanie 10:\nJakie jest Twój ulubiony sport?" +
                    "\nA) Bieganie." +
                    "\nB) Drużynowy, np. piłka nożna lub koszykówka." +
                    "\nC) Coś rozciągającego, np. yoga lub pilates." +
                    "\nD) Szachy.");
            String odp = sc.nextLine();

            switch (odp.toUpperCase()) {
                case "A":
                    punkty += 4;
                    x = true;
                    break;
                case "B":
                    punkty += 1;
                    x = true;
                    break;
                case "C":
                    punkty += 2;
                    x = true;
                    break;
                case "D":
                    punkty += 3;
                    x = true;
                    break;
                default:
                    System.out.println ("Wybierz odpowiedź A, B, C lub D (wpisz ją wielką lub małą literą).");
                    x = false;
            }
        } while (x==false);
    }
}