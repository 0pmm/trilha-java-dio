public class Twitter extends CommunServices {
    @Override
    public void SendMensagge() {
        InternetTest();
        System.out.println("Twitter: Text Send");
    }
    public void ReceiveMensagge() {
        System.out.println("Twitter: Text received");
        SaveChat();
    }
    protected void SaveChat() {
        System.out.println("Console_log: Chat saved in Twitter files");
    }
}
