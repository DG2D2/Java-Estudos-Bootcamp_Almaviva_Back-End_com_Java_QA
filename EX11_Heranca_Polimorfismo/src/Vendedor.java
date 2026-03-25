public class Vendedor extends Funcionario {
    private final boolean administrador = false;
    private int vendas;

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void verificacaoAdministrador() {
        if (administrador) {
            System.out.println("É administrador(a).");
        } else {
            System.out.println("Não é administrador(a).");
        }
    }

    public void realizarVendas(int vendas) {
        for (int i = 0; i < vendas; i++) {
            this.vendas += 1;
        }
        System.out.println("Operação de venda concluida.");
    }

    public void consultarVendas() {
        System.out.println("Total de vendas realizadas: " + this.vendas);
    }


}
