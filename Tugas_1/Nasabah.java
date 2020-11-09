package Tugas_1;

public class Nasabah extends Rekening{
    private String nama;
    private String alamat;
    private String telp;
    private int rekening;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public int getRekening() {
        return rekening;
    }

    public void setRekening(int rekening) {
        this.setNo_rek(rekening);
        this.rekening = rekening;
    }
    
    public void cekProfile()
    {
        String rek = String.valueOf(rekening);
        System.out.println("Nama: "+getNama());
        System.out.println("Alamat: "+getAlamat());
        System.out.println("No Telp: "+getTelp());
        System.out.println("Saldo: "+getSaldo(getRekening()));
    }

}
