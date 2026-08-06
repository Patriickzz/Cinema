package cinema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.printf("%27s%n", "CINEMA SESSION");
        System.out.println("==========================================\n");
        System.out.println("Bem-vindo ao sistema do cinema!\n");

        Filme[] filmes = {
            new Filme("Obsessão", 108),
            new Filme("A Odisseia", 173),
            new Filme("Homem-aranha: Um novo dia", 144)
        };

        // salas ficam FORA do loop — os assentos ocupados persistem entre uma compra e outra
        Sala[] salas = {
            new Sala(1),
            new Sala(2),
            new Sala(3)
        };

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Comprar ingresso");
            System.out.println("2 - Ver assentos ocupados de uma sala");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    comprarIngresso(sc, filmes, salas);
                    break;
                case 2:
                    verAssentos(sc, salas);
                    break;
                case 3:
                    System.out.println("\nObrigado por usar o Cinema Session!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    private static void comprarIngresso(Scanner sc, Filme[] filmes, Sala[] salas) {
        System.out.println("\nFilmes em cartaz:\n");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + " - " + filmes[i].getTitulo() + " (" + filmes[i].getDuracao() + " min)");
        }
        System.out.print("\nEscolha um filme: ");
        int escolhaFilme = sc.nextInt();
        if (escolhaFilme < 1 || escolhaFilme > filmes.length) {
            System.out.println("Filme inválido.");
            return;
        }
        Filme filmeEscolhido = filmes[escolhaFilme - 1];

        System.out.println("\nEscolha uma sala: ");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i + 1) + " - Sala " + salas[i].getNumero());
        }
        int escolhaSala = sc.nextInt();
        if (escolhaSala < 1 || escolhaSala > salas.length) {
            System.out.println("Sala inválida.");
            return;
        }
        Sala salaEscolhida = salas[escolhaSala - 1];

        System.out.println();
        salaEscolhida.mostrarAssentos();

        System.out.print("\nEscolha a fileira (0 a 4): ");
        int fileira = sc.nextInt();
        System.out.print("Escolha a cadeira (0 a 4): ");
        int cadeira = sc.nextInt();

        boolean sucesso = salaEscolhida.reservarAssento(fileira, cadeira);
        if (!sucesso) {
            System.out.println("Assento inválido ou já ocupado.");
            return;
        }

        System.out.println("\nAssento reservado com sucesso!");
        salaEscolhida.mostrarAssentos();

        sc.nextLine();
        System.out.print("\nDigite seu nome: ");
        String nome = sc.nextLine();
        Cliente cliente = new Cliente(nome);

        Ingresso ingresso = new Ingresso(filmeEscolhido, salaEscolhida, cliente, 0.0, fileira, cadeira);
        System.out.println();
        ingresso.imprimir();
    }

    private static void verAssentos(Scanner sc, Sala[] salas) {
        System.out.println("\nEscolha uma sala para ver os assentos: ");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i + 1) + " - Sala " + salas[i].getNumero());
        }
        int escolhaSala = sc.nextInt();
        if (escolhaSala < 1 || escolhaSala > salas.length) {
            System.out.println("Sala inválida.");
            return;
        }
        System.out.println();
        salas[escolhaSala - 1].mostrarAssentos();
    }
}