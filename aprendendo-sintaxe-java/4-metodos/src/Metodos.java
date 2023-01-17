package src;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(10-i);
        }
        imprimirLista(list);
        float media = calcularMedia(list);
        System.out.println("A média é: " + media);
    }

    public static void imprimirLista(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("List index %d: %d.\n", i, list.get(i));
        }
    }

    public static float calcularMedia(List<Integer> list) {
        float media = 0;
        for (int i = 0; i < list.size(); i++) {
            media = media + list.get(i);
        }
        return media / list.size();
    }
}
