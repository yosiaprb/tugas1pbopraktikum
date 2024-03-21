import java.util.Random;

public class ToDo2 {
    public static void main(String[] args) {
        // Membuat objek Random untuk menghasilkan bilangan acak
        Random random = new Random();

        // Menghasilkan bilangan bulat acak antara 0 dan 10
        int bilanganBulat = random.nextInt(11);
        System.out.println("Bilangan bulat acak     : " + bilanganBulat);

        // Menghasilkan bilangan pecahan acak antara 0.0 dan 1.0
        double bilanganPecahan = random.nextDouble();
        System.out.println("Bilangan pecahan acak   : " + bilanganPecahan);

        // Menghasilkan nilai boolean acak
        boolean nilaiBoolean = random.nextBoolean();
        System.out.println("Nilai boolean acak      : " + nilaiBoolean);

        // Menghasilkan bilangan bulat acak dalam rentang tertentu (misalnya, antara 10 dan 30)
        int rentangAwal = 10;
        int rentangAkhir = 30;
        int bilanganBulatRentang = random.nextInt(rentangAkhir - rentangAwal + 1) + rentangAwal;
        System.out.println("Bilangan bulat acak dalam rentang " + rentangAwal + " dan " + rentangAkhir + ": " + bilanganBulatRentang);
    }
}
