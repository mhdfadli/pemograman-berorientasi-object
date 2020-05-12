
package kuispbo;


public class Admin implements Interfacenya{
      protected String nim,nama;
    protected float nt,nc,nw,nj,rata2;
    
    public Admin(String nim, String nama, float nt,float nc,float nw, float nj)
   {
       this.nim=nim;
       this.nama=nama;
       this.nt=nt;
       this.nc=nc;
       this.nw=nw;
       this.nj=nj;
   }
    
    @Override
   public float rata()
   {
       rata2=(nt+nc+nw+nj)/4;
       return rata2;
   }
    
}
