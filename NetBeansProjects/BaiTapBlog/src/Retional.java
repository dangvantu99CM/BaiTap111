
public class Retional {

    int tuSo;
    int mauSo;

    public Retional() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public Retional(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static void printRetional(Retional re1) {
        System.out.println("phan so co dang: " + re1.tuSo + " / " + re1.mauSo);
    }

    public static void main(String[] args) {
//        Retional re3 = new Retional(5,45);
//        Retional re = new Retional();
//        re.tuSo = 0;
//        re.mauSo = 1;
//        printRetional(re);
//        Retional re1 = new Retional(0, 0);
//        printRetional(re1);
//        Retional re2 = new Retional(0, 2);
//        printRetional(re2);
//        negate(re2);
//        printRetional(re2);
//        invert(re2);
//        printRetional(re2);
//        System.out.println(toDouble(re2));
//        printRetional(reduce(re3));
        Retional re1 = new Retional(5,45);
        Retional re2 = new Retional(5,45);
       // System.out.println(add(re1,re2).tuSo + " " + add(re1,re2).mauSo);
        printRetional(add(re1,re2));
        
        
    }

    public static void negate(Retional re2) {
        // phuong thuc sua doi 1 doi tuong >> thuong k co gia tri tra ve
        if (re2.mauSo == 0) {
            System.out.println("nhap lai phan so");
        }
        if (re2.tuSo == 0 && re2.mauSo != 0) {
            System.out.println(0);
        } else {
            re2.mauSo *= -1;

        }

    }

    public static void invert(Retional re) {
        if (re.mauSo == 0 || re.tuSo == 0) {
            System.out.println("nhap lai phan so");
        } else {
            int temp = re.tuSo;
            re.tuSo = re.mauSo;
            re.mauSo = temp;
        }
    }

    public static double toDouble(Retional re) {
        // chuyen phan so ve dang double 
        double x = re.tuSo * Math.pow(re.mauSo, -1);
        return x;
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

    public static Retional reduce(Retional re) {
        Retional re1 = new Retional();
        re1.tuSo = re.tuSo / timUcln(re.mauSo, re.tuSo);
        re1.mauSo = re.mauSo / timUcln(re.mauSo, re.tuSo);
        Retional re2 = new Retional(re1.tuSo,re1.mauSo);
        return re2;
    }
    public static Retional  add(Retional re1, Retional re2){
        Retional re = new Retional();
        re.tuSo = re1.tuSo + re2.tuSo;
        re.mauSo = re1.mauSo + re2.mauSo;
        return reduce(re);
    }

}
