/**
 * Representasi item makanan yang merupakan turunan dari MenuItem.
 */
public class FoodItem extends MenuItem {

    /**
     * Konstruktor untuk membuat item makanan baru.
     * 
     * @param name  nama makanan
     * @param price harga makanan
     */
    public FoodItem(String name, double price) {
        super(name, price);
    }

    /**
     * Menampilkan persiapan makanan.
     */
    @Override
    public void prepare() {
        System.out.println("Menyiapkan makanan: " + getName());
    }
}
