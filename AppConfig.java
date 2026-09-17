public class AppConfig {

    private static AppConfig instance;

    String appName;
    String version;

    private AppConfig() {
        appName = "My App";
        version = "1.0";
    }

    public static AppConfig getInstance() {

        if (instance == null) {
            instance = new AppConfig();
        }

        return instance;
    }

    public static void main(String[] args) {

        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();

        System.out.println("App Name: " + obj1.appName);
        System.out.println("Version: " + obj1.version);

        System.out.println("Both objects are same: " + (obj1 == obj2));
    }
}