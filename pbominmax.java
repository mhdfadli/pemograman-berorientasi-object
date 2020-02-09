package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanInput = new Scanner(System.in);
        String nama;
        int a,max,min,rata,jum;
        jum=0;
        max=0;min=0;
        System.out.print("nama    : ");nama= scanInput.nextLine(); 
        System.out.print("jumlah nilai    : ");a= scanInput.nextInt();
     
        int nilai[]=new int[a+1];
        for (int i =1 ; i <a+1; i++) {
            System.out.print("nilai ke "+ i +" : ");
            nilai[i] = scanInput.nextInt();
            jum=jum+nilai[i];

            if (min==0 & max==0 ) {
                min=nilai[i];
                max=nilai[i];

            } else if(nilai[i]>max) {
              max=nilai[i];
            }
                else if(nilai[i]<min)min =nilai[i];
                
        }
        rata=jum/a;
        System.out.println("nama  : "+nama);
        System.out.println("nilai tertinggi : " + max);
        System.out.println("nilai terendah  : " + min);
        System.out.println("rata-rata : " + rata);
    }
}