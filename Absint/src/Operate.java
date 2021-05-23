public class Operate {
    public static void main (String[] args){
        Rush a = new Rush("Rush","Toyota","Hitam","1500 cc");
        a.displayDataMobil();
        System.out.println();
        Kijang b = new Kijang("Kijang", "Toyota", "Hitam", "2400 cc");
        b.displayDataMobil();
        System.out.println();
        Pajero c = new Pajero("Pajero","Mitsubishi", "Putih","2500 cc");
        c.displayDataMobil();
        System.out.println();
        Wrangler d = new Wrangler("Wrangler","Jeep", "Hitam", "2000 cc");
        d.displayDataMobil();
        System.out.println();
    }
}
