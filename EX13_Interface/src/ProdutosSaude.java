public class ProdutosSaude extends NotaFiscal implements Imposto {

    ProdutosSaude() {
        this.valorImposto = 0.015;
    }

    @Override
    public void calcularImposto(double valorProduto) {
        this.valorProduto = valorProduto;
        this.imposto = valorProduto * valorImposto;
        this.precoFinal = valorProduto + this.imposto;
    }

}
