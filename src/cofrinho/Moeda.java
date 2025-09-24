package cofrinho; // Define que esta classe faz parte do pacote "cofrinho".

abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método que cada moeda vai implementar de forma diferente
    public abstract double converterParaReal();

    // Método para representar a moeda em formato de string
    public abstract String toString();

    public double getValor() {
        return valor;
    }
}
