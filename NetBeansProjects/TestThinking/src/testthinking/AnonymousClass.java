package testthinking;

/**
 *
 * @author vantu
 */
interface Contents {

    public abstract void print();
}

public class AnonymousClass {

    public Contents contents() {
        return new Contents() { // Insert a class definition 
            private int i = 11;

            public int value() {
                return i;
            }

            public void printString(String s) {
                System.out.println(s);
            }

            public void print() {
                System.out.println("AnonymousClass");
            }
        };
    }

    class Contents {

        private int i;

        public Contents() {
            i = 10;
        }

        public void printString(String s) {
            System.out.println("hihi");

        }

    }

    protected Contents contents1() {
        return new Contents();
    }

    public static void main(String[] args) {
        AnonymousClass p = new AnonymousClass();
        Contents c = p.contents();

        c.printString("AnonymousClass");
    }
}
