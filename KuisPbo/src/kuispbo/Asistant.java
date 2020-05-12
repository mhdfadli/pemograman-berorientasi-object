
package kuispbo;


public class Asistant implements Interfacenya{
    protected String nim,nama;
    protected float nt,nc,nw,nm,rata2;
   
 
   public Asistant(String nim, String nama, float nt,float nc,float nw, float nm)
   {
       this.nim=nim;
       this.nama=nama;
       this.nt=nt;
       this.nc=nc;
       this.nw=nw;
       this.nm=nm;
   }
    
    @Override
   public float rata()
   {
       rata2=(nt+nc+nw+nm)/4;
       return rata2;
   }
   
   
}
