package Tugas_1;

public class Rekening{
    private int no_rek;
    private int saldo = 0;

    protected void setNo_rek(int no_rek) {
        this.no_rek = no_rek;
    }

    public String getSaldo(int noRek) {
        if (this.no_rek != noRek) {
            return "Nomer Rekening Tidak Sama";
        }else{
            return String.valueOf(saldo);
        }
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String tambahSaldo(int noRek,int jumlah_saldo){
        if (this.no_rek == noRek) {
            this.saldo += jumlah_saldo;
            return "Tambah Saldo Berhasil.";                
        }else{
            return "Rekening Belum Dibuat";
        }
    }

    public String cekSaldo(int noRek){
        if (this.no_rek == noRek) {
            return "Jumlah Saldo Saat Ini : "+saldo;
        }else{
            return "Rekening Belum Dibuat";
        }        
    }

    public String ambilSaldo(int noRek,int jumlah_saldo) {
        if (this.no_rek == noRek) {
            if (this.saldo - jumlah_saldo <= 0) {
                return "Saldo anda tidak mencukupi. Sisa saldo anda saat ini :"+saldo;
            }else{
                this.saldo -= jumlah_saldo;
                return "Saldo Berhasil Ditarik.";
            }
        }else{
            return "Rekening Belum Dibuat";
        }
    }

}
