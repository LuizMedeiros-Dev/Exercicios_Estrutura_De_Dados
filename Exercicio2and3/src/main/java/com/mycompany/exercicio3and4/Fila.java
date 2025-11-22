/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3and4;

/**
 *
 * @author luizf
 */
public class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(int valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public int desenfileirar() {
        if (inicio == null) {
            throw new IllegalStateException("A fila está vazia!");
        }
        int valor = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public String mostrarFila() {
        if (estaVazia()) {
            return "A fila está vazia.";
        }
        StringBuilder sb = new StringBuilder("Fila: ");
        No atual = inicio;
        while (atual != null) {
            sb.append(atual.dado).append(" ");
            atual = atual.proximo;
        }
        return sb.toString();
    }
}

