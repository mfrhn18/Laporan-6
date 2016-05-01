package inheritanceVI;
import java.util.Scanner;
public class employeeMain {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        String choose;
        do{
            System.out.println("            EMPLOYEE PAGE             ");
            System.out.println("===========================================");
            System.out.println("Silahkan login terlebih dahulu.");
            System.out.print("Nama                          : ");
            String nama = in.nextLine();
            System.out.print("Jabatan (PNS/Non-PNS/Manager) : ");
            String jabatan = in.nextLine();
            System.out.print("ID Pegawai (ex. MGR0001)      : ");
            String id = in.nextLine();
            System.out.print("Istri (y/n)                   : ");
            String istri = in.nextLine();
            System.out.print("Jumlah Anak                   : ");
            int anak = in.nextInt();
            System.out.print("Tahun Masuk                   : ");
            int thnmasuk = in.nextInt();
            
            if(jabatan.equalsIgnoreCase("Manager")){
                manager mgr = new manager(nama,jabatan,id,istri,anak,thnmasuk);
                mgr.Bonus();
                mgr.TunjanganAnak();
                mgr.TunjanganIstri();
                mgr.TunjanganJabatan();
                mgr.displayMessage();
            }else if(jabatan.equalsIgnoreCase("Non-PNS")){
                pegawaitidaktetap non = new pegawaitidaktetap(nama,jabatan,id,istri,anak,thnmasuk);
                System.out.print("Jam Lembur                : ");
                int jlm = in.nextInt();
                non.Lembur(jlm);
                non.Lembur();
                non.displayMessage();
            }else{
                pegawaitetap pns = new pegawaitetap(nama,jabatan,id,istri,anak,thnmasuk);
                pns.Bonus();
                pns.TunjanganAnak();
                pns.TunjanganIstri();
                pns.displayMessage();
            }
            System.out.println("Keluar? (y/n)");
            choose = in.nextLine();
        }while(choose.equalsIgnoreCase("n"));
    }
}
