public class RestoranDemo {
    public static void main(String[] args) {

        Menu nasiGoreng = new Menu("M001", "Nasi Goreng", 20000);
        Menu bakmieGoreng = new Menu("M002", "Bakmie Goreng", 15000);
        Menu esTeh = new Menu("M003", "Es Teh", 5000);
        Menu esJeruk = new Menu("M004", "Es Jeruk", 5000);

        Pelanggan pelanggan1 = new Pelanggan("C001", "Budi");
        Pelanggan pelanggan2 = new Pelanggan("C002", "Siti");

        Pesanan pesanan1 = pelanggan1.buatPesanan("P001");
        pesanan1.tambahMenu(nasiGoreng);
        pesanan1.tambahMenu(esTeh);

        Pesanan pesanan2 = pelanggan2.buatPesanan("P002");
        pesanan2.tambahMenu(bakmieGoreng);

        System.out.println(pelanggan1.getInfo());
        System.out.println(pelanggan2.getInfo());
    }
}
