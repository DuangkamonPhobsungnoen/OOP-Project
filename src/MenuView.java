import java.awt.*;
import javax.swing.*;
import javax.xml.parsers.FactoryConfigurationError;
public class MenuView {
    private JFrame jf;
    private JPanel jphead, jphtext, jphback, jpcombo, jptable, jpbadd, jpleft, jpright, jpbill, jppay, jpbutton, jpgroup, jporder, jptable1, jgrouptable;
    private JComboBox jcbmenu;
    private JTextArea jtabill;
    private JLabel jlhtext, jlpay;
    private JTextField jtfpay;
    private JTable jtmenu, jtorder;
    private JButton jbback, jbadd, jbbill, jbclear, jbprint;
    
    public MenuView(){
        jf = new JFrame();
        
        jphead = new JPanel();
        jphtext = new JPanel();
        jphback = new JPanel();
        jpcombo = new JPanel();
        jptable = new JPanel();
        jpbadd = new JPanel();
        jpleft = new JPanel();
        jpright = new JPanel();
        jpbill = new JPanel();
        jppay = new JPanel();
        jpbutton = new JPanel();
        jpgroup = new JPanel();
        jporder = new JPanel();
        jptable1 = new JPanel();
        jgrouptable = new JPanel();
        
        jcbmenu = new JComboBox();
        jcbmenu.addItem("noodle");
        
        jtabill = new JTextArea(20, 30);
        JScrollPane jspbill = new JScrollPane(jtabill, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        jlhtext = new JLabel("HOM-KLIN-NGERN");
        jlpay = new JLabel("PAY");
        
        jtfpay = new JTextField(10);
        
        jbback = new JButton("BACK");
        jbadd = new JButton("ADD");
        jbbill = new JButton("BILL");
        jbclear = new JButton("CLEAR");
        jbprint = new JButton("PRINT BILL");
        
        // tablemenu
        jptable.setLayout(new BoxLayout(jptable, BoxLayout.Y_AXIS));
        String[] columnNames = { "Menu", "Price" };
        Object[][] data = {{ "Soup", "45"},{"Coca - cola", "20"}};
        jtmenu = new JTable(data, columnNames);

        jptable.add(jtmenu.getTableHeader(), BorderLayout.PAGE_START);
        jptable.add(jtmenu);
        
        jptable1.setLayout(new BoxLayout(jptable1, BoxLayout.Y_AXIS));
        String[] columnNames1 = { "Menu", "Price" };
        Object[][] data1 = {{ "Soup", "45"},{"Coca - cola", "20"}};
        jtorder = new JTable(data1, columnNames1);

        jptable1.add(jtorder.getTableHeader(), BorderLayout.PAGE_START);
        jptable1.add(jtorder);
        
        // head
        jphead.setLayout(new BorderLayout());
        jphtext.add(jlhtext);
        jphback.add(jbback);
        jphead.add(jphtext, BorderLayout.WEST);
        jphead.add(jphback, BorderLayout.EAST);
        
        // option left
        jgrouptable.setLayout(new GridLayout());
        jgrouptable.add(jptable);
        jgrouptable.add(jptable1);
        
        jpleft.setLayout(new BorderLayout());
        jpcombo.add(jcbmenu);
        jptable.add(jtmenu);   
        jpbadd.add(jbadd);
        jpleft.add(jpcombo, BorderLayout.NORTH);
        jpleft.add(jgrouptable, BorderLayout.CENTER);
        jpleft.add(jpbadd, BorderLayout.SOUTH);
        
        //option right
        jppay.setLayout(new FlowLayout());
        jppay.add(jlpay);
        jppay.add(jtfpay);
        jppay.add(jbbill);
        
        jpbutton.setLayout(new FlowLayout());
        jpbutton.add(jbclear);
        jpbutton.add(jbprint);
                
        jpright.setLayout(new BorderLayout());
        jpbill.add(jspbill); 
        jpright.add(jpbill, BorderLayout.NORTH);
        jpright.add(jppay, BorderLayout.CENTER);
        jpright.add(jpbutton, BorderLayout.SOUTH);
        
        // left + right
        jpgroup.setLayout(new GridLayout(1,2));
        jpgroup.add(jpleft);
        jpgroup.add(jpright);
        
        // setBackground
        jphead.setBackground(new Color(28, 64, 121));
        jphtext.setBackground(new Color(28, 64, 121));
        jphback.setBackground(new Color(28, 64, 121));
        jbback.setBackground(Color.WHITE);
        
        jcbmenu.setBackground(new Color(255, 204, 0));
        jtmenu.setBackground(new Color(28, 64, 121));
        jtmenu.getTableHeader().setBackground(new Color(28, 64, 121));
        jbadd.setBackground(new Color(255, 204, 0));
        jptable.setBackground(new Color(28, 64, 121));
        jptable1.setBackground(new Color(255, 204, 0));
        jtorder.setBackground(new Color(255, 204, 0));
        jtorder.getTableHeader().setBackground(new Color(255, 204, 0));
        
        jtabill.setBackground(new Color(28, 64, 121));
        jbbill.setBackground(new Color(28, 64, 121));
        jbclear.setBackground(new Color(28, 64, 121));
        jbprint.setBackground(new Color(28, 64, 121));
        
        jpcombo.setBackground(Color.WHITE);
        jpbadd.setBackground(Color.WHITE);
        jppay.setBackground(Color.WHITE);
        jpbutton.setBackground(Color.WHITE);
        jpbill.setBackground(Color.WHITE);
        
        
        
        // set Font
        jlhtext.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        jbback.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        
        jcbmenu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jtmenu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jtmenu.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbadd.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jtorder.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jtorder.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        
        jtabill.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbbill.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbclear.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jbprint.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        jlpay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
       

        
        // set ColorFont
        jlhtext.setForeground(new Color(255, 204, 0));
        jtabill.setForeground(Color.WHITE);
        jbbill.setForeground(Color.WHITE);
        jbclear.setForeground(Color.WHITE);
        jbprint.setForeground(Color.WHITE);
        jtmenu.setForeground(Color.WHITE);
        jtmenu.getTableHeader().setForeground(Color.WHITE);
        
        
        // set table grid
        jtmenu.setShowGrid(false);
        jtmenu.setRowHeight(25);
        jtorder.setShowGrid(false);
        jtorder.setRowHeight(25);
        
        jf.add(jphead, BorderLayout.NORTH);
        jf.add(jpgroup);
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(820, 550);
        jf.setResizable(false);
        
        
        //Receipt bill
//        jtabill.setText("-----------------------------------------------------------------------\n"
//               + "\t" + "HOM  - GIN - GRUEN \n"
//               + "\t" + "   " + "1234 Main Street\n" 
//               + "\t" + "         " + "Suite 567\n" 
//               + "\t" + "City Name, State 64321\n" 
//               + "\t" + "       " + "023-334-2345\n"
//               + "-----------------------------------------------------------------------\n");
                     	   
         
        
        
    }
    public static void main(String[] args) {
        new MenuView();
    }

    public JFrame getJf() {
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JPanel getJphead() {
        return jphead;
    }

    public void setJphead(JPanel jphead) {
        this.jphead = jphead;
    }

    public JPanel getJphtext() {
        return jphtext;
    }

    public void setJphtext(JPanel jphtext) {
        this.jphtext = jphtext;
    }

    public JPanel getJphback() {
        return jphback;
    }

    public void setJphback(JPanel jphback) {
        this.jphback = jphback;
    }

    public JPanel getJpcombo() {
        return jpcombo;
    }

    public void setJpcombo(JPanel jpcombo) {
        this.jpcombo = jpcombo;
    }

    public JPanel getJptable() {
        return jptable;
    }

    public void setJptable(JPanel jptable) {
        this.jptable = jptable;
    }

    public JPanel getJpbadd() {
        return jpbadd;
    }

    public void setJpbadd(JPanel jpbadd) {
        this.jpbadd = jpbadd;
    }

    public JPanel getJpleft() {
        return jpleft;
    }

    public void setJpleft(JPanel jpleft) {
        this.jpleft = jpleft;
    }

    public JPanel getJpright() {
        return jpright;
    }

    public void setJpright(JPanel jpright) {
        this.jpright = jpright;
    }

    public JPanel getJpbill() {
        return jpbill;
    }

    public void setJpbill(JPanel jpbill) {
        this.jpbill = jpbill;
    }

    public JPanel getJppay() {
        return jppay;
    }

    public void setJppay(JPanel jppay) {
        this.jppay = jppay;
    }

    public JPanel getJpbutton() {
        return jpbutton;
    }

    public void setJpbutton(JPanel jpbutton) {
        this.jpbutton = jpbutton;
    }

    public JPanel getJpgroup() {
        return jpgroup;
    }

    public void setJpgroup(JPanel jpgroup) {
        this.jpgroup = jpgroup;
    }

    public JComboBox getJcbmenu() {
        return jcbmenu;
    }

    public void setJcbmenu(JComboBox jcbmenu) {
        this.jcbmenu = jcbmenu;
    }

    public JTextArea getJtabill() {
        return jtabill;
    }

    public void setJtabill(JTextArea jtabill) {
        this.jtabill = jtabill;
    }

    public JLabel getJlhtext() {
        return jlhtext;
    }

    public void setJlhtext(JLabel jlhtext) {
        this.jlhtext = jlhtext;
    }

    public JLabel getJlpay() {
        return jlpay;
    }

    public void setJlpay(JLabel jlpay) {
        this.jlpay = jlpay;
    }

    public JTextField getJtfpay() {
        return jtfpay;
    }

    public void setJtfpay(JTextField jtfpay) {
        this.jtfpay = jtfpay;
    }

    public JTable getJtmenu() {
        return jtmenu;
    }

    public void setJtmenu(JTable jtmenu) {
        this.jtmenu = jtmenu;
    }

    public JButton getJbback() {
        return jbback;
    }

    public void setJbback(JButton jbback) {
        this.jbback = jbback;
    }

    public JButton getJbadd() {
        return jbadd;
    }

    public void setJbadd(JButton jbadd) {
        this.jbadd = jbadd;
    }

    public JButton getJbbill() {
        return jbbill;
    }

    public void setJbbill(JButton jbbill) {
        this.jbbill = jbbill;
    }

    public JButton getJbclear() {
        return jbclear;
    }

    public void setJbclear(JButton jbclear) {
        this.jbclear = jbclear;
    }

    public JButton getJbprint() {
        return jbprint;
    }

    public void setJbprint(JButton jbprint) {
        this.jbprint = jbprint;
    }
    
    
}