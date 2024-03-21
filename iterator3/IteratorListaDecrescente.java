package iterator3;

import java.util.ArrayList;

public class IteratorListaDecrescente implements Iterator {
    ArrayList<Integer> lista;
    int i;

    IteratorListaDecrescente(ArrayList<Integer> lista) {
        this.lista = lista;
        this.i = lista.size() - 1;

    }

    @Override
    public boolean hasMore() {
        return i >= 0;

    }

    @Override
    public Object getNext() {
        return lista.get(i--);

    }

}
