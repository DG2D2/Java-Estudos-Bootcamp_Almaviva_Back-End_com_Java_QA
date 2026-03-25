public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private boolean logado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    // Método para realizar login.
    public void login(String email, String senha) {
        if (email.equals(this.email) && senha.equals(this.senha)) {
            logado = true;
            System.out.println("Login efetudo com sucesso. \nBem vindo(a) " + this.nome + "!");
        } else {
            System.out.println("@@@ Email ou senha inválidos. @@@");
        }
    }

    // Método para realizar logoff.
    public void logoff() {
        logado = false;
        System.out.println("Logoff realizado.");
    }

    // Método para alterar dados.
    public void alterarDados(String nome, String email) {
        if (logado) {
            this.nome = nome;
            this.email = email;
            System.out.println("Alteração realizada com sucesso.");
        } else {
            System.out.println("@@@ É preciso estar logado para realizar este procedimento. @@@");
        }
    }

    // Método para alterar senha.
    public void alterarSenha(String senha) {
        if (logado) {
            this.senha = senha;
            System.out.println("Senha alterada com seucesso.");
        } else {
            System.out.println("@@@ É preciso estar logado para realizar este procedimento. @@@");
        }

    }

}
