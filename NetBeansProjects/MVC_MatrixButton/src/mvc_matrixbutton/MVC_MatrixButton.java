
/**
 *
 * @author CMZAU
 */
package mvc_matrixbutton;

public class MVC_MatrixButton {

    public static void main(String[] args) {
       Veiw v = new Veiw();
       Model m = new Model(v.getMatrix());
       Controller c = new Controller(v, m);
       v.setVisible(true);
    }
    
}
