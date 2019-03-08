/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhGiaTri;

import ktraHopLeDauNgoac.Expression;

/**
 *
 * @author vantu
 */
public class FormulaEval {

    Expression e = new Expression();
    LinkedListStack<String> ls = new LinkedListStack<>();

    public double eval(String formula) {
        double kq = 0.0;
        char[] c = formula.toCharArray();
        int j = 0;
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.toString(c[i]).equals("(")) {
                ls.push(Character.toString(c[i]));
                j = i;
            } else {
                if (ls.stack == null) {
                    return 0.0;
                } else if (Character.toString(c[i]).equals(")")) {
                    String sub1 = formula.substring(j, i);
                    System.out.println(sub1);
                    ls.pop();
                }
            }
        }
        if (ls.stack == null) {
            return kq;
        } else {
            return 0.0;
        }

    }

    public static void main(String[] args) {
        FormulaEval fe = new FormulaEval();
        String formula = "(1 + ((2 + 3) * (4 * 5)))";
        fe.eval(formula);
    }

}
