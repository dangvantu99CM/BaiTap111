
package mvc_go;

public class Testter {
    public static void main(String[] args){
        Model m = new Model();
        Veiw v = new Veiw();
        Controller c =  new Controller(m, v);
    }
}
