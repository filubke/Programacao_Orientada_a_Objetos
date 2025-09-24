package cofrinho;

class Yen extends Moeda {
    private static final double COTACAO = 0.04; // Cotação fictícia
    // no Yen o valor ficou ruin, pois a cotação parece ser favoravel, mas a moeda é diferente.

    public Yen(double valor) {
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
        return "¥: " + valor;
    }
}

