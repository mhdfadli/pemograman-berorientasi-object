
package PrakPbo;


public class ControlKopi {
    ControlMember dataMember= new ControlMember();
    //ModelKopi modelkopi =new ModelKopi();
    
     private Object[][] data = new Object[50][8];
     
     String id_kopi,nama,harga;

    ModelKopi model = new ModelKopi();
    
        public void Create(Object[][] data){
        model.Create(data);
       new ViewUtama(dataMember);
    }
        public void Delete(String nama){
        model.Delete(nama);
        new ViewUtama(dataMember);
    }
        
        public Object[][] Find(String data){
        this.data = model.Find(data);
        return this.data;
    }
        
        public void Update(Object[][] data, String nama){
        model.Update(data,nama);
        new ViewUtama(dataMember);
    }
         public Object[][] FindD(String data){
        this.data = model.FindD(data);
        return this.data;
    }
        
//        public String getId() {
//        return id_kopi;
//    }
//
//    public void setId(String id_kopi) {
//        this.id_kopi = id_kopi;
//    } 
//    
//    public String getNama() {
//        return nama;
//    }
//
//    public void setNama(String nama) {
//        this.id_kopi = id_kopi;
//    }
//     public String getHarga() {
//        return harga;
//    }
//
//    public void setHarga(String harga) {
//        this.harga =harga;
//    }
    
    
}
