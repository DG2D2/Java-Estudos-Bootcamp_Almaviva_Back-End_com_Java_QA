public class NotaFiscal {
    
    protected String produto;
    protected double valorProduto;
    protected double imposto;
    protected double precoFinal;
    protected double valorImposto;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorProduto() {
        return valorProduto;
    }
    
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }


    public String informarProduto(String produto) {
        this.produto = produto;
        
        return this.produto;
    }

    public void emitirNota() {
        System.out.println("\n====== Nota Fiscal ======");
        System.out.println("Produto: " + this.produto);
        System.out.println("Valor do produto: R$" + this.valorProduto);
        System.out.println("Valor do Imposto: " + valorImposto + "%.");
        System.out.println("Preço final: R$" + this.precoFinal);
        System.out.println("=========================\n");
    }

}
