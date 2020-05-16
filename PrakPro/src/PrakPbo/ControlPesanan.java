
package PrakPbo;

import java.util.Random;

public class ControlPesanan {
//     Object[][] deta = new Object[50][30];
//    ModelPesanan mp= new ModelPesanan();
//    
    String  pesanan,gelas, gula, catatan, noMeja, tanggal;
    
//    public Object[][] Data() {
//       // data = modelmember.getData();
//       deta=mp.getData();
//        return deta;
//    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(String noMeja) {
        this.noMeja = noMeja;
    }
    int id_pesan;
    int jumlah = 0;

    public int getId_pesan() {
        return id_pesan;
    }

    public void setId_pesan(int id_pesan) {
        this.id_pesan = id_pesan;
    }
    

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public String getGelas() {
        return gelas;
    }

    public void setGelas(String gelas) {
        this.gelas = gelas;
    }

    public String getGula() {
        return gula;
    }

    public void setGula(String gula) {
        this.gula = gula;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
    


    void setId_pesan(Random id_pesan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
