package com.company;

public class Main {
    static void separator (){
        System.out.println("**************************************");
    }
    public static void main(String[] args) {

        System.out.println("Witaj w quizie 'Jakie jest Twoje wewnętrzne zwierzę'! \nOdpowiadz na" +
                " pytania poprzez wpisanie litery przypisanej do wybranej odpowiedzi i kliknięcie Enter.");
        separator();
        Pytania.pytanie1();
        separator();
        Pytania.pytanie2();
        separator();
        Pytania.pytanie3();
        separator();
        Pytania.pytanie4();
        separator();
        Pytania.pytanie5();
        separator();
        Pytania.pytanie6();
        separator();
        Pytania.pytanie7();
        separator();
        Pytania.pytanie8();
        separator();
        Pytania.pytanie9();
        separator();
        Pytania.pytanie10();
        separator();
        Wyniki.podajWynik();
    }

}
