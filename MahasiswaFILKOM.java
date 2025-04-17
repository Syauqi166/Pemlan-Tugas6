package praktikum.tugas6;

public class MahasiswaFILKOM extends Manusia {
    private  String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean status, String nim, double ipk) {
        super(nama, jenisKelamin, nik, status);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        String prodi = Character.toString(nim.charAt(6));
        
        switch (prodi) {
            case "2":
                return "Teknik Informatika " + angkatan;
            case "3":
                return "Teknik Komputer " + angkatan;
            case "4":
                return "Sistem Informasi " + angkatan;
            case "6":
                return "Pendidikan Teknologi Informasi, " + angkatan;
            case "7":
                return "Teknologi Informasi, " + angkatan;
            default:
                return "Program Studi Tidak Dikenal";
        }
        
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + "NIM: " + nim + "\n" +
                "IPK: " + ipk + "\n" +
                "Status: " + getStatus() + "\n";
    }
}
