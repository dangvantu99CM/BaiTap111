
public class Ucln {

    public static void main(String[] args) {
        System.out.println(timUcln(45,130) + " Bcnn " + (45*130)/timUcln(45,130));
    }

    public static int timUcln(int a, int b) {
        if (a == 0 || b == 0) {
            return -1;
        } else {
            if (a == b) {
                return a;
            } else {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
                return timUcln(a, b);
            }
        }
    }
    
}
