
package gamepicachu;

import java.awt.BorderLayout;
import java.awt.Choice;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Vantupro
 */
public class FrameGame extends JFrame  {
   private Choice list;
   private JPanel contentPane;
   private JLabel background;
   
   public FrameGame(){
       this.setSize(500,500); 
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       background = new JLabel();
       background.setIcon(new ImageIcon("F:\\Documents\\LTHDT\\BaiTapCk\\Iconlogin\\pcg.png"));
       this.add(background);
       this.setVisible(true);
       
   }
   public static void main(String []args){
       FrameGame f = new FrameGame();
       
   }
   
}
