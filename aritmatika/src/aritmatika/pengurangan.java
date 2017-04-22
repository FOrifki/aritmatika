/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author FO
 */
public class pengurangan extends Number implements Operation{

    @Override
    public float operate(int x, int y) {
        return x-y;
    }

    @Override
    public void display() {
        System.out.println("Hasil pengurangan = " + operate(x, y));
    }
    
    
}
