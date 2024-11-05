import java.util.ArrayList;
import java.util.List;

/**
 * Representasi dari sebuah pesanan yang terdiri dari beberapa item menu.
 */
public class Order {
    private List<MenuItem> items;

    /**
     * Konstruktor untuk membuat pesanan baru.
     */
    public Order() {
        items = new ArrayList<>();
    }

    /**
     * Menambahkan item ke dalam pesanan.
     * 
     * @param item item yang akan ditambahkan
     */
    public void addItem(MenuItem item) {
        items.add(item);
    }

    /**
     * Menampilkan detail pesanan, termasuk setiap item dan total harga.
     */
    public void showOrderDetails() {
        System.out.println("Detail Pesanan:");
        double total = 0;
        for (MenuItem item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total Harga: $" + total);
    }
}
