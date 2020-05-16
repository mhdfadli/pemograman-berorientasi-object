
package PrakPbo;

public class ControlMember {
    private Object[][] data = new Object[50][8];
    private Object[][] deta = new Object[50][8];
    
    ModelMember modelmember= new ModelMember();
    
    //sebelum
    private String nama, email, user, pass;
    private static String wellcomeName;
    
    public Object[][] Data() {
        data = modelmember.getData();
        return data;
    }
    public Object[][] Data2() {
        deta = modelmember.getData2();
        return deta;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getWellcomeName() { return wellcomeName; }

    public void setWellcomeName(String wellcomeName) { this.wellcomeName = wellcomeName; }
}
