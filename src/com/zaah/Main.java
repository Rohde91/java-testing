package com.zaah;

public class Main {

    public static void main(String[] args) {

    }

    public int f(int tal){
        if (tal < 7 ) {
            return 1;
        }
        else if (tal < 9) {
            return 2;
        }
        else if(tal < 13) {
            return 3;
        }
        else {
            return 4;
        }
    }

    public String udskriv(int nr, String besked) {
        if (nr < 100) {
            if (besked == "ja")
                return "Godkend 1";
        }
        if (nr > 100) {
            if (besked == "ja")
                return "Godkend 2";
        }
        if (nr < 100) {
            if (besked == "nej")
                return "Ikke Godkend 4";
        }
        if (nr > 100) {
            if (besked == "nej")
                return "Ikke Godkend 5";
        }
        if (nr == 100) {
            return "Godkend";
        }
        return besked;
    }


}
