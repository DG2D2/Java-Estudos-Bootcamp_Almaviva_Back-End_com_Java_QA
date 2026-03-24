public class IngressoFamilia extends Ingresso {

    private int numeroPessoas;
    private double desconto = 0.05;

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public double precoFamilia(double preco) {
        preco *= numeroPessoas;
        this.preco = preco;

        if (numeroPessoas > 3) {
            preco *= desconto;
            this.preco -= preco;
        } else {
            desconto = 0;
        }

        return this.preco;
    }
        
    // Método para imprimir ingresso família.
    @Override
    public void imprimirIngresso() {
        System.out.println("======= INGRESSO FAMÍLIA =======");
        System.out.println("Filme: " + filme);
        System.out.println("DUB/LEG: " + idioma);
        System.out.println("Público: " + numeroPessoas);
        System.out.println("Desconto: " + desconto + "%.");
        System.out.println("Preço: R$" + preco);
        System.out.println("================================");
    }



}
