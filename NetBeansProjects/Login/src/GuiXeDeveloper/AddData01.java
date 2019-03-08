package GuiXeDeveloper;

import ConnectionDb.ConnectTionDB_getTime_cardId;
import XuLyNgoai.GetID;
import XuLyNgoai.LocalTimeDemo;
import ConnectionDb.ConnectionUtil;
import XuLyNgoai.Dialog;
import XuLyNgoai.GetCard_Id;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import login.login;
import login.mainframe;
import login.test;

/**
 *
 * @author DangVanTu
 */
public class AddData01 extends JDialog implements Dialog {

    /**
     * @return the add
     */
    private JTextField text1, text7, t, t1, ghich, love,text01;
    static JTextField add;

    private JLabel label1, label4, label7, addluot, ghichu, loxe,te01;

    private JButton button, Cancel, s,Exit;

    private JPanel con1, con2;

    private LocalTimeDemo lct;

    private Choice ch, ch1, chmave, chlve;

    private String mabai, vengay, ghichu1;
    private Time giovao;

    private ConnectTionDB_getTime_cardId c;
    private int id;

    private String lxe, bso, manv, mabai1, hangui, mave;

    private JTable jtable;

    private JScrollPane sp;

    public AddData01() {

        this.setBounds(200, 200, 380, 250);
        this.setTitle("Thêm thông tin người gửi xe");

        this.setSize(900, 685);
        this.setLayout(new BorderLayout());

        setModal(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        ArrayList<String> listMave = new ArrayList<String>();

        chmave = new Choice();
        hangui = new String();
        Exit = new JButton("Exit");
        te01 = new JLabel("Biển số");
        text01 = new JTextField(100);

        loxe = new JLabel("Loại vé");
        love = new JTextField(100);

        ghichu1 = new String();

        chlve = new Choice();
        chlve.add("Vé tháng");
        chlve.add("Vé ngày");

        chlve.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                love.setText((String) e.getItem());
            }
        });

        lxe = new String();
        bso = new String();
        manv = new String();
        mave = new String();
        id = 0;

        mabai = new String();
        lct = new LocalTimeDemo();
        c = new ConnectTionDB_getTime_cardId();
        ghichu = new JLabel("Ghi chú");
        ghich = new JTextField(100);
        vengay = new String();
        jtable = new JTable();
        sp = new JScrollPane();
        sp.setViewportView(jtable);

        label1 = new JLabel("Biển số");

        label4 = new JLabel("Loại xe");

        label7 = new JLabel("Mã vé xe");

        text1 = new JTextField(100);

        text7 = new JTextField(100);
        button = new JButton("Submit");
        JPanel c1 = new JPanel();
        con2 = new JPanel();
        addluot = new JLabel("Xe tháng");
        add = new JTextField(100);
        mabai = new String();
        giovao = new Time(1233);
        ch = new Choice();
        ch.add("motor");
        ch.add("bike");
        ch.add("car");

        t = new JTextField();
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                t.setText((String) e.getItem());
            }
        });
        Choice ch1 = new Choice();
        ch1.add("motor");
        ch1.add("car");
        ch1.add("bike");
        JLabel la = new JLabel("Loại xe");
        JTextField ha = new JTextField(100);
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                ha.setText((String)e.getItem());
            }
        });

        s = new JButton("Submit");
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (checkCard_id(add.getText())) {

                    getData1();
                    if (testLuongXe(lxe)) {
                        try {

                            String sql;
                            sql = "INSERT INTO guixe(giovao,loaixe ,mave ,mabaixe ,ngaygui,hangui,bienso,manhanvien,Note) VALUES(?,?,?,?,?,?,?,?,?) ";
                            PreparedStatement stmt = null;
                            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
                            stmt.setTime(1, lct.getTimeInSystem());
                            Time t1 = lct.getTimeInSystem();

                            giovao = t1;
                            stmt.setString(2,ha.getText());

                            stmt.setString(3, mave);

                            stmt.setString(6, hangui);

                            stmt.setString(4, mabai);

                            stmt.setString(5, lct.getDateInSystem());

                            stmt.setString(7,text01.getText());

                            stmt.setString(8, manv);

                            stmt.setString(9, ghichu1);

                            stmt.execute();
                            stmt.close();
                            getData();

                            messengerToUser("Cập nhật thành công.");

                        } catch (ClassNotFoundException er) {

                            er.printStackTrace();
                        } catch (SQLException er) {

                            er.printStackTrace();
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }

                    } else {
                        messengerToUser("Nhà xe hết chỗ.");

                    }
                } else {
                    messengerToUser("Mã vé xe không đúng.");
                }

            }
        });

        
        System.out.println(t.getText());
        
        

        c1.setLayout(new MigLayout("", "[][grow]", "[][][]"));
        
        c1.add(addluot, "cell 0 0,alignx trailing");
        c1.add(add, "cell 1 0,growx");
      
        c1.add(la, "cell 0 1,alignx trailing");
        c1.add(ch1, "cell 1 1,growx");
        
        c1.add(te01, "cell 0 2,alignx trailing");
        c1.add(text01, "cell 1 2,growx");
       
        c1.add(s, "cell 2 2,growx");

        this.add(c1, BorderLayout.NORTH);

        con2.setLayout(new MigLayout("", "[][grow]", "[][][]"));

        con2.add(label4, "cell 0 0,alignx trailing");
        con2.add(ch, "cell 1 0,growx");

        con2.add(loxe, "cell 0 1,alignx trailing");
        con2.add(chlve, "cell 1 1,growx");

        con2.add(label7, "cell 0 2,alignx trailing");
        con2.add(text7, "cell 1 2,growx");

        con2.add(label1, "cell 0 3,alignx trailing");
        con2.add(text1, "cell 1 3,growx");

        con2.add(ghichu, "cell 0 4,alignx trailing");
        con2.add(ghich, "cell 1 4,growx");

        con2.add(button, "cell 2 4,growx");
        
        con2.add(Exit, "cell 0 5,alignx trailing");
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainframe f = new mainframe();
                f.setSize(900,600);
                f.setVisible(true);
                dispose();
                
            }
        });
        
        
        

        this.add(con2, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (testLuongXe(t.getText())) {
                        String filename = "Inve.txt";
                        Formatter pri = new Formatter(new File(filename));

                        if (love.getText().equalsIgnoreCase("Vé ngày")) {
                            String sql;
                            sql = "INSERT INTO guixe(giovao ,loaixe ,mave ,mabaixe,ngaygui,hangui,bienso,manhanvien,Note) VALUES(?,?,?,?,?,?,?,?,?) ";
                            PreparedStatement stmt = null;
                            stmt = ConnectionUtil.getConnection().prepareStatement(sql);

                            stmt.setTime(1, lct.getTimeInSystem());
                            Time t1 = lct.getTimeInSystem();
                            giovao = t1;

                            pri.format("%s%s\n", "Giờ vào: ", lct.getTimeInSystem());
                            stmt.setString(2, t.getText());

                            pri.format("%s%s\n", "Loại xe: ", t.getText());
                            stmt.setInt(3, Integer.parseInt(mavengay()));

                            pri.format("%s%s\n", "Mã vé: ", mavengay());
                            stmt.setString(6, lct.hanguixe());

                            pri.format("%s%s\n", "Hạn Gửi: ", lct.hanguixe());
                            stmt.setString(4, mabai);

                            pri.format("%s%s\n", "Mã Bãi: ", mabai);

                            stmt.setString(5, lct.getDateInSystem());

                            pri.format("%s%s\n", "Ngày gửi: ", lct.getDateInSystem());

                            stmt.setString(7, text1.getText());

                            pri.format("%s%s\n", "Biển số: ", text1.getText());
                            stmt.setString(8, "111");

                            pri.format("%s%s\n", "Mã nhân viên: ", "111");
                            stmt.setString(9, ghich.getText());

                            pri.format("%s%s\n", "Ghi chú: ", ghich.getText());

                            stmt.execute();
                            stmt.close();
                            getData();
                            messengerToUser("Cập nhật thành công.");
                        } else {
                            if (checkCard_id(text7.getText())) {
                                String sql;
                                sql = "INSERT INTO guixe(giovao ,loaixe ,mave ,mabaixe,ngaygui,hangui,bienso,manhanvien,Note) VALUES(?,?,?,?,?,?,?,?,?) ";
                                PreparedStatement stmt = null;
                                stmt = ConnectionUtil.getConnection().prepareStatement(sql);

                                stmt.setTime(1, lct.getTimeInSystem());
                                Time t1 = lct.getTimeInSystem();
                                giovao = t1;

                                pri.format("%s%s\n", "Giờ vào: ", lct.getTimeInSystem());
                                stmt.setString(2, t.getText());
                                stmt.setInt(3, Integer.parseInt(text7.getText()));

                                stmt.setString(6, lct.hanguixeThang());
                                stmt.setString(4, mabai);

                                pri.format("%s%s\n", "Mã Bãi: ", mabai);

                                stmt.setString(5, lct.getDateInSystem());

                                pri.format("%s%s\n", "Ngày gửi: ", lct.getDateInSystem());

                                stmt.setString(7, text1.getText());

                                pri.format("%s%s\n", "Biển số: ", text1.getText());
                                stmt.setString(8, "111");

                                pri.format("%s%s\n", "Mã nhân viên: ", "111");
                                stmt.setString(9, ghich.getText());

                                pri.format("%s%s\n", "Ghi chú: ", ghich.getText());

                                stmt.execute();
                                stmt.close();
                                getData();
                                messengerToUser("Cập nhật thành công.");

                            } else {
                                messengerToUser("Mã vé xe không đúng.");
                            }

                        }

                        pri.close();

                    } else {
                        messengerToUser("Nhà xe hết chỗ.");
                    }

                } catch (ClassNotFoundException er) {

                    er.printStackTrace();
                } catch (SQLException er) {

                    er.printStackTrace();
                } catch (ParseException ex) {
                    ex.printStackTrace();

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AddData01.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        this.add(sp, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void messengerToUser(String mess) {
        JOptionPane.showMessageDialog(this, mess);
    }

    private boolean testLuongXe(String loaixe) {
        try {

            String sql = "SELECT guixe.loaixe,baixe.motorslot,baixe.bikeslot,baixe.otoslot,baixe.ma,COUNT(guixe.mave) AS lxe\n" +
"                    FROM guixe RIGHT JOIN baixe ON guixe.mabaixe = baixe.ma\n" +
"                    \n" +
"                    GROUP BY baixe.ma";

            PreparedStatement st = null;
            st = ConnectionUtil.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            boolean kt = false;
            while (rs.next()) {
                String le = rs.getString(1);
                int moto = rs.getInt(2);
                int bike = rs.getInt(3);
                int car = rs.getInt(4);

                String tenbai = rs.getString(5);

                int lxe = rs.getInt(6);
                System.out.println("loaixe: " + le);
                System.out.println("slotmoto " + moto);
                System.out.println("slototo " + car);
                System.out.println("slotbike " + bike);
                System.out.println("mabai: " + tenbai);

                if (loaixe.equalsIgnoreCase("bike")) {
                    if (lxe < bike) {

                        mabai = tenbai;
                        return true;
                    }
                }
                if (loaixe.equalsIgnoreCase("motor")) {
                    if (lxe < moto) {

                        mabai = tenbai;
                        return true;
                    }

                }
                if (loaixe.equalsIgnoreCase("car")) {
                    if (lxe < car) {

                        mabai = tenbai;
                        return true;
                    }
                }

            }
        } catch (ClassNotFoundException ec) {
            ec.printStackTrace();
        } catch (SQLException er) {
            er.printStackTrace();
        }

        return false;

    }

    private void getData1() {
        try {

            String sql;
            sql = "SELECT * FROM guixe WHERE id = ?";

            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String mathe = rs.getString(2);
                if (AddData01.add.getText().equalsIgnoreCase(mathe)) {

                    lxe = rs.getString(4);

                    bso = rs.getString(3);
                    manv = rs.getString(10);

                    mabai1 = rs.getString(9);
                    if(compare2Dates()){
                        hangui = rs.getString(12);
                    }
                    else{
                        hangui = lct.hanguixeThang();
                    }
                    mave = rs.getString(2);
                    ghichu1 = rs.getString(13);

                    break;
                }

            }

            stmt.execute();

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
    }

    protected boolean compare2Dates() {

        try {
            String sql;
            sql = "SELECT ngaylay,hangui FROM guixe WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);

            stmt.setInt(1, id);

            Calendar c1 = Calendar.getInstance();

            Calendar c2 = Calendar.getInstance();

            SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                c1.setTime(rs.getDate(1));
                System.out.println(rs.getDate(1));
                c2.setTime(rs.getDate(2));
                System.out.println(rs.getDate(2));

            }

            if (c1.before(c2)) {

                return true;

            } else if (c1.after(c2)) {
                return false;

            } else if (c1.equals(c2)) {
                return true;

            }
            stmt.execute();
            stmt.close();
        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
        return false;

    }

    public boolean checkCard_id(String text) {
        int s = c.getDataByConnect().size();
        for (int i = 0; i < s; i++) {
            if (text.equalsIgnoreCase(String.valueOf(c.getDataByConnect().get(i).getVexe()))) {
                id = c.getDataByConnect().get(i).getId();
                return true;

            }
        }
        return false;

    }

    public String mavengay() {
        try {
            String sql = "SELECT vexe.mave FROM vexe\n"
                    + "WHERE vexe.loaive = 'vengay' AND vexe.mave NOT IN(\n"
                    + "	SELECT guixe.mave FROM guixe WHERE guixe.giora IS null\n"
                    + ")";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                vengay = String.valueOf(rs.getString(1));
                break;
            }

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
        return vengay;
    }

    public void getData() {
        try {
            String sql = "SELECT*FROM guixe WHERE giovao = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            stmt.setTime(1, giovao);
            System.out.println(giovao);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Giờ vào");
            model.addColumn("loại xe");

            model.addColumn("mã vé xe");
            model.addColumn("ngày hết hạn");
            model.addColumn("mã bãi");
            model.addColumn("ngày gửi");

            model.addColumn("biển số");
            model.addColumn("mã nhân viên");
            model.addColumn("Ghi chú");

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString(5));
                v.add(rs.getString(4));
                v.add(rs.getString(2));
                v.add(rs.getString(12));
                v.add(rs.getString(9));
                v.add(rs.getString(8));
                v.add(rs.getString(3));
                v.add(rs.getString(10));
                v.add(rs.getString(13));

                model.addRow(v);

            }
            jtable.setModel(model);

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }

    }

    public static void main(String[] args) {

        AddData01 add = new AddData01();

    }

}
