public class Atendente extends Funcionario {
    private final boolean administrador = false;
    private double valorCaixa;

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double pagamento) {
        this.valorCaixa = pagamento;
    }


    public void verificacaoAdministrador() {
        if (administrador) {
            System.out.println("É administrador(a).");
        } else {
            System.out.println("Não é administrador(a).");
        }
    }

    public void receberPagamento(double pagamento) {
        this.valorCaixa += pagamento;
        System.out.println("Pagamento de R$" + pagamento + " efetuado com sucesso.");
    }

    public void fecharCaixa() {
        System.out.println("Valor em caixa: R$" + this.valorCaixa);
    }

}
