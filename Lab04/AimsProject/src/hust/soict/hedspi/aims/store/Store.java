package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore;
    private int qtyInStore;

    public Store(int maxSize) {
        itemsInStore = new ArrayList<>(maxSize);
        qtyInStore = 0;
    }

    public void addMedia(Media media) {
        if (qtyInStore < itemsInStore.size()) {
            itemsInStore.add(media);
            qtyInStore++;
            System.out.println(media.getTitle() + " added to the store.");
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeMedia(Media media) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore.get(i).equals(media)) {
                itemsInStore.remove(i);
                qtyInStore--;
                System.out.println(media.getTitle() + " removed from the store.");
                return;
            }
        }
        System.out.println("Media not found in the store.");
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public Media getMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}
