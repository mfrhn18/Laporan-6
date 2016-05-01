package inheritanceVI;
public class manager extends employee{
    private double tjb;
    public manager(String n, String j, String i, String is, int a, int tm){
        super(n,j,i,is,a,tm);
    }
    public double TunjanganJabatan(){
        tjb = 0.1 * total();
        return tjb;
    }
    public double totalMgr(){
        return tjb + gp + tis + ta + bon;
    }
    public void displayMessage(){
        System.out.println("        LAMAN INFORMASI GAJI PEGAWAI       ");
        System.out.println("===========================================");
        System.out.println("");
        System.out.println("Data Pegawai");
        System.out.println("");
        System.out.println("Nama              : "+nama);
        System.out.println("Jabatan           : "+jabatan);
        System.out.println("ID Pegawai        : "+id);
        System.out.println("Lama Kerja        : "+masakerja+"(masuk tahun "+thnmasuk+")");
        System.out.println("Istri (y/n)       : "+istri);
        System.out.println("Anak              : "+anak);
        System.out.println("");
        System.out.println("=============== GAJI TOTAL ================");
        System.out.println("Gaji Pokok        : Rp"+gp);
        System.out.println("Bonus             : Rp"+bon);
        System.out.println("Tunjangan Istri   : Rp"+tis);
        System.out.println("Tunjangan Anak    : Rp"+ta);
        System.out.println("Tunjangan Jabatan : Rp"+tjb);
        System.out.println("______________________________________+");
        System.out.println("TOTAL             : Rp"+totalMgr());
    }
}
