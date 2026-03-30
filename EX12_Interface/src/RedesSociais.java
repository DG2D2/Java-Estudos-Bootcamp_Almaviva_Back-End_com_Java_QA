public class RedesSociais implements MensagemIntegrada {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via redes sociais.\nMensagem: " + mensagem);

    }

}
