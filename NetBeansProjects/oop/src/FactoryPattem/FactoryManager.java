/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattem;

/**
 *
 * @author lenovo i3
 */
public class FactoryManager {
    public Shapes duyet(String s){
        if(s.equals("Circle")) return new Circle();
        if(s.equals("Retangle")) return new Retangle();
        if(s.equals("Square")) return new Square();
        return null;       
    }
}

