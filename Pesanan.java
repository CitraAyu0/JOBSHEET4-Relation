import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private Pelanggan pelanggan;
    private double totalHarga;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String idPesanan, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.daftarMenu = new ArrayList<Menu>();
        this.totalHarga = 0.0;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
        totalHarga += menu.getHarga();
    }

    public String getDetailPesanan() {
        String info = "";
        info += "ID Pesanan : " + idPesanan + "\n";
        info += "Pelanggan  : " + pelanggan.getNama() + "\n";
        info += "Daftar Menu:\n";

        for (Menu m : daftarMenu) {
            info += "- " + m.getInfo() + "\n";
        }

        info += "Total Harga: Rp" + totalHarga + "\n";
        return info;
    }
}
