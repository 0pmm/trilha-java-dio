import java.util.Scanner;

public class User {
    public static void main (String [] args) throws Exception {
        SmarTv smartTv = new SmarTv();
        Scanner scanner = new Scanner(System.in);
        int option = 10;

        while(option != 0) {
            System.out.println("Its on: " + smartTv.getPower());
            if (smartTv.getPower() == false) {
                System.out.println("Current Channel: --");
                System.out.println("Current Volume: --");
            } else {
                System.out.println("Current Channel: " + smartTv.getChannel());
                System.out.println("Current Volume: " + smartTv.getVolume());
            }

            System.out.println("-----------------");
            System.out.println("(1) Turn On/Off");
            System.out.println("(2) Volume Up");
            System.out.println("(3) Volume Down");
            System.out.println("(4) Change Channel");
            System.out.println("(0) Exit");
            option = scanner.nextInt();
            switch(option) {
                case 1: smartTv.changePower(); break;
                case 2: smartTv.plusVolume(); break;
                case 3: smartTv.minusVolume(); break;
                case 4: int channel = scanner.nextInt();
                        if (channel == 0) {
                            System.out.print("Channel: ");
                            channel = scanner.nextInt();
                            smartTv.changeChannel(channel);
                        } else {
                            if(channel < 0) {
                                smartTv.minusChannel();
                            } else {
                                smartTv.plusChannel();
                            }
                        }
            }
        }
        scanner.close();
    }
}
