// Cart.java
package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        this.itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {
        this.itemsOrdered.remove(media);
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

}
