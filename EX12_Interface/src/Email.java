public class Email implements MensagemIntegrada {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Email.\nMensagem: " + mensagem);
        
    }

}
