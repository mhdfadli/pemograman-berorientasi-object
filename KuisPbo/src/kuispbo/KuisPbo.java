
package kuispbo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KuisPbo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama,nim;
        int nt,nc,nw,nm,nj;
        int pilih,banyak1,banyak2;
        char kembali;
        do{
            pilih=0;
            System.out.println("MENU FORM PENDAFTARAN");
            System.out.println("1. Asisten Laboratorium\n2. Admin Laboratorium");
            System.out.print("Pilih Jenis Form :");
               try {
                pilih = input.nextInt();
                
                switch(pilih)
               {
                   case 1:      System.out.println("FORM PENDAFTARAN ASISTEN LABORATORIUM");
                                System.out.print("berapa banyak data yang akan dinput ? ");    
                                try{  
                                banyak1 = input.nextInt();
                                for (int i = 0; i < banyak1; i++) 
                                {
                                    input.nextLine();System.out.println("");
                                    System.out.print("Input Nim\t\t\t: "); nim = input.nextLine();
                                    System.out.print("Input Nama\t\t\t: ");nama = input.nextLine();
                                    System.out.print("Input Nilai Tes Tulis\t\t: ");nt=input.nextInt();
                                    System.out.print("Input Nilai Tes Coding\t\t: ");nc=input.nextInt();
                                    System.out.print("Input Nilai Tes Wawancara\t: ");nw=input.nextInt();
                                    System.out.print("Input Nilai Tes Microteaching\t: ");nm=input.nextInt();
                                    
                                   Asistant asistant= new Asistant(nim, nama, nt, nc, nw, nm);
                                    asistant.rata();
                                    System.out.println("NIlai Akhir\t\t\t: " + asistant.rata2);
                                    
                                    if(asistant.rata2 >85)
                                    {
                                        System.out.println("Keterangan\t\t\t: LOLOS");
                                        System.out.println("SELAMAT KEPADA " +asistant.nim +" telah diterima sebagai Aslab");
                                    }
                                    
                                    else
                                    {
                                        System.out.println("Keterangan\t\t\t: GAGAL");
                                        System.out.println("MOHON MAAF KEPADA "+ asistant.nim+" anda ditolak sebagai Aslab");
                                    }
                                    
                                  
                                }
                                }catch (InputMismatchException e) {
                                 System.err.println("Inputan Harus Berupa Angka !");
                                kembali = input.next().charAt(0);
                                  }
                   
                       break;
                       
                   case 2:      System.out.println("FORM PENDAFTARAN ADMIN LABORATORIUM");
                                System.out.print("berapa banyak data yang akan dinput ? ");
                                try{
                                banyak2 = input.nextInt();
                                for (int i = 0; i < banyak2; i++) 
                                {
                                    input.nextLine();System.out.println("");
                                    System.out.print("Input Nim\t\t\t: ");nim = input.nextLine();
                                    System.out.print("Input Nama\t\t\t: ");nama = input.nextLine();
                                    System.out.print("Input Nilai Tes Tulis\t\t: ");nt=input.nextInt();
                                    System.out.print("Input Nilai Tes Coding\t\t: ");nc=input.nextInt();
                                    System.out.print("Input Nilai Tes Wawancara\t: ");nw=input.nextInt();
                                    System.out.print("Input Nilai Tes Jaringan\t: ");nj=input.nextInt();
                                    
                                    Admin admin= new Admin(nim, nama, nt, nc, nw, nj);
                                    admin.rata();
                                    System.out.println("NIlai Akhir\t\t\t: "+admin.rata2);
                                    if(admin.rata2 >85)
                                    {
                                        System.out.println("Keterangan\t\t\t: LOLOS");
                                        System.out.println("SELAMAT KEPADA " +admin.nim +" telah diterima sebagai Admin");
                                    }
                                    
                                    else
                                    {
                                        System.out.println("Keterangan\t\t\t: GAGAL");
                                        System.out.println("MOHON MAAF KEPADA "+ admin.nim+" anda ditolak sebagai Admin");
                                    }
                                }
                                }catch (InputMismatchException e) {
                                 System.err.println("Inputan Harus Berupa Angka !");
                                kembali = input.next().charAt(0);
                                  }
                   break ;
                       
                   default :    System.out.println("MENU TIDAK TERSEDIA !!!");
               }
                
            } catch (InputMismatchException e) {
                System.err.println("Inputan Harus Berupa Angka !");
                kembali = input.next().charAt(0);
            }
               
             System.out.print("Kembali ke menu? (y/n)");
            kembali = input.next().charAt(0);
        }while(kembali=='Y'||kembali=='y');
        
    }
    
}
