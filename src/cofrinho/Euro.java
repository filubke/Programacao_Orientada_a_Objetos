package cofrinho; // Define que esta classe faz parte do pacote "cofrinho".

class Euro extends Moeda {
    private static final double COTACAO = 6.0; // Cotação fictícia

    public Euro(double valor) {
        super(valor);
    }
    // Multiplica pelo valor do euro em reais
    @Override
    public double converterParaReal() {
        return valor * COTACAO;
    }
    // Método para representar a moeda em formato de string
    @Override
    public String toString() {
        return "€: " + valor;
    }
}