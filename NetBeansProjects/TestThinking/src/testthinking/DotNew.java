/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthinking;

/**
 *
 * @author lenovo i3
 */
public class DotNew {

    public class Inner {

        public void print() {

            System.out.println("This is dot new to creat object from class innner by class outer");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        dni.print();
        
    }
}
