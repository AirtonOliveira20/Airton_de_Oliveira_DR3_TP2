package br.pro.oliveira.models;

import java.time.LocalDate;

public class Tarefa {

    public int id;
    public String titulo;
    public String descricao;

    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
  //  public String dataCriacao;
   // public String dataConclusao;
    public boolean concluida;



    public Tarefa(String titulo, String descricao, String dataCriacao, String dataConclusao) {
        this.titulo = titulo;
        this.descricao =  descricao;
        this.dataCriacao = LocalDate.parse(dataCriacao);
        this.dataConclusao = LocalDate.parse(dataConclusao);
        this.concluida = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
       // String estadoConclusao = concluida ? "Concluída" : "Não concluída";
        return "Título: " + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Data de Criação: " + dataCriacao + "\n" +
                "Data de Conclusão: " +dataConclusao + "\n";
    }




}
