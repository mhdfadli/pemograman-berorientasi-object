/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import bangundatar.*;
import bangunruang.*;


public class Main {

    public static void main(String[] args) {
        int pil;
        char kembali;
        double tinggi;
        Scanner input = new Scanner (System.in);
        
           do
        {
        //Scanner input=new Scanner(System.in);
        System.out.println("**** MENU *****");
        System.out.println("1. persegi");
        System.out.println("2. pesegi panjang");
        System.out.println("3. segitiga");
        System.out.print("pilih : ");pil=input.nextInt();
        
        switch(pil)
        {
            case 1:
                    System.out.println("** anda dimenu persegi **");
                    System.out.print("input sisi : ");  double sisi = input.nextDouble();
                  Parent persegi = new Persegi(sisi);
                    System.out.println("hasil yang ditampilkan sebagai bangun 2 dimensi yaitu : ");
                    System.out.println("luas persegi : "  + persegi.getLuas());                                   
                    System.out.println("keliling persegi :" + persegi.getKeliling());
                    System.out.println("hasil yang dapt ditampilkan sebago bangun 3 dimensi yaitu");
                    System.out.println("input tinngi untuk volume limas : ");   tinggi = input.nextDouble();              
                  Parent kubus = new Kubus(persegi.getLuas(),tinggi, persegi.sisi);
                    System.out.println("KUBUS");
                    System.out.println("\tvolume : "  + kubus.getVolume());
                    System.out.println("\tluas.permukaan : " + kubus.getLuasPermukaan());
                Parent limas=new Limas(persegi.getLuas(),kubus.tinggi,persegi.sisi);
                    System.out.println("LIMAS PERSEGI : ");
                    System.out.println("\tvolume :" +limas.getVolume() );
                    System.out.println("\tluas.permukaan : " + limas.getLuasPermukaan());
                     
                break;
            case 2 :
                
                    System.out.println("** anda dimenu persegi panjang **");                  
                    System.out.print("input panjang  persegi panjang\t: ");   double panjang=input.nextInt();
                    System.out.print("input lebar persegi panjang\t: ");double lebar=input.nextInt();
                   Parent perpan=new PersegiPanjang(panjang,lebar);
                    System.out.println("hasil dari bangun 2 dimensi nya yaitu :");
                    System.out.println("luas persegi panjang : " + perpan.getLuas());                                 
                    System.out.println("keliling persegi panjang : " +perpan.getKeliling() );
                    System.out.println("input tinggi untuk mendapat kan volume dan luas permukaan bangun 3 dimensi ");
                    
                    System.out.print("tinngi = : ");     tinggi = input.nextDouble();            
                    System.out.println("hasil dari bangun 3 dimensi yaitu : ");
                   Parent balok =new Balok(perpan.getLuas(),tinggi,perpan.panjang,perpan.lebar);
                    System.out.println("volume balok nya yaitu : " +balok.getVolume());
                    System.out.println("luas permukaan balok yaitu : " +balok.getLuasPermukaan());
                    System.out.println("volume limas persegi panjang : ");
                    System.out.println("luas permukaan limas persegi panjang : ");
                    break;
            case 3 :
                    System.out.println("** anda dimenu segitiga **");
                    System.out.println("input alas : "); double alas=input.nextInt();
                    System.out.println("input tinggi : ");double tinggi3=input.nextInt();
                   Parent segitiga = new Segitiga (alas,tinggi3);
                    System.out.println("luas segitiga : " +segitiga.getLuas());
                    System.out.println("keliling segitiga : " + segitiga.getKeliling());
                    System.out.println("input tinggi untuk mendapat kan volume dan luas permukaan bangun 3 dimensi ");
                    System.out.println("tinggi : ");tinggi = input.nextDouble();  
                  Parent limas3 =new Limas3(alas,tinggi3,tinggi);
                     System.out.println("volume limas segitiga nya yaitu : " +limas3.getVolume());
                    System.out.println("luas permukaan limas segitiga yaitu : " +limas3.getLuasPermukaan());
                break;
            default :
                    System.out.println("!! MENU TIDAK TERSEDIA YA ...");
        }
            System.out.print("kembali kah : ");kembali=input.next().charAt(0);
        }while(kembali=='y' || kembali =='Y');
        
        System.out.println("tengkiu !!!!");
     
        
        
        
        
        
        
      //  System.out.println("sisi = " + persegi.sisi);
       // double tinggi = input.nextDouble();
        //System.out.println("luas Persegi = " + persegi.getLuas());
       // System.out.println("keliling = " + persegi.getKeliling());
      //  Parent kubus = new Kubus(persegi.getLuas(),tinggi, persegi.sisi);
       // System.out.println("luas permukaan = " + kubus.getLuasPermukaan());
        //System.out.println("Volume = " + kubus.getVolume());
    }
    
}
