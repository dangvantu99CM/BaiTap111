
package testthinking;

/**
 *
 * @author vantuPro
 */
public class dotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {

        public dotThis outer() {
            return dotThis.this;
// A plain "this" would be Inner’s "this" 
        }
        public void print(){
            System.out.println("Success");
        }
    }
// truy cap thong qua cac doi tuong lop ngoai vao lop trong
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        dotThis dt = new dotThis();
        dotThis.Inner dti = dt.inner();
        
        dti.outer().f();
    }

}
