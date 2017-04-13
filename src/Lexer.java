/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Алексей
 */
public class Lexer {
    private static final String OPERATOR_CHARS = "+-*/=";
    private static final TokenType[] OPERATOR_TOKENS = {
        TokenType.ПЛЮС, TokenType.МИНУС,TokenType.УМНОЖИТЬ,TokenType.РАЗДЕЛИТЬ,TokenType.РАВНО
    };
   final String input;
   List<Token> tokens;
   private int pos;
   private final int length;

    public Lexer(String input ) {
        this.input = input;
        length= input.length();
        tokens = new ArrayList<>();
    }
    
    public List<Token> tokenize(){
        while(pos<length){
            final char current = peek(0);
            if (Character.isDigit(current)){
                tokenizeNumber();
            }
            else if (OPERATOR_CHARS.indexOf(current) !=-1){
                tokenizeOperator();
            }else{next();  } // пробелы 
        
        }
        return tokens;
    }
    
    private void addToken(TokenType type){
        addToken(type,"");
    }

     
     private char peek(int relativePosition){
         final int position = pos + relativePosition;
         if (position >= length) return '\0';
         return input.charAt(position);
     }
          private char next(){
            pos++;
         
         return peek(0);
     }

    private void tokenizeNumber() {
        final StringBuilder buffer = new StringBuilder();
       char current = peek(0);
       while(Character.isDigit(current)){
           buffer.append(current);
           current = next();
       }
       addToken(TokenType.ЧИСЛО, buffer.toString());
    }

    private void tokenizeOperator() {
        final int position = OPERATOR_CHARS.indexOf(peek(0));
        addToken(OPERATOR_TOKENS[position]);
        next();
    }
         private void addToken(TokenType type,String text){
            tokens.add(new Token(text,type));
    }
    
}
