package br.pro.oliveira.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class GerenciarTarefasTest {

    GerenciarTarefas gerenciar = new GerenciarTarefas();
    List<Tarefa> tarefas = new ArrayList<>();

    @Test
    @DisplayName("Deve retornar a tarefa adicionada")
     void exibirTarefas() {

        Tarefa tarefa1 = new Tarefa("Limpar a casa", "Limpar o quarto e a sala", "2024-03-17", "2024-03-17");
        Tarefa tarefa2 = new Tarefa("Limpar o computador", "teste", "2024-03-17", "2024-03-17");

        gerenciar.adicionarTarefa(tarefa1);
        gerenciar.adicionarTarefa(tarefa2);

        tarefas = gerenciar.exibirTarefas();

        assertTrue(tarefas.contains(tarefa1));
    }

    @Test
    @DisplayName("Deve retornar tarefa específica")
    void verDetalhesTarefa() {
        Tarefa tarefa1 = new Tarefa("Limpar a casa", "Limpar o quarto e a sala", "2024-03-17", "2024-03-17");
        Tarefa tarefa2 = new Tarefa("Limpar o computador", "teste", "2024-03-17", "2024-03-17");

        gerenciar.adicionarTarefa(tarefa1);
        gerenciar.adicionarTarefa(tarefa2);

       Tarefa tarefa = gerenciar.verDetalhesTarefa(1);

        assertEquals(tarefa1, tarefa);


    }

    @Test
    @DisplayName("Deve inserir tarefa")
    void adicionarTarefa(){

        Tarefa tarefa1 = new Tarefa("Limpar a casa", "Limpar o quarto e a sala", "2024-03-17", "2024-03-17");
        Tarefa tarefa2 = new Tarefa("Limpar o computador", "teste", "2024-03-17", "2024-03-17");


        assertTrue(gerenciar.adicionarTarefa(tarefa1));
        assertTrue(gerenciar.adicionarTarefa(tarefa2));

    }

    @Test
    @DisplayName("Alterando status de conclusão da tarefa e verificando retorno dos pontos")
    void marcarTarefaConcluida(){
        Tarefa tarefa1 = new Tarefa("Limpar a casa", "Limpar o quarto e a sala", "2024-03-17", "2024-03-17");
        Tarefa tarefa2 = new Tarefa("Limpar o computador", "teste2", "2024-03-17", "2024-03-17");
        Tarefa tarefa3 = new Tarefa("Limpar o carro", "teste3", "2024-03-17", "2024-03-17");

        gerenciar.adicionarTarefa(tarefa1);
        gerenciar.adicionarTarefa(tarefa2);
        gerenciar.adicionarTarefa(tarefa3);

        gerenciar.marcarTarefaConcluida(0);

       assertTrue(tarefa1.getConcluida());
       assertEquals(1, gerenciar.getPontos());

    }

}
