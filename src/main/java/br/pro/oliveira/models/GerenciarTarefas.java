package br.pro.oliveira.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class GerenciarTarefas {
    public List<Tarefa> tarefas = new ArrayList<Tarefa>();
    private int pontos = 0;
    private int tarefasConcluidasNoDia = 0;
    private LocalDate ultimaData = null;

    public boolean adicionarTarefa(Tarefa tarefa) {

        if(tarefa != null){
            tarefas.add(tarefa);
            return true;
        } else {
            return false;
        }
    }

    public List<Tarefa> exibirTarefas() {

        return new ArrayList<>(tarefas);
    }

    public Tarefa verDetalhesTarefa(int indice) {
        Tarefa tarefa = tarefas.get(indice - 1);

        return tarefa;
    }

    public void marcarTarefaConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            tarefa.setConcluida(true);
            pontos++;
            LocalDate dataAtual = LocalDate.now();
            if (ultimaData == null || !dataAtual.equals(ultimaData)) {

                tarefasConcluidasNoDia = 0;
            }

            tarefasConcluidasNoDia++;
            ultimaData = dataAtual;

            // Aplica regras de gamificação
            if (tarefasConcluidasNoDia >= 3) {
                pontos++;
            }

            if (tarefasConcluidasNoDia >= 5) {
                pontos += 2;
            }
        } else {
            System.out.println("Índice inválido. Tarefa não encontrada.");
        }
    }

    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
