/**
 * Kelas Factory untuk membuat item menu (makanan atau minuman).
 */
public class MenuFactory {

    /**
     * Membuat item menu berdasarkan tipe yang diberikan.
     * 
     * @param type  tipe item ("food" atau "drink")
     * @param name  nama item
     * @param price harga item
     * @return objek MenuItem baru
     * @throws IllegalArgumentException jika tipe tidak valid
     */
    public static MenuItem createItem(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "food":
                return new FoodItem(name, price);
            case "drink":
                return new DrinkItem(name, price);
            default:
                throw new IllegalArgumentException("Tipe item tidak valid: " + type);
        }
    }
}
