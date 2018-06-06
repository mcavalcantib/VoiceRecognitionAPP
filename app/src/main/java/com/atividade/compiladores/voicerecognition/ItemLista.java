package com.atividade.compiladores.voicerecognition;

public class ItemLista {
    private String nome;
    private int quantidade;
    private boolean marcado;
    //Constructor

    public ItemLista(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    //Getters, setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }
}
