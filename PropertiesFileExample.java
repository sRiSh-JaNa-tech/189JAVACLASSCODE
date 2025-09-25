import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
    public static void main(String[] args) {
        Properties props = new Properties();

        // Set properties
        props.setProperty("username", "admin");
        props.setProperty("password", "12345");
        props.setProperty("url", "http://example.com");

        // Save properties to a file
        try (FileOutputStream out = new FileOutputStream("config.properties")) {
            props.store(out, "Configuration Settings");
            System.out.println("Properties saved to config.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load properties from a file
        Properties loadedProps = new Properties();
        try (FileInputStream in = new FileInputStream("config.properties")) {
            loadedProps.load(in);
            System.out.println("Loaded Properties:");
            loadedProps.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}