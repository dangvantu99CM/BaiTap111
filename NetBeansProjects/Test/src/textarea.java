
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author vantuPro
 */
public class textarea extends JFrame{
    private JTextArea textarea;
    private JScrollPane sp;
    
    public textarea(){
        this.setLayout(new BorderLayout());
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        textarea = new JTextArea(
                
        );
        for(int i = 0; i < 1000; i++){
            textarea.append("Hello" + "\n");
        }
        //textarea.setEditable(false);
        sp = new JScrollPane(textarea);
        
        this.add(sp,BorderLayout.CENTER);
        
        
    }
    public static void main(String []args){
        textarea t = new textarea();
        t.setVisible(true);
    }
}
