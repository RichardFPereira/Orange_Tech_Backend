package src.sistemasmarttv;

import java.util.Scanner;

public class SmarTv {
    // Criar uma classe para representar uma SmartTV onde:
    // 1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
    // 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    // 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    // 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    Scanner entrada = new Scanner(System.in);

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void mudarCanal() {
        System.out.println("\nDigite o canal desejado: ");
        int canal = entrada.nextInt();
        this.canal = canal;
    }
}
