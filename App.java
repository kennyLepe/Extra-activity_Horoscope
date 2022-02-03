package com.company;
import java.util.Calendar;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa tu més de nacimiento (0-12)");
        int mes = s.nextInt();

        System.out.println("Ingresa tu día de nacimiento");
   3     int dia = s.nextInt();

        String userSign = signo(dia, mes);

        System.out.println("Tu signo es " + userSign );

        System.out.println("Tu horóscopo es: " + mensaje(userSign));



    }


    public static String mensaje(String signo){
        String mensaje = "";
        if(signo.equals("ACUARIO")){
            mensaje = "Se te quitará lo menso y te depositarán mil pesos ";
        }else if(signo.equals("CAPRICORNIO")){
            mensaje = "";
        }else if(signo.equals("PISCIS")){
            mensaje = "";
        }else if(signo.equals("ARIES")){
            mensaje = "Te crecerán las nalgas. Dejaras de enojarte por todo y no te pondrás de mal humor cuando tengas hambre";
        }
        else if(signo.equals("TAURO")){
            mensaje = " Ya no te estresarás por todo, estarás de buen humor y te dejarán de poner los cuernos";
        }
        else if(signo.equals("GEMINIS")){
            mensaje = "Ya no serás indecisa tendrás mucho dinero sin trabajar y se te quitará lo wilo/a";
        }
        else if(signo.equals("CANCER")){
            mensaje = " Ya no te preocuparás por todo y todos, te saldrán chichis y serás feliz.";
        }
        else if(signo.equals("LEO")){
            mensaje = "Ya no seras un egoista, todo saldra bien y le caeras mejor a las personas";
        }
        else if(signo.equals("VIRGO")){
            mensaje = "Se te quitara lo perfeccionista y te podras relajar, dejaras de criticar a los demas y te hara caso tu crush";
        }
        else if(signo.equals("ESCORPION")){
            mensaje = "Ya no pensarás solo en relaciones, dejarás de ser impulsiva, no tendrás problemas con nadie y recuperarás tu dignidad";
        }
        else if(signo.equals("SAGITARIO")){
            mensaje = " Aprenderás a convivir con la gente sin desesperarte, serás mas empática y te pondrás más mamey";
        }

        return mensaje;
    }


    public static String signo(int dia, int mes) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia > 21) {
                    signo = "ACUARIO";
                } else {
                    signo = "CAPRICORNIO";
                }
                break;
            case 2:
                if (dia > 19) {
                    signo = "PISCIS";
                } else {
                    signo = "ACUARIO";
                }
                break;
            case 3:
                if (dia > 20) {
                    signo = "ARIES";
                } else {
                    signo = "PISCIS";
                }
                break;
            case 4:
                if (dia > 20) {
                    signo = "TAURO";
                } else {
                    signo = "ARIES";
                }
                break;
            case 5:
                if (dia > 21) {
                    signo = "GEMINIS";
                } else {
                    signo = "TAURO";
                }
                break;
            case 6:
                if (dia > 20) {
                    signo = "CANCER";
                } else {
                    signo = "GEMINIS";
                }
                break;
            case 7:
                if (dia > 22) {
                    signo = "LEO";
                } else {
                    signo = "CANCER";
                }
                break;
            case 8:
                if (dia > 21) {
                    signo = "VIRGO";
                } else {
                    signo = "LEO";
                }
                break;
            case 9:
                if (dia > 22) {
                    signo = "LIBRA";
                } else {
                    signo = "VIRGO";
                }
                break;
            case 10:
                if (dia > 22) {
                    signo = "ESCORPION";
                } else {
                    signo = "LIBRA";
                }
                break;
            case 11:
                if (dia > 21) {
                    signo = "SAGITARIO";
                } else {
                    signo = "ESCORPION";
                }
                break;
            case 12:
                if (dia > 21) {
                    signo = "CAPRICORNIO";
                } else {
                    signo = "SAGITARIO";
                }
                break;
        }
        return signo;
    }
}



