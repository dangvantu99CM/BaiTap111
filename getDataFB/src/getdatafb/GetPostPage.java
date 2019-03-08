package getdatafb;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Comment;
import com.restfb.types.Group;
import com.restfb.types.Page;
import com.restfb.types.Post;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalScrollBarUI;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author DangVanTu
 */
public class GetPostPage extends JFrame {

    private JTextField setUrl, setId;

    private JLabel url;

    private JButton ok, setText;
    private JTextArea textarea;
    private JScrollPane sp;

    private final static String newline = "\n";

    public void setFrame() {

        GetPostPage gp = new GetPostPage();
        gp.setSize(500, 500);
        gp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gp.setLayout(new BorderLayout());
        url = new JLabel("URL");

        ok = new JButton("OK");

        setId = new JTextField(100);
        setUrl = new JTextField(100);
        textarea = new JTextArea();
        setText = new JButton("Reset");
        setText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textarea.setText(null);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url1 = setUrl.getText();
                String cutString = url1.substring(25);
                String s2 = cutString.substring(0, 6);
                String s4 = url1.substring(40);
                String s = "groups";
                String s5 = url1.substring(25, 32);

                if (s2.equalsIgnoreCase("groups")) {
                    String s3 = cutString.substring(7, 22);
                    setId.setText(s3);

                    try {
                        getData();

                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();

                    }
                } else if (s5.equalsIgnoreCase("profile")) {
                    setId.setText(s4);
                    try {
                        getData();

                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();

                    }

                } else {

                    setId.setText(cutString);
                    try {
                        getData();

                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();

                    }

                }

            }
        });
        sp = new JScrollPane(textarea);
        //textarea.setEditable(false);

        JPanel p = new JPanel();

        p.setLayout(new MigLayout("", "[][grow]", "[][][]"));

        p.add(setUrl, "cell 1 0,growx");

        p.add(url, "cell 0 0,alignx trailing");

        p.add(ok, "cell 2 0,growx");

        p.add(setText, "cell 2 1,growx");

        gp.add(p, BorderLayout.NORTH);
        gp.add(sp, BorderLayout.CENTER);

        gp.setVisible(true);

    }

    public void getData() throws FileNotFoundException {

        FacebookClient fbclient = new DefaultFacebookClient("EAAAAAYsX7TsBAI2hSj9JDHIXCe8VPrKgRz0ziO6Q79nZBMOfkTpZAOByzFYHzgGT8NgvaLXlM7fhdIaZBwwYkmySUmnYZCNyz8tr9sFZCB90yosO2TbPAOl3w5GPXqw82T8VBPA2oVf1ejbIraB4ZB1SB5pj8mKLp4GhHklBQVVwZDZD");
        Page page = fbclient.fetchObject(setId.getText(), Page.class);

        Connection<Post> post = fbclient.fetchConnection(setId.getText() + "/feed", Post.class);
        Formatter printToFile = new Formatter(new File("post&comment1.txt"));

        for (List<Post> postPage : post) {
            for (Post apost : postPage) {

                String s1 = "Post Name " + apost.getFrom().getName();
                textarea.append(s1 + newline);

                String s2 = "Message of Post : " + apost.getMessage();
                textarea.append(s2 + newline);

                Connection<Comment> ResultComment = fbclient.fetchConnection(apost.getId() + "/comments", Comment.class);
                List<Comment> listComment = ResultComment.getData();

                String s3 = "Comments of post: ";
                textarea.append(s3 + newline);
                String s4 = "";
                for (Comment lc : listComment) {
                    // out.println(lc.getFrom().getName() + ": " + lc.getMessage());

                    s4 += lc.getFrom().getName() + ": " + lc.getMessage() + "\n";

                }
                out.println(s4);
                textarea.append(s4 + newline);

                String s5 = "fb.com/" + apost.getId();
                textarea.append(s5 + newline);

            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        GetPostPage g = new GetPostPage();
        g.setFrame();

    }

}
