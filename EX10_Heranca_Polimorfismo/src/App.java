public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ig1 = new Ingresso();
        MeiaEntrada ig2 = new MeiaEntrada();
        IngressoFamilia ig3 = new IngressoFamilia();
        IngressoFamilia ig4 = new IngressoFamilia();

        // ingresso comum.
        ig1.setFilme("Devorador de Estrelas");
        ig1.idioma("");
        ig1.setPreco(30);
        ig1.imprimirIngresso();

        System.out.println("\n");

        // Ingresso meia entrada.
        ig2.setFilme("Devorador de Estrelas");
        ig2.idioma("legendado");
        ig2.meiaEntrada(30);
        ig2.imprimirIngresso();

        System.out.println("\n");

        // Ingresso família com desconto.
        ig3.setFilme("Super Girl");
        ig3.idioma("");
        ig3.setNumeroPessoas(4);
        ig3.precoFamilia(30);
        ig3.imprimirIngresso();

        System.out.println("\n");

        // Ingresso família sem desconto.
        ig4.setFilme("Super Girl");
        ig4.idioma("legendado");
        ig4.setNumeroPessoas(3);
        ig4.precoFamilia(30);
        ig4.imprimirIngresso();

    }
}
