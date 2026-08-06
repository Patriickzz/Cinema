package cinema;

public class Ingresso {

    private Filme filme;
    private Sala sala;
    private Cliente cliente;
    private double valor;
    private int fileira;
    private int cadeira;

    public Ingresso(Filme filme, Sala sala, Cliente cliente, double valor, int fileira, int cadeira) {
        this.filme = filme;
        this.sala = sala;
        this.cliente = cliente;
        this.valor = valor;
        this.fileira = fileira;
        this.cadeira = cadeira;
    }

    public double getValor() {
        return valor;
    }

    public int getFileira() {
        return fileira;
    }

    public int getCadeira() {
        return cadeira;
    }

    public void imprimir() {
        System.out.println("====INGRESSO====");
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Sala: " + sala.getNumero());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Assento: Fileira " + fileira + ", Cadeira " + cadeira);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
    }
}