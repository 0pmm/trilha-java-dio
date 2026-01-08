public abstract class CommunServices {
    
    public abstract void SendMensagge();
    public abstract void ReceiveMensagge();
    
    protected abstract void SaveChat();

    protected void InternetTest() {
        System.out.println("Console_Log: Internet Connected");
    }
}
