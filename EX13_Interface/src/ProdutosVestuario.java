public class ProdutosVestuario extends NotaFiscal implements Imposto {

    ProdutosVestuario() {
        this.valorImposto = 0.025;
    }

    @Override
    public void calcularImposto(double valorProduto) {
        this.valorProduto = valorProduto;
        this.imposto = valorProduto * valorImposto;
        this.precoFinal = valorProduto + this.imposto;
    }

}
