public class Gerente extends Funcionario {
    private final boolean administrador = true;

    public void verificacaoAdministrador() {
        if (administrador) {
            System.out.println("É administrador(a).");
        } else {
            System.out.println("Não é administrador(a).");
        }
    }

    public void relatorioFinanceiro() {
        System.out.println("Gerando relatório...");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }

}
