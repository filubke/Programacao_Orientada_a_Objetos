// ===============================
// Trabalho feito pelo Aluno Felipe Schafhauser Lubke RU: 5003159
// Ele foi realizado em 
// ===============================


package cofrinho; // Define que esta classe faz parte do pacote "cofrinho".
import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de entradas do usuário no console.


public class CofrinhoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            // Exibe um menu para o usuário selecionar uma opção
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular Total em Reais");
            System.out.println("5 - Calcular Total por Tipo de Moeda");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 6) break; // Sai do loop se escolher 6

            switch (opcao) {
                case 1:
                    // Exibe um outro menu para selecionar a moeda adicionada e depois pede o valor
                    System.out.print("Escolha a moeda (1-Real, 2-Dólar, 3-Euro, 4-Yen): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    Moeda moeda = switch (tipo) {
                        case 1 -> new Real(valor);
                        case 2 -> new Dolar(valor);
                        case 3 -> new Euro(valor);
                        case 4 -> new Yen(valor);
                        default -> null;
                    };

                    if (moeda != null) { // verifica se deu tudo certo e avisa caso não
                        cofrinho.adicionarMoeda(moeda);
                        System.out.println("Moeda adicionada com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    cofrinho.removerMoeda(); // carrega o método para remover moedas
                    //System.out.println("Remover moeda ainda não foi implementado corretamente!");
                    break;

                case 3:
                    cofrinho.listarMoedas(); // carrega o método para listar moedas
                    break;

                case 4: // carrega o método para converter moedas em reais
                    System.out.println("Total Convertido R$: " + cofrinho.calcularTotalEmReais());
                    break;

                case 5:
                    cofrinho.calcularTotalPorMoeda(); // carrega o método para contar o total de real em moedas
                    break;

                default: // aviso que algo não deu certo
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
