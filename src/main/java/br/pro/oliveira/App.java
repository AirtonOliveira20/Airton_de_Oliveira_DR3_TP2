package br.pro.oliveira;
import br.pro.oliveira.models.GerenciarTarefas;
import br.pro.oliveira.models.Tarefa;

import java.text.ParseException;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        GerenciarTarefas gerenciador = new GerenciarTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Visualizar Tarefas");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Ver Detalhes de Tarefa");
            System.out.println("4. Marcar Tarefa como Concluída");
            System.out.println("5. Exibir pontos:");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println(gerenciador.exibirTarefas());
                    break;
                case 2:
                    System.out.println("1. Digite o titulo: ");
                    String titulo = scanner.nextLine();

                    System.out.println("2. Digite a descrição:");
                    String descricao = scanner.nextLine();

                    System.out.println("3. Digite a data de criação(yyyy-MM-dd): ");
                    String dataCriacaoStr  = scanner.nextLine();
                    //LocalDate dataCriacao = LocalDate.parse(dataCriacaoStr);


                    System.out.println("4. Digite a data de conclusão(yyyy-MM-dd)");
                    String dataConclusaoStr  = scanner.nextLine();
                    //LocalDate dataConclusao = LocalDate.parse(dataConclusaoStr);

                    Tarefa tarefa = new Tarefa(titulo, descricao, dataCriacaoStr, dataConclusaoStr);


                    gerenciador.adicionarTarefa(tarefa);
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa: ");
                    int indiceDetalhes = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(gerenciador.verDetalhesTarefa(indiceDetalhes));
                    break;
                case 4:
                    System.out.print("Digite o número da tarefa: ");
                    int indiceConcluida = scanner.nextInt();
                    scanner.nextLine();
                    gerenciador.marcarTarefaConcluida(indiceConcluida);
                    break;

                case 5:
                    System.out.println("Pontos do usuário: " + gerenciador.getPontos());
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();

    }


}