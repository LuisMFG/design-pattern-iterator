package iterator3;

import java.util.ArrayList;

public class MostraLista {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        Iterator iterator = new IteratorLista(lista);

        while (iterator.hasMore()) {
            Object elementoLista = iterator.getNext();

            System.out.println("Numero atual: " + elementoLista);

        }

    }

}
