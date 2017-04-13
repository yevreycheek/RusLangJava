/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langcode;

/**
 *
 * @author Алексей
 */
public class NumberExpression implements Expression {
        private final double value ;
        
        

    public NumberExpression(double value) {
        this.value = value;
    }
        
    @Override
    public double eval() {
       return value;
    }
    
}
