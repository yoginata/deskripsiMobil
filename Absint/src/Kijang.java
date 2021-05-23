public class Kijang extends Mobil implements SUV, MPV {
    private String warna;
    private String mesin;

    public Kijang(String nama, String merk, String warna, String mesin) {
        super(nama, merk);
        this.warna = warna;
        this.mesin = mesin;
    }

    public void displayTipe() {
        System.out.println("Tipe Mobil  : " + MPV);
        System.out.println("Jenis Mobil : " + MPV1);
    }

    public void displayMobil() {
        System.out.println("Nama Mobil  : " + getNama());
        System.out.println("Merk Mobil  : " + getMerk());
    }

    public void displayDataMobil() {
        displayTipe();
        displayMobil();
        System.out.println("Warna: " + warna);
        System.out.println("Mesin: " + mesin);
    }
}