package Singleton;

public class Settings {

    private static Settings instance;

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
            instance.parametr1 = "abc";
            instance.parametr2 = 10;
            instance.parametr3 = true;
        }
        return instance;
    }

    private Settings(){

    }


    private String parametr1;
    private int parametr2;
    private boolean parametr3;

    public String getParametr1() {
        return parametr1;
    }

    public int getParametr2() {
        return parametr2;
    }

    public boolean isParametr3() {
        return parametr3;
    }

    public void setParametr1(String parametr1) {
        this.parametr1 = parametr1;
    }

    public void setParametr2(int parametr2) {
        this.parametr2 = parametr2;
    }

    public void setParametr3(boolean parametr3) {
        this.parametr3 = parametr3;
    }
}
