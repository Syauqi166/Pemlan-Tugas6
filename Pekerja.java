package praktikum.tugas6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tanggalMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean status) {
        super(nama, jenisKelamin, nik, status);
        this.gaji = gaji;
        this.tanggalMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(LocalDate tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        double bonus = 0;
        int lamaBekerja = LocalDate.now().getYear() - tanggalMasuk.getYear();

        if (lamaBekerja > 0 && lamaBekerja <= 5) {
            bonus = 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            bonus = 0.10 * gaji;
        } else if (lamaBekerja > 10) {
            bonus = 0.15 * gaji;
        }
        return bonus;
    }

    @Override
    public double getTunjangan() {
        if (getJumlahAnak() > 0) {
            return 20 * getJumlahAnak(); // $10 per anak
        } else {
            return 0; // Tidak ada tunjangan untuk pekerja tanpa anak
        }
    }

    @Override
    public double getPendapatan() {
        return getGaji() + getTunjangan() + getBonus(); // Gaji + Tunjangan + Bonus
    }

    @Override
    public String toString() {
        return  "Nama: " + getNama() + "\n" +
                "NIK: " + getNik() + "\n" +
                "Jenis Kelamin: " + (isJenisKelamin() ?
                "Laki-laki" : "Perempuan") + "\n" +
                "Pendapatan: " + getPendapatan() + "\n" +
                "Tahun Masuk: " + tanggalMasuk.getYear() + "\n" +
                "Jumlah Anak: " + jumlahAnak + "\n" +
                "Gaji: " + getGaji() + "\n";
    }
}
