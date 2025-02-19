package Tarefas_colecoes;

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa_colecoes {

    // Primeira parte: Ordenação de nomes
    public static void ordenarNomes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos nomes você deseja digitar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer de entrada

        String[] nomes = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibindo os nomes ordenados
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // Segunda parte: Separação de nomes e sexos com split
    public static void separarNomesSexo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQuantas pessoas você deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer de entrada

        String[] nomes = new String[quantidade];
        String[] sexos = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome e o sexo da pessoa " + (i + 1) + " (formato: nome sexo): ");
            String entrada = scanner.nextLine();

            // Usando o split para separar nome e sexo
            String[] dados = entrada.split(" ");  // Split baseado no espaço

            // Verificando se a entrada contém o nome e o sexo
            if (dados.length == 2) {
                nomes[i] = dados[0];  // Nome é a primeira parte
                String sexo = dados[1].toLowerCase();  // Sexo é a segunda parte

                if (sexo.equals("m")) {
                    sexos[i] = "Masculino";
                } else if (sexo.equals("f")) {
                    sexos[i] = "Feminino";
                } else {
                    sexos[i] = "Sexo inválido";  // Caso o sexo não seja M ou F
                }
            } else {
                System.out.println("Entrada inválida, por favor forneça o nome e o sexo.");
                i--;  // Decrementa o contador para tentar novamente
            }
        }

        // Exibindo os nomes e sexos
        System.out.println("\nCadastro de pessoas:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(nomes[i] + " - " + sexos[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeira parte
        ordenarNomes();

        // Segunda parte
        separarNomesSexo();
    }
}
