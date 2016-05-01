package inheritanceVI;
public class employee {
    protected String nama, jabatan, id, istri;
    protected int anak, thnmasuk, masakerja;
    protected double tis, ta, tun, bon, lem;
    protected static final int gp = 2500000;
    public employee(String n, String j, String i, String is, int a, int tm){
        nama = n;
        jabatan = j;
        id = i;
        istri = is;
        anak = a;
        thnmasuk = tm;
    }
    public int getGaji(){
        return gp;
    }
    public double Bonus(){
        masakerja = 2016 - thnmasuk;
        if(masakerja > 5 && masakerja <= 10){
            bon = 0.05 * gp;
        }else if(masakerja > 10){
            bon = 0.1 * gp;
        }else{
            bon = 0;
        }
        return bon;
    }
    public double TunjanganIstri(){
        if(istri.equalsIgnoreCase("y")){
            tis = 0.1 * (gp + bon);
        }else{
            tis = 0;
        }
        return tis;
    }
    public double TunjanganAnak(){
        if(anak >= 1 && anak <= 3){
            ta = 0.15 * (gp + bon + tis);
        }else{
            ta = 0;
        }
        return ta;
    }
    public double total(){
        return gp + tis + ta + bon;
    }
}
