public class ProdutosCultura extends NotaFiscal implements Imposto {

    ProdutosCultura() {
        this.valorImposto = 0.04;
    }

    @Override
    public void calcularImposto(double valorProduto) {
        this.valorProduto = valorProduto;
        this.imposto = valorProduto * valorImposto;
        this.precoFinal = valorProduto + this.imposto;
    }
}
