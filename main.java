import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a tarefa: ");
                String tarefa = sc.nextLine();
                tarefas.add(tarefa);
            } 
            else if (opcao == 2) {
                System.out.println("===== TAREFAS =====");
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println(i + " - " + tarefas.get(i));
                }
            } 
            else if (opcao == 3) {
                System.out.print("Digite o número da tarefa: ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index >= 0 && index < tarefas.size()) {
                    tarefas.remove(index);
                } else {
                    System.out.println("Tarefa inválida!");
                }
            }

        } while (opcao != 0);

        sc.close();
    }
}