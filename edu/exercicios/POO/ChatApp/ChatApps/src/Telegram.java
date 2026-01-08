public class Telegram extends CommunServices {
   @Override
    public void SendMensagge() {
        InternetTest();
        System.out.println("Telegram: Text Send");
    }
    public void ReceiveMensagge() {
        System.out.println("Telegram: Text received");
        SaveChat();
    }
    protected void SaveChat() {
        System.out.println(" Console_log: Chat saved in Telegram files");
    } 
}
