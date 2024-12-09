package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.*;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qtyInStore;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD added to the store."+dvd.getTitle());
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(dvd)) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("DVD removed from the store." +dvd.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in the store.");
    }
}
