package praktikum.tugas6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true = laki-laki, false = perempuan
    private String nik;
    private boolean status; // true = sudah menikah, false = belum menikah

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean status) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getTunjangan() {
        if (status) {
            return jenisKelamin ? 25 : 20; // Laki-laki: $25, Perempuan: $20
        } else {
            return 15; // Belum menikah: $15
        }
    }

    public double getPendapatan() {
        return getTunjangan(); 
    }

    public String toString() {
        return "Nama: " + nama + "\n" +
                "NIK: " + nik + "\n" +
                "Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
                "Pendapatan: " + getPendapatan() + "\n";
    }
}

