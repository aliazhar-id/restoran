/**
 * Kelas utama untuk menjalankan program.
 */
public class Main {

    /**
     * Metode utama yang menjadi titik masuk program.
     * 
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        MenuItem food1 = MenuFactory.createItem("food", "Nasi Goreng", 25.0);
        MenuItem drink1 = MenuFactory.createItem("drink", "Es Teh", 5.0);
        MenuItem food2 = MenuFactory.createItem("food", "Mie Goreng", 20.0);
        MenuItem drink2 = MenuFactory.createItem("drink", "Kopi", 10.0);

        Order order1 = new Order();
        order1.addItem(food1);
        order1.addItem(drink1);

        Order order2 = new Order();
        order2.addItem(food2);
        order2.addItem(drink2);

        OrderManager manager = OrderManager.getInstance();
        manager.addOrder(order1);
        manager.addOrder(order2);

        manager.showAllOrders();
    }
}
