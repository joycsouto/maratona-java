package RDatas;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
        System.out.println(resourceBundle.containsKey("hello"));
        System.out.println(resourceBundle.getString("hello"));
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("messages",new Locale("en","US"));
        System.out.println(resourceBundle2.containsKey("hello"));
        System.out.println(resourceBundle2.getString("hello"));
        System.out.println(resourceBundle2.getString("gm"));


    }
}
