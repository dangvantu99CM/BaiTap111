
package checkboxdemo;
import java.awt.*;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class CheckboxDemo extends Applet{

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    private Checkbox bold;
    private Checkbox italic;
    private Checkbox boldItalic;
    private Checkbox plain;
    private CheckboxGroup fontStyle;
    private TextField textfield;
    private Font font,fontBold,fontItalic,fontBoldItalic;
    public void init(){
        textfield = new TextField("Hay xem font chu thay doi khi chon button");
        textfield.setEditable(false);
        fontStyle = new CheckboxGroup();
        bold = new Checkbox("bold",fontStyle, true);
        bold.addItemListener(new ObjectHandl());
        // phai co doi tuong nhan su kien dau vao cua iterface ItemEvent
        italic = new Checkbox("Italic",fontStyle,false);
        italic.addItemListener(new ObjectHandl());
        boldItalic = new Checkbox("boldItalic", fontStyle, false);
        boldItalic.addItemListener(new ObjectHandl());
        add(bold);
        add(italic);
        add(boldItalic);
        add(textfield);
        font = new Font("Serif",Font.PLAIN,15);
        fontBold = new Font("Serif",Font.BOLD,15);
        fontItalic = new Font("Serif",Font.ITALIC,15);
        fontBoldItalic = new Font("Serif",Font.BOLD + Font.ITALIC,15);
        textfield.setFont(font);
     
    }
    class ObjectHandl implements ItemListener {
        
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == plain)
            textfield.setFont(font);
        else if(e.getSource() == bold)
            textfield.setFont(fontBold);
        else if(e.getSource() == italic)
            textfield.setFont(fontItalic);
        else if(e.getSource() == boldItalic)
            textfield.setFont(fontBoldItalic);
    }
    }
    public static void main(String[]args){
        JFrame f = new JFrame();
        f.setTitle("Hay Do &&&££**");
        f.setSize(400,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CheckboxDemo cb = new CheckboxDemo();
        cb.init();
        cb.start();
        f.add(cb,BorderLayout.CENTER);
        f.setVisible(true);
        
    }
    
    
}
