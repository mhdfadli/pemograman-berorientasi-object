/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

public class ControlKereta {
     ModelKereta modelkereta= new ModelKereta();
      ModelKereta modelcari= new ModelKereta();
     
     private Object[][] data = new Object[50][8];
     
        String idk,namak,kelask;
     
        public Object[][] Data() {
        data = modelkereta.getData();
        return data;
    }
        public Object[][] Find(String data){
        this.data = modelcari.Find(data);
        return this.data;
    }
        
        public void Update(Object[][] dete, String id_kereta){
        modelcari.Update(dete,id_kereta);
        new ViewDKereta();
    }
         public void Delete(Object[][] dete, String id_kereta){
        modelcari.Delete (dete,id_kereta);
        new ViewDKereta();
    }
        
     public String getIdk() {
        return idk;
    }

    public void setIdk(String idk) {
        this.idk = idk;
    }
    
     public String getNamak() {
        return namak;
    }

    public void setNamak(String namak) {
        this.namak = namak;
    }
    
     public String getKelask() {
        return kelask;
    }

    public void setKelask(String kelask ){
        this.kelask = kelask;
    }
}
