package iterator;

import iterator2.Iterator;

public class MangaIterator implements Iterator {
    MangaItem[] itens;
    int i = 0;

    public MangaIterator(MangaItem[] itens) {
        this.itens = itens;
    }

    public Object getNext() {
        MangaItem mangaItem = itens[i];
        i++;
        return mangaItem;
    }

    public boolean hasMore() {
        if (i >= itens.length || itens[i] == null) {
            return false;
        } else {
            return true;
        }
    }
}
