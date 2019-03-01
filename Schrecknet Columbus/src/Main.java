import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner WelcomeScanner = new Scanner(System.in);
        String Player;
        char SireKnoledge;
        boolean yn;
        System.out.println("Don’t worry, I didn’t just downgrade your computer, kid, it looks like this for that old terminal feel. ;P -Lynx");
        //delay
        System.out.println("So, welcome to our world. What’s your name, kid?");
        //delay
        Player = WelcomeScanner.next();
        System.out.println("Do you know what you are, " + Player + "?");
        //delay
        System.out.println("Did your sire tell you?");
        //delay
        System.out.println("Y/N");
        SireKnoledge = WelcomeScanner.next().charAt(0);
        switch (SireKnoledge) {
            case 'n':
                yn = false;
                break;
            case 'y':
                yn = true;
                break;
            case 'N':
                yn = false;
                break;
            case 'Y':
                yn = true;
                break;
            default:
                yn = false;
        }
        if (yn) {
            //delay
            System.out.println("Wow, you're one of the lucky ones. Many kindred (vampires) don't get told what they are.");
        } else {
            //delay
            System.out.println("You're a vampire, kid. Accept it now or you'll be in a bad spot.");
        }
        //delay
        System.out.println("I better let you get into this. I'll have the Prince get a hold of you. I'll talk to you later. -Lynx");
        //delay
        System.out.println(





        );
        System.out.println("So, " + Player + ", Lynx told me that you're new here.");
        //delay
        System.out.println("They keep an eye on new kindred for me, set up Schrecknet Columbus, and even gave me my username. -Princyboi");
    }
}
