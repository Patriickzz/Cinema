package cinema;

public class Sala {
    
    private int numero;
    private boolean[][] assentos;
    
    public Sala(int numero) {
        this.numero = numero;
        this.assentos = new boolean[5][5];
    }
    
    public int getNumero() {
        return numero;
    }
    
    public boolean[][] getAssentos() {
        return assentos;
    }

    public void mostrarAssentos() {
        System.out.println("Assentos disponíveis na sala " + numero + ":");
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j] ? "[X] " : "[ ] ");
            }
            System.out.println();
        }
    }

    public boolean reservarAssento(int fileira, int cadeira) {
        if (fileira < 0 || fileira >= assentos.length || cadeira < 0 || cadeira >= assentos[0].length) {
            return false; // fora da matriz
        }
        if (assentos[fileira][cadeira]) {
            return false; // já ocupado
        }
        assentos[fileira][cadeira] = true;
        return true;
    }
}
