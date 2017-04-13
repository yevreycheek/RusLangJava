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
public class Token {
    String text; 
    TokenType type ;
    

    public Token() {
    }

    public Token(String text, TokenType type ) {
        this.text = text;
        this.type = type;
       
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return type + " " + text ;
    }
    
    
}
