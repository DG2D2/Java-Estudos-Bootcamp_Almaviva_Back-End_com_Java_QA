public class App {
    public static void main(String[] args) throws Exception {
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        Atendente a1 = new Atendente();

        g1.setNome("Cazalbé");
        g1.setEmail("cazalbe@gmail.com");
        g1.setSenha("caca123");

        System.out.println("====== Gerente ======");
        g1.login("cazalbe@gmail.com", "caca123");
        g1.verificacaoAdministrador();
        g1.relatorioFinanceiro();
        g1.consultarVendas();
        g1.logoff();
        g1.alterarDados("Lucas", "lucas123");
        System.out.println("\n");
        
        
        v1.setNome("Léo");
        v1.setEmail("leonardo@gmail.com");
        v1.setSenha("leonardo123");
        
        System.out.println("====== Vendedor ======");
        v1.login("leonardo@gmail.com", "leonardo123");
        v1.verificacaoAdministrador();
        v1.alterarSenha("123");
        v1.logoff();
        v1.login("leonardo@gmail.com", "leonardo123");
        v1.login("leonardo@gmail.com", "123");
        v1.realizarVendas(10);
        v1.consultarVendas();
        v1.realizarVendas(20);
        v1.consultarVendas();
        System.out.println("\n");
        
        
        System.out.println("====== Atendente ======");
        a1.setNome("Ana");
        a1.setEmail("ana@gmail.com");
        a1.setSenha("ana123");
 
        a1.login("ana@gmail.com", "ana123");
        a1.verificacaoAdministrador();
        a1.receberPagamento(1500);
        a1.receberPagamento(2500);
        a1.fecharCaixa();

    }
}
