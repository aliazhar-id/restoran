import java.util.List;
import java.util.ArrayList;

/**
 * Singleton Pattern untuk mengelola pesanan. Kelas ini menyediakan fungsionalitas
 * untuk menambah dan menampilkan semua pesanan.
 */
public class OrderManager {
    private static OrderManager instance;
    private List<Order> orders;

    /**
     * Konstruktor privat untuk mencegah instansiasi langsung. Hanya diinisialisasi
     * sekali melalui metode getInstance().
     */
    private OrderManager() {
        orders = new ArrayList<>();
    }

    /**
     * Mendapatkan satu-satunya instance dari OrderManager.
     * 
     * @return instance tunggal dari OrderManager
     */
    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    /**
     * Menambahkan pesanan baru ke daftar pesanan.
     * 
     * @param order objek Order yang akan ditambahkan
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Menampilkan semua pesanan dalam daftar.
     */
    public void showAllOrders() {
        System.out.println("Daftar Semua Pesanan:");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println("------------");
        }
    }
}
