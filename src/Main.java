import creational.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        var manager = ConfigManager.getInstance();
        manager.set("name", "bung");

        var other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}