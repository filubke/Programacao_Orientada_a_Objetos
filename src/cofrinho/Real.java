package cofrinho; // Define que esta classe faz parte do pacote "cofrinho".

class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }
    // O Real já está em Real, então só retorna o valor
    @Override
    public double converterParaReal() {
        return valor;
    }
    // Método para representar a moeda em formato de string
    @Override
    public String toString() {
        return "R$: " + valor;
    }
}
