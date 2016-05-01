package inheritanceVI;
public class pegawaitidaktetap extends employee{
    private double bonlem;
    private int lembur;
    public pegawaitidaktetap(String n, String j, String i, String is, int a, int tm){
        super(n,j,i,is,a,tm);
    }
    public void Lembur(int h){
        lembur = h;
    }
    public double Lembur(){
        if(lembur > 10){
            bonlem = lembur * 10000;
        }else{
            bonlem = 0;
        }
        return bonlem;
    }
    public double totalHon(){
        return bonlem + gp;
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
        System.out.println("Lembur : Rp"+bonlem);
        System.out.println("______________________________________+");
        System.out.println("TOTAL             : Rp"+totalHon());
    }
}
