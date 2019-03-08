package GuiXeDeveloper;

import ConnectionDb.ConnectionUtil;
import XuLyNgoai.Dialog;
import XuLyNgoai.LocalTimeDemo;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import login.mainframe;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author DangVanTu
 */
public class layxe extends JDialog implements Dialog {

    private JButton submit,e;
    private JLabel tong, maxe;
    private JTextField maxein, tongtien;
    private JPanel con1, c2;
    private JTable jtable;
    private JScrollPane sp;
    private String id, lxe, lve;
    private LocalTimeDemo lct;
    

    public layxe() {

        this.setBounds(200, 200, 380, 250);
        this.setTitle("Lấy xe.");

        this.setSize(900, 270);
        this.setLayout(new BorderLayout());
        setModal(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        maxe = new JLabel("Mã xe");
        maxein = new JTextField(100);
        con1 = new JPanel();
        submit = new JButton("Submit");
        sp = new JScrollPane();
        jtable = new JTable();
        id = new String();
        lct = new LocalTimeDemo();
        lxe = new String();
        lve = new String();

        tong = new JLabel("Tổng tiền");
        tongtien = new JTextField(100);
        c2 = new JPanel();
        e = new JButton("Exit");
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainframe f = new mainframe();
                f.setSize(900,600);
                f.setVisible(true);
                dispose();
                
            }
        });

        con1.setLayout(new MigLayout("", "[][grow]", "[][][]"));
        con1.add(maxe, "cell 0 0,alignx trailing");
        con1.add(maxein, "cell 1 0,growx");
        con1.add(submit, "cell 2 0,growx");

        c2.setLayout(new MigLayout("", "[][grow]", "[][][]"));
        c2.add(tong, "cell 0 0,alignx trailing");
        c2.add(tongtien, "cell 1 0,growx");
        
        c2.add(e, "cell 0 1,alignx trailing");

        sp.setViewportView(jtable);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkID()) {
                    try {
                        setTimeOut();
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        setDateOut();
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                    setPrice();
                    getData();
                } else {
                    messengerToUser("Mã vé xe sai.");
                }
            }
        });

        this.add(con1, BorderLayout.NORTH);
        this.add(c2, BorderLayout.SOUTH);
        this.add(sp, BorderLayout.CENTER);

    }

    public boolean checkID() {
        try {

            String sql = "SELECT guixe.mave,guixe.id,guixe.loaixe,vexe.loaive FROM guixe INNER JOIN vexe ON vexe.mave = guixe.mave WHERE giora IS null";
            PreparedStatement st = null;
            st = ConnectionUtil.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                if (maxein.getText().equalsIgnoreCase(rs.getString(1))) {
                    id = rs.getString(2);
                    lxe = rs.getString(3);
                    lve = rs.getString(4);
                    return true;
                }
            }
        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
        return false;

    }

    public void getData() {
        try {
            String sql = "SELECT giovao,loaixe,giora,manhanvien,guixe.mave,mabaixe,ngaygui,ngaylay,hangui,bienso,guixe.Note,vexe.loaive\n"
                    + "FROM guixe INNER JOIN vexe ON vexe.mave = guixe.mave WHERE guixe.id = ?";
            PreparedStatement st = null;
            st = ConnectionUtil.getConnection().prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            jtable.removeAll();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Giờ vào");
            model.addColumn("loại xe");
            model.addColumn("giờ ra");
            model.addColumn("mã nhân viên");
            model.addColumn("mã vé");
            model.addColumn("mã bãi");
            model.addColumn("ngày gửi");
            model.addColumn("ngày lấy");
            model.addColumn("ngày hết hạn");
            model.addColumn("biển số");
            model.addColumn("Ghi chú");
            model.addColumn("Loại vé");

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));

                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12));

                model.addRow(v);

            }
            jtable.setModel(model);

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }

    }

    private void setTimeOut() throws ParseException {
        try {

            String sql;
            sql = "UPDATE guixe SET giora = ? WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            stmt.setTime(1, lct.getTimeInSystem());
            stmt.setString(2, id);
            stmt.execute();
            stmt.close();

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }

    }

    private void setDateOut() throws ParseException {
        try {
            String sql1;
            sql1 = "UPDATE guixe SET ngaylay = ? WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql1);
            stmt.setString(1, lct.getDateInSystem());
            stmt.setString(2, id);
            stmt.execute();
            stmt.close();

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
    }

    protected long lay_han() {
        long t3 = 0;
        try {
            String sql;
            sql = "SELECT ngaylay,hangui FROM guixe WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            Calendar c1 = Calendar.getInstance();

            Calendar c2 = Calendar.getInstance();
            System.out.println("Days Between " + c1.getTime() + " and " + c2.getTime() + " is");
            while (rs.next()) {
                c1.setTime(rs.getDate(1));
                c2.setTime(rs.getDate(2));
                long t1 = c2.getTime().getTime();
                long t2 = c1.getTime().getTime();
                t3 = (t1 - t2) / (24 * 3600 * 1000);
                System.out.println(t3);
            }
            stmt.execute();
            stmt.close();

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
        return t3;
    }

    protected void setPrice() {
        try {

            String sql1;
            sql1 = "UPDATE guixe SET price = ? WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql1);
            stmt.setString(1, String.valueOf(tienngaythuong()));
            stmt.setString(2, id);

            if (lve.equalsIgnoreCase("vengay")) {
                double t1 = 0.0;
                if (compare2Dates() == true) {
                    if (lxe.equalsIgnoreCase("bike")) {
                        t1 = 2000;
                        tongtien.setText(String.valueOf(t1));
                    } else if (lxe.equalsIgnoreCase("motor")) {
                        t1 = 5000;
                        tongtien.setText(String.valueOf(t1));
                    } else {
                        t1 = 10000;
                        tongtien.setText(String.valueOf(t1));
                    }
                } else {
                    if (lxe.equals("bike")) {

                        t1 = 2000 * gui_lay() + (-1) * lay_han() * 5000;
                        tongtien.setText(String.valueOf(t1));

                    } else if (lxe.equals("motor")) {

                        t1 = 5000 * gui_lay() + (-1) * lay_han() * 20000;
                        tongtien.setText(String.valueOf(t1));

                    } else {

                        t1 = 10000 * gui_lay() + (-1) * lay_han() * 50000;
                        tongtien.setText(String.valueOf(t1));
                    }
                }

            } else {
                double t = 0.0;
                if (compare2Dates() == true) {
                    tongtien.setText("0.0");
                } else {
                    if (lxe.equals("bike")) {

                        t = (-1) * lay_han() * 5000;
                        tongtien.setText(String.valueOf(t));

                    } else if (lxe.equals("motor")) {

                        t = (-1) * lay_han() * 20000;
                        tongtien.setText(String.valueOf(t));

                    }

                    t = (-1) * lay_han() * 50000;
                    tongtien.setText(String.valueOf(t));

                }
            }

            stmt.execute();
            stmt.close();

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }

    }

    protected long gui_lay() {
        long t3 = 0;
        try {
            String sql;
            sql = "SELECT ngaygui,ngaylay FROM guixe WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);

            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            Calendar c1 = Calendar.getInstance();

            Calendar c2 = Calendar.getInstance();
            System.out.println("Days Between " + c1.getTime() + " and " + c2.getTime() + " is");
            while (rs.next()) {
                c1.setTime(rs.getDate(1));
                c2.setTime(rs.getDate(2));
                long t1 = c2.getTime().getTime();
                long t2 = c1.getTime().getTime();
                t3 = (t1 - t2) / (24 * 3600 * 1000);
                System.out.println(t3);
            }
            stmt.execute();
            stmt.close();

        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
        return t3;
    }

    protected boolean compare2Dates() {

        try {
            String sql;
            sql = "SELECT ngaylay,hangui FROM guixe WHERE id = ?";
            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);

            stmt.setString(1, id);

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

    private double tienngaythuong() {
        double t = 0.0;
        if (lve.equalsIgnoreCase("vengay")) {
            if (compare2Dates() == true) {
                if (lxe.equalsIgnoreCase("bike")) {
                    return t = 2000;
                } else if (lxe.equalsIgnoreCase("motor")) {
                    return t = 5000;
                } else {
                    return t = 10000;
                }
            } else {
                if (lxe.equals("bike")) {
                    messengerToUser("xe đã quá hạn " + (-1) * lay_han() + " ngày.");
                    return t = 2000 * gui_lay() + (-1) * lay_han() * 5000;
                } else if (lxe.equals("motor")) {
                    messengerToUser("xe đã quá hạn " + (-1) * lay_han() + " ngày.");
                    return t = 5000 * gui_lay() + (-1) * lay_han() * 20000;
                }
                messengerToUser("xe đã quá hạn " + (-1) * lay_han() + " ngày");
                return t = 10000 * gui_lay() + (-1) * lay_han() * 50000;
            }
        } else {

            if (compare2Dates() == true) {
                if (lxe.equalsIgnoreCase("bike")) {
                    return t = 50000;
                } else if (lxe.equalsIgnoreCase("motor")) {
                    return t = 50000;
                } else {
                    return t = 50000;
                }
            } else {
                if (lxe.equals("bike")) {
                    messengerToUser("xe đã quá hạn " + (-1) * lay_han() + " ngày.");
                    return t = 50000 + (-1) * lay_han() * 5000;
                } else if (lxe.equals("motor")) {
                    messengerToUser("xe đã quá hạn " + (-1) * lay_han() + " ngày.");
                    return t = 50000 + (-1) * lay_han() * 20000;
                }
                messengerToUser("xe đã quá hạn " + (-1) * lay_han() + " ngày");
                return t = 50000 + (-1) * lay_han() * 50000;
            }

        }
    }

    public void messengerToUser(String mess) {
        JOptionPane.showMessageDialog(this, mess);
    }

    public static void main(String[] args) {
        layxe l = new layxe();
        l.setVisible(true);
    }

}
