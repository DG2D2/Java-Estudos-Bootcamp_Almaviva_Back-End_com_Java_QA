public class Ingresso{
    protected String filme;
    protected String idioma;
    protected double preco;

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

        public String getIdioma() {
        return idioma;
    }

    public void setDIdioma(String idioma) {
        this.idioma = idioma;
    }

        public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    public void idioma(String idioma) {
        if (idioma.equalsIgnoreCase("dublado")) {
            this.idioma = "Dublado";
        } else if (idioma.equalsIgnoreCase("legendado")) {
            this.idioma = "Legendado";
        } else {
            this.idioma = "Dublado";
        }
    }


    // Método para imprimir ingresso.
    public void imprimirIngresso() {
        System.out.println("=========== INGRESSO ===========");
        System.out.println("Filme: " + filme);
        System.out.println("DUB/LEG: " + idioma);
        System.out.println("Preço: R$" + preco);
        System.out.println("================================");
    }

}