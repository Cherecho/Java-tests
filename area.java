/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Campus FP
 */
public class area {
    public static void main(String[] args) {
        float base;
        float height = 0;
        float area = 0;
        
        
        String shape;
        
        
        base = Float.parseFloat(JOptionPane.showInputDialog("What's the base of your "+shape+"? (in cm)"));
        if("square".equals(shape) || "rhombus".equals(shape)){
        } else {
            height = Float.parseFloat(JOptionPane.showInputDialog("What's the height of your "+ shape + "? (in cm)"));
        }
        switch (shape) {
            case "rectangle":
                area = rectangle(base,height);
                showResult(shape,area);
                break;
            case "triangle":
                area = triangle(base,height);
                showResult(shape,area);
                break;
            case "square":
                area = square(base);
                showResult(shape,area);
                break;
            case "rhombus":
                area = rhombus(base);
                showResult(shape,area);
                break;
            case "all":
                showResultall(base,height);
                break;
            default:
                break;
        }
    }
    public static float rectangle(float base, float height){
        float area;
        area = base*height;
        return area;
    };
    public static float triangle(float base, float height){
        float area;
        area = (base*height)/2;
        return area;
    };
    public static float square(float base){
        float area;
        area = base*base;
        return area;
    };
    public static float rhombus(float base){
        float area;
        area = (base*base)/2;
        return area;
    };
    public static void showResult(String shape, float area){
        String result;
        result = "El area de su " + shape + " es de: " + area +"cm^2";
        JOptionPane.showMessageDialog(null,result);
    };
    public static void showResultall(float base, float height){
        String result;
        float b = base;        
        float h = height;
        result = "AREAS \n -------------\n RECTANGLE: " + rectangle(b,h)+"cm^2\n TRIANGLE: " + triangle(b,h) + "cm^2\n SQUARE: " + square(b) + "cm^2\n RHOMBUS: " + rhombus(b) + "cm^2";
        JOptionPane.showMessageDialog(null,result);
    };
}
