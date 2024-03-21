package iterator;

public class MangaIterator implements Iterator {
    MangaItem[] itens;
    int i = 0;

    MangaIterator(MangaItem[] itens) {
        this.itens = itens;
    }

    @Override
    public Object getNext() {
        MangaItem mangaItem = itens[i];
        i++;
        return mangaItem;
    }

    @Override
    public boolean hasMore() {
        if (i >= itens.length || itens[i] == null) {
            return false;
        } else {
            return true;
        }
    }
}
