public class ProdutosAlimentacao extends NotaFiscal implements Imposto {

    ProdutosAlimentacao() {
        this.valorImposto = 0.01;
    }

    @Override
    public void calcularImposto(double valorProduto) {
        this.valorProduto = valorProduto;
        this.imposto = valorProduto * valorImposto;
        this.precoFinal = valorProduto + this.imposto;
    }

}
