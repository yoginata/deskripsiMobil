public abstract class Mobil {
    protected String nama;
    protected String merk;

    public Mobil(String nama, String merk) {
        this.nama = nama;
        this.merk = merk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void displayMobil() {
        System.out.println("Nama Mobil: " + getNama());
        System.out.println("Merk Mobil: " + getMerk());
    }
}