public class Conta {
    private float saldo;
    private float chequeEspecial;
    private float valorInicialChequeEspecial;
    private float valorTaxa;
    private float valorRestante;
    private boolean primeiroDepositoRealizado = false;

    public Conta() {
        this.saldo = 0;
        this.chequeEspecial = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }


    // Métodos comportamentais da classe.

    // Método para atribuir valor ao Cheque Especial.
    public void primeiroDeposito(float valor) {
        if (primeiroDepositoRealizado) {
            System.out.println("Esta operação pode ser realizada apenas uma vez.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        saldo = valor;

        if (valor <= 500) {
            chequeEspecial = 50;
        } else {
            chequeEspecial = valor / 2;
        }
        
        valorInicialChequeEspecial = chequeEspecial;
        primeiroDepositoRealizado = true;

        System.out.println("Depósito de R$" + valor + " efetuado com sucesso.");
    }

    // Método para depositar.
    public void depositar(float valorDeposito) {
        if (primeiroDepositoRealizado) {
            if (valorDeposito > 0) {
                saldo += valorDeposito;
                System.out.println("Depósito de R$" + valorDeposito + " efetuado com sucesso.");
            } else {
                System.out.println("@@@ Valor inválido. O depósito tem que ser maior que 0. @@@");
            }
        } else {
            System.out.println("@@@ O Cheque Especial deve ser definido para realizar esta operação. @@@");
        }
    }

    // Método para sacar.
    public void sacar(float valorSaque) {
        if (valorSaque > 0) {
            if (valorSaque <= saldo) {
                saldo -= valorSaque;
                
                System.out.println("Saque de R$" + valorSaque + " efetuado com sucesso.");
                System.out.println("Saldo Atual: R$" + saldo);
            } else {
                System.out.println("@@@ Saldo insuficiente. @@@");
                valorRestante = valorSaque - saldo;
            }
        } else {
            System.out.print("@@@ Valor inválido. O valor do saque tem que ser maior que 0. @@@");
        }
    }

    // Método para pagar boleto.
    public void pagarBoleto(float valorBoleto) {
        if (valorBoleto > 0) {
            if (valorBoleto <= saldo) {
                saldo -= valorBoleto;

                System.out.println("Pagamento de R$" + valorBoleto + " efetuado com sucesso.");
                System.out.println("Saldo Atual: R$" + saldo);
            } else {
                System.out.println("@@@ Saldo insuficiente. @@@");
                valorRestante = valorBoleto - saldo;
            }
        } else {
            System.out.println("@@@ Valor inválido. O valor do boleto tem que ser maior que 0. @@@");
        }
    }

    // Método para verificar se o Cheque Especial está sendo utilizado.
    public void consultarChequeEspecial() {
        if (chequeEspecial != valorInicialChequeEspecial && valorInicialChequeEspecial != 0) {
            float valorUsado = valorInicialChequeEspecial - chequeEspecial;
            float porcentagemUtilizada = (valorUsado / valorInicialChequeEspecial) * 100;

            System.out.println("Saldo inicial do Cheque Especial: R$" + valorInicialChequeEspecial);
            System.out.println("Saldo Atual do Cheque Especial: R$" + chequeEspecial);
            System.out.printf("Porcentagem utilizada: %.2f%%\n", porcentagemUtilizada);
        } else {
            System.out.println("Saldo atual do Cheque Especial: R$" + chequeEspecial);
            System.out.println("Cheque Especial não utilizado.");
        }
    }

    // Método para utilizar Cheque Especial.
    public void utilizarChequeEspecial() {
        if (primeiroDepositoRealizado) {
            if (valorRestante > 0) {
                if (chequeEspecial >= valorRestante) {
                    saldo += valorRestante;
                    chequeEspecial -= valorRestante;
                    valorRestante -= valorRestante;
                    System.out.println("O valor necessário foi debitado do Cheque Especial e creditado ao saldo com sucesso.");
                } else {
                    System.out.println("@@@ Saldo insuficiênte do Cheque Especial. @@@");
                }
            } else {
                System.out.println("O Cheque Especial pode ser utilizado apenas em caso de insuficiência de saldo.");
            }
        } else {
            System.out.println("@@@ Esta operação pode ser realizada apenas após a definição do Cheque Especial. @@@");
        }
    }

    // Método para cobrança de taxa de uso total do Cheque Especial.
    public float cobrancaTaxa() {
        if (primeiroDepositoRealizado && chequeEspecial == 0) {
            valorTaxa = valorInicialChequeEspecial * 0.20f;
        } else {
            System.out.println("Não há cobranças pendentes.");
        }

        return valorTaxa;
    }

}