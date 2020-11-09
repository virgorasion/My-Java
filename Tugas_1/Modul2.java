package Tugas_1;

public class Modul2 {
    public static void main(String[] args) {
        Nasabah fauzan = new Nasabah();
        fauzan.setNama("M Nur Fauzan W");
        fauzan.setAlamat("Kapas Madya");
        fauzan.setTelp("083849575737");
        fauzan.setRekening(12345);

        System.out.println(fauzan.tambahSaldo(fauzan.getRekening(), 100000));
        System.out.println(fauzan.cekSaldo(fauzan.getRekening()));
        System.out.println(fauzan.ambilSaldo(fauzan.getRekening(), 50000));
        System.out.println(fauzan.cekSaldo(fauzan.getRekening()));

        Nasabah fatin = new Nasabah();
        fatin.setNama("Fatin Zahidah Mas'ud");
        fatin.setAlamat("Jl. Raden Wijaya");
        fatin.setTelp("081242723585");
        fatin.setRekening(54321);

        System.out.println(fatin.tambahSaldo(fatin.getRekening(), 230000));
        System.out.println(fatin.cekSaldo(fatin.getRekening()));
        System.out.println(fatin.ambilSaldo(fatin.getRekening(), 110000));
        System.out.println(fatin.cekSaldo(fatin.getRekening()));

        fauzan.cekProfile();
        fatin.cekProfile();
    }
}