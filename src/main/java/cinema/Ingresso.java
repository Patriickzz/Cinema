package cinema;

public class Ingresso {
    
    private double valor;
    private char fileira;
    private int cadeira;

    public Ingresso(double valor, char fileira, int cadeira) {
        this.valor = valor;
        this.fileira = fileira;
        this.cadeira = cadeira;
    }

    public double getValor() {
        return valor;
    }

    public char getFileira() {
        return fileira;
    }

    public int getCadeira() {
        return cadeira;
    }
}
