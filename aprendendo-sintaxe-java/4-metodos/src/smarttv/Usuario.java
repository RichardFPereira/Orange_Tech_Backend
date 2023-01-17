package src.sistemasmarttv;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        SmarTv smarTv = new SmarTv();

        System.out.println("\nTV Ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("\nTV Ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("TV Ligada? " + smarTv.ligada);

        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        System.out.println("\nCanal atual: " + smarTv.canal);
        smarTv.diminuirCanal();
        System.out.println("Canal atual: " + smarTv.canal);

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        System.out.println("\nVolume atual: " + smarTv.volume);
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.mudarCanal();
        System.out.println("Canal atual: " + smarTv.canal);
    }
}
