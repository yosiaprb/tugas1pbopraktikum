public class Anjing {
    // Properti
    private String nama;
    private String ras;
    private int umur;
    private String warna;

    // Konstruktor
    public Anjing(String nama, String ras, int umur, String warna) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
        this.warna = warna;
    }

    // Method untuk menggerakkan ekor anjing
    public void ekor() {
        System.out.println(nama + " menggerakkan ekornya.");
    }

    // Method untuk menggonggong
    public void gonggong() {
        System.out.println(nama + " sedang menggonggong: Woof! Woof!");
    }

    // Method untuk tidur
    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    // Method untuk menampilkan informasi anjing
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Warna: " + warna);
    }

    public static void main(String[] args) {
        // Instantiasi objek Anjing
        Anjing anjing1 = new Anjing("Milo", "Golden Retriever", 3, "Coklat");
        Anjing anjing2 = new Anjing("Archie", "Poodle", 2, "Putih");
        Anjing anjing3 = new Anjing("Bombom", "Bulldog", 4, "Abu-abu");

        // Memanggil method pada setiap objek
        anjing1.info();
        anjing1.ekor();
        anjing1.gonggong();
        anjing1.tidur();

        System.out.println();

        anjing2.info();
        anjing2.ekor();
        anjing2.gonggong();
        anjing2.tidur();

        System.out.println();

        anjing3.info();
        anjing3.ekor();
        anjing3.gonggong();
        anjing3.tidur();
    }
}
