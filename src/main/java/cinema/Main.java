package cinema;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhafilme;

        System.out.println("==========================================");
        System.out.printf("%27s%n", "CINEMA SESSION");
        System.out.println("==========================================\n");

        System.out.println("Bem-vindo ao sistema do cinema!\n\n");

        System.out.println("Filmes em cartaz:\n");

        System.out.println("1 - Obsessão");
        System.out.println("2 - A Odisseia");
        System.out.println("3 - Homem-aranha: Um novo dia\n");

        System.out.print("Escolha um filme: ");
        escolhafilme = sc.nextInt();

        if(escolhafilme ==1){
            System.out.println("Obsessão");
        } else if(escolhafilme ==2){
            System.out.println("A Odisseia");
        } else if(escolhafilme ==3){
            System.out.println("Homem-aranha: Um novo dia");
        }

        sc.close();
    }
}
