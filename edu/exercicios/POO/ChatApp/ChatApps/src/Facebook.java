public class Facebook extends CommunServices {
    
    @Override
    public void SendMensagge() {
        InternetTest();
        System.out.println("Facebook: Text Send");
    }
    public void ReceiveMensagge() {
        System.out.println("Facebook: Text received");
        SaveChat();
    }
    protected void SaveChat() {
        System.out.println("Console_log: Chat saved in facebook files");

    }
}
