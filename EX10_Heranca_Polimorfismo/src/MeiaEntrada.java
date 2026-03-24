public class MeiaEntrada extends Ingresso {

    public double meiaEntrada(double preco) {
        this.preco = preco / 2;

        return this.preco;
    }

    // Método para imprimir ingresso.
    @Override
    public void imprimirIngresso() {
        System.out.println("===== INGRESSO - MEIA ENTRADA =====");
        System.out.println("Filme: " + filme);
        System.out.println("DUB/LEG: " + idioma);
        System.out.println("Preço: R$" + preco);
        System.out.println("===================================");
    }
}
