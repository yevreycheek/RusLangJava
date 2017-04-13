/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author Алексей
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите выражение на языке WORLD : ");
    String input = null;
    try {
        input = reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
        
        
        
        
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens){
            System.out.println(token);
        }
        
    }
    
}
