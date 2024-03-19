package iterator3;

import java.util.ArrayList;

public class IteratorLista implements Iterator {
    ArrayList<Integer> lista;
    int i;

    IteratorLista(ArrayList<Integer> lista) {
        this.lista = lista;
        this.i = 0;

    }

    public boolean hasMore() {
        return i < lista.size();

    }

    public Object getNext() {
        return lista.get(i++);

    }

}
