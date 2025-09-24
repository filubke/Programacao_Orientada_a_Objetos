package cofrinho; // Define que esta classe faz parte do pacote "cofrinho".

import java.util.ArrayList; // Importa a classe ArrayList para armazenar a lista de moedas no cofrinho.
import java.util.HashMap;  // Importa a classe HashMap para armazenar e calcular o total por tipo de moeda.
import java.util.Map;      // Importa a interface Map, utilizada para manipular os dados do HashMap.
import java.util.Scanner;  // Importa a classe Scanner para ler entradas do usuário no console.


class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>(); // Lista onde as moedas são armazenadas

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda() {
        if (moedas.isEmpty()) { // Verifica se o cofrinho está vazio
            System.out.println("O cofrinho está vazio! Não há moedas para remover.");
            return;
        }

        System.out.println("Escolha uma moeda para remover:");
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println((i + 1) + " - " + moedas.get(i)); // Mostra a lista com índices
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da moeda que deseja remover: ");

        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > moedas.size()) {
            System.out.println("Opção inválida! Nenhuma moeda removida.");
            return;
        }

        Moeda removida = moedas.remove(escolha - 1); // Remove a moeda selecionada
        System.out.println("Moeda removida com sucesso: " + removida);
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) { // Verifica se o cofrinho está vazio
            System.out.println("O cofrinho está vazio!");
        } else {
            System.out.println("Lista de moedas:");
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }

    public double calcularTotalEmReais() {
        if (moedas.isEmpty()) { // Verifica se o cofrinho está vazio
            System.out.println("O cofrinho está vazio!");
            return 0.0; // Retorna 0 caso o cofrinho esteja vazio
        } else {
            double total = 0;
            for (Moeda moeda : moedas) {
                total += moeda.converterParaReal();
            }
            return total;

            }
    }


    public void calcularTotalPorMoeda() {
        if (moedas.isEmpty()) { // Verifica se o cofrinho está vazio
            System.out.println("O cofrinho está vazio!");
            return;
        }

        Map<String, Double> totalPorMoeda = new HashMap<>();

        for (Moeda moeda : moedas) { // Um laço de repetição para calcular o total por moeda
            String tipoMoeda = moeda.getClass().getSimpleName();
            totalPorMoeda.put(tipoMoeda, totalPorMoeda.getOrDefault(tipoMoeda, 0.0) + moeda.getValor());
        }

        System.out.println("Total por tipo de moeda:");
        for (Map.Entry<String, Double> entry : totalPorMoeda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }



}
