package src;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart cart = new Cart();

        // Tạo các DVD và thêm vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // In giỏ hàng
        cart.print();

        // Tìm kiếm DVD theo ID
        cart.searchById(1); // Thử với ID 2

        // Tìm kiếm DVD theo title
        cart.searchByTitle("Aladin"); // Thử với title "Aladin"
        cart.searchByTitle("Frozen"); // Thử với title không có trong giỏ hàng
    }
}
