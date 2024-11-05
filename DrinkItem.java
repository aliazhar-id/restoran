/**
 * Representasi item minuman yang merupakan turunan dari MenuItem.
 */
public class DrinkItem extends MenuItem {

    /**
     * Konstruktor untuk membuat item minuman baru.
     * 
     * @param name  nama minuman
     * @param price harga minuman
     */
    public DrinkItem(String name, double price) {
        super(name, price);
    }

    /**
     * Menampilkan persiapan minuman.
     */
    @Override
    public void prepare() {
        System.out.println("Menyiapkan minuman: " + getName());
    }
}
