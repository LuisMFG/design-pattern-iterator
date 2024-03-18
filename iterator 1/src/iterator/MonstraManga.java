package iterator;

import iterator2.Iterator;

public class MonstraManga {
    public static void main(String[] args) {
        MangaItem[] mangaItens = new MangaItem[5];

        mangaItens[0] = new MangaItem("Jujutsu Kaisen", 66.75);
        mangaItens[1] = new MangaItem("Berserk", 34.90);
        mangaItens[2] = new MangaItem("Vagabond", 46.90);
        mangaItens[3] = new MangaItem("Cowboy Bebop", 4.90);
        mangaItens[4] = new MangaItem("Hellsing", 16.50);

        Iterator mangaIterator = new MangaIterator(mangaItens);

        while (mangaIterator.hasMore()) {
            MangaItem mangaItem = (MangaItem) mangaIterator.getNext();
            System.out.println(mangaItem.nomeManga + " = R$ " + mangaItem.preco);
        }
    }
}
