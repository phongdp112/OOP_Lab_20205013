package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore;  // Thay mảng thành ArrayList
    private int qtyInStore;

    // Constructor khởi tạo với kích thước tối đa của cửa hàng
    public Store(int maxSize) {
        itemsInStore = new ArrayList<>(maxSize);
        qtyInStore = 0;
    }

    // Phương thức thêm Media vào cửa hàng
    public void addMedia(Media media) {
        if (qtyInStore < itemsInStore.size()) {
            itemsInStore.add(media);  // Thêm media vào cửa hàng
            qtyInStore++;
            System.out.println(media.getTitle() + " added to the store.");
        } else {
            System.out.println("The store is full.");
        }
    }

    // Phương thức xóa Media khỏi cửa hàng
    public void removeMedia(Media media) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore.get(i).equals(media)) {  // Tìm media trong cửa hàng
                itemsInStore.remove(i);  // Xóa media khỏi cửa hàng
                qtyInStore--;
                System.out.println(media.getTitle() + " removed from the store.");
                return;
            }
        }
        System.out.println("Media not found in the store.");
    }
}
