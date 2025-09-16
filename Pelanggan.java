import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatPesanan = new ArrayList<Pesanan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pesanan buatPesanan(String idPesanan) {
        Pesanan pesanan = new Pesanan(idPesanan, this);
        riwayatPesanan.add(pesanan);
        return pesanan;
    }

    public String getInfo() {
        String info = "";
        info += "ID Pelanggan : " + idPelanggan + "\n";
        info += "Nama         : " + nama + "\n";

        if (!riwayatPesanan.isEmpty()) {
            info += "Riwayat Pesanan:\n";
            for (Pesanan p : riwayatPesanan) {
                info += p.getDetailPesanan() + "\n";
            }
        } else {
            info += "Belum ada pesanan.\n";
        }
        return info;
    }
}
