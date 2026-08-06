package cinema;

public class Filme {
    
    private String titulo;
    private int duracao;
    
    public Filme(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

}