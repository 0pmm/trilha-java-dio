import java.util.Scanner;

public class PeterComputer {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CommunServices site = null;
        String app = scanner.next();
        
        do {
            if (app.equalsIgnoreCase("twt")){
                site = new Twitter();
            } else if(app.equalsIgnoreCase("fcb")){
                site = new Facebook();
            } else {
                site = new Telegram();
            }
            
            site.SendMensagge();
            site.ReceiveMensagge();

            app = scanner.next();
        
        } while(!app.equals("0"));
        
        
        scanner.close();
    }
}
