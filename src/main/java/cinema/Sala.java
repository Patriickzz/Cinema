package cinema;

public class Sala {
    
    private int numero;
    private boolean assentos;
    
    public Sala(int numero, boolean assentos) {
        this.numero = numero;
        this.assentos = assentos;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public boolean getAssentos() {
        return assentos;
    }
}
