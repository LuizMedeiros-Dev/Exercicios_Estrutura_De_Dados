/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3and4;

/**
 *
 * @author luizf
 */
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        Fila fila = new Fila();
        int opcao = -1;

        while (opcao != 0) {
            String menu = """
                    ===== MENU DA FILA =====
                    1 - Enfileirar (inserir número)
                    2 - Desenfileirar (remover número)
                    3 - Mostrar fila
                    0 - Sair
                    """;

            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opcao) {
                    case 1 -> {
                        String entrada = JOptionPane.showInputDialog("Digite o número que deseja enfileirar:");
                        int valor = Integer.parseInt(entrada);
                        fila.enfileirar(valor);
                        JOptionPane.showMessageDialog(null, "Número " + valor + " enfileirado com sucesso!");
                    }

                    case 2 -> {
                        if (fila.estaVazia()) {
                            JOptionPane.showMessageDialog(null, "A fila está vazia! Nada para desenfileirar.");
                        } else {
                            int removido = fila.desenfileirar();
                            JOptionPane.showMessageDialog(null, "Número removido: " + removido);
                        }
                    }

                    case 3 -> JOptionPane.showMessageDialog(null, fila.mostrarFila());

                    case 0 -> {
                        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                        if (confirmar == JOptionPane.NO_OPTION) {
                            opcao = -1; // volta ao menu
                        } else {
                            JOptionPane.showMessageDialog(null, "Encerrando o programa... Até logo!");
                        }
                    }

                    default -> JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número válido.");
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}



