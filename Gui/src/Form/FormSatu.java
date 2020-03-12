
package Form;
import javax.swing.*;

class ObjekGUI
{
    public static void main(String[] args) {
        FormSatu g=new FormSatu();
    }
}

public class FormSatu  extends JFrame{
    JTextField fnama=new JTextField(20);
    JTextField fnim=new JTextField(20);  
    JTextField fNAMA=new JTextField(20);
    JTextField fNIM=new JTextField(20); 
    JTextField fJENISK=new JTextField(20);
    JTextField fAGAMA=new JTextField(20);
    JLabel lnama=new JLabel("NAMA");
    JLabel lNAMA= new JLabel("NAMA");
    JLabel lnim=new JLabel("NIM");
    JLabel lNIM=new JLabel("NIM");
    JLabel ljenisk=new JLabel("JENIS KELAMIN");
    JLabel lJENISK=new JLabel("JENIS KELAMIN");
    JLabel lagama= new JLabel("AGAMA");
    JLabel lAGAMA=new JLabel("AGAMA");
    String[] jeniskelamin={"lali-laki","perempuan"};
    JComboBox cmbJenKel= new JComboBox(jeniskelamin);
    JCheckBox cbislam= new JCheckBox("islam");
    JCheckBox cbhindu= new JCheckBox("hindu");
    JCheckBox cbbuda= new JCheckBox("budha");
    JCheckBox cbkristen= new JCheckBox("kristen");
    JCheckBox cbikonghucu= new JCheckBox("konghucu");
    JButton btnSave =new JButton("simpan");

    public FormSatu()
    {
 
        setTitle("biodata");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,200);
        setLayout(null);
        add(lnama);add(fnama);
        add(ljenisk); add(cmbJenKel);  
        add(lnim);add(fnim);
        add(lNAMA);add(fNAMA);
        add(lNIM);add(fNIM);
        add(lJENISK);add(fJENISK);
        add(lagama);add(cbislam);add(cbbuda);add(cbhindu);add(cbikonghucu);add(cbkristen);
        add(lAGAMA);add(fAGAMA);
        add(btnSave);
        
        lnama.setBounds(10,10 ,120,20);fnama.setBounds(130,10,150,20);  
        lnim.setBounds(10,35,120,20); fnim.setBounds(130,35,150,20);
        ljenisk.setBounds(10,60,120,20);cmbJenKel.setBounds(130,60,150,20);
        lagama.setBounds(10,85,120,20);cbislam.setBounds(130,85,70,20);cbkristen.setBounds(200,85,110,20);
        cbhindu.setBounds(130,110,70,20);cbbuda.setBounds(200,110,110,20);
        cbikonghucu.setBounds(130,135,100,20);
        
        btnSave.setBounds(130,170,120,20);
        
        lNAMA.setBounds(10,195,120,20);fNAMA.setBounds(130,195,150,20);
        lNIM.setBounds(10,220,120,20); fNIM.setBounds(130,220,150,20);
        lJENISK.setBounds(10,245,120,20);fJENISK.setBounds(130,245,150,20);
        lAGAMA.setBounds(10,270,120,20);fAGAMA.setBounds(130,270,150,20);
        setVisible(true);
    }
   
}
