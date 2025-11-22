/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3and4;
import java.util.Stack;
import javax.swing.JOptionPane;
/**
 *
 * @author luizf
 */
public class Exercicio3 {

    public static boolean Palindromo(String texto) {
        
        String limpa = texto.replaceAll("[^a-zA-Z]", "").toUpperCase();

        
        Stack<Character> pilha = new Stack<>();

        
        for (int i = 0; i < limpa.length(); i++) {
            pilha.push(limpa.charAt(i));
        }

        
        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertida.append(pilha.pop());
        }

        
        return limpa.equals(invertida.toString());
    }

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Escreva uma palavra:");
        

        JOptionPane.showMessageDialog(null,palavra + " -> " + (Palindromo(palavra) ? "É palíndromo" : "Não é palíndromo"));
        
    }
}


