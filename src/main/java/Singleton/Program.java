package Singleton;

public class Program {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        Settings settings3 = Settings.getInstance();
        System.out.println(settings3.equals(settings1));

//        Settings settings4 = new Settings();
//        System.out.println(settings4.equals(settings1));

    }
}
