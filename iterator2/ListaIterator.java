package iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaIterator {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            Object listaIterator = iterator.next();

            System.out.println("numero atual: " + listaIterator);

        }

    }

}
