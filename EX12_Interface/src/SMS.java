public class SMS implements MensagemIntegrada {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via SMS.\nMensagem: " + mensagem);
        
    }

}
