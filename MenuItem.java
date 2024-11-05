/**
 * Abstraksi untuk item menu. Setiap item menu memiliki nama dan harga.
 */
public abstract class MenuItem {
    private String name;
    private double price;

    /**
     * Konstruktor untuk membuat item menu baru.
     * 
     * @param name  nama item
     * @param price harga item
     */
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Mendapatkan nama item.
     * 
     * @return nama item
     */
    public String getName() {
        return name;
    }

    /**
     * Mendapatkan harga item.
     * 
     * @return harga item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Menampilkan deskripsi item menu. Implementasi spesifik disediakan oleh
     * kelas turunan.
     */
    public abstract void prepare();
}
