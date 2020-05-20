
package responsi;


public class ControlTiket {
    ModelTiket modeltiket= new ModelTiket();
     private Object[][] data = new Object[50][8];
     
     String nama,jeniskelamin,stasiun,kereta;
     
     public Object[][] Data() {
        data = modeltiket.getData();
        return data;
    }
          public void Proses( String namu){
        modeltiket.Proses(namu);
        new ViewDtiket();
    }
       public String getNama() {
        return nama;
    }

    public void setNama(String name) {
        this.nama = name;
    }
    
        public String getGender() {
        return jeniskelamin;
    }

    public void setGender(String gender) {
        this.jeniskelamin = gender;
    }
    
        public String getStasiun() {
        return stasiun;
    }

    public void setStasiun(String stat) {
        this.stasiun = stat;
    }
    
    public String getKereta() {
        return kereta;
    }

    public void setKereta(String ker) {
        this.kereta = ker;
    }
}
