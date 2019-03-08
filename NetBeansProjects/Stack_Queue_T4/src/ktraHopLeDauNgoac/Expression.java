package ktraHopLeDauNgoac;

/**
 *
 * @author vantu
 */
public class Expression {

    private LinkedListStack<String> lstack = new LinkedListStack<>();

    public boolean isValidExpr(String expr) {

        char[] ch = expr.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.toString(ch[i]).equals("(")) {
                lstack.push(Character.toString(ch[i]));
            }
            if (Character.toString(ch[i]).equals(")")) {
                if (lstack.stack == null) {
                    return false;
                } else {
                    lstack.pop();
                }
            }
        }

        if (lstack.stack == null) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Expression expr = new Expression();
        String f = "a+b)-c(a+3)(";
        char[] ch = f.toCharArray();

        System.out.println(expr.isValidExpr(f));

    }

}
