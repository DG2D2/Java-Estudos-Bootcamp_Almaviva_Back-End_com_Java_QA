public class WhatsApp implements MensagemIntegrada {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via WhatsApp.\nMensagem: " + mensagem);
        
    }

}
