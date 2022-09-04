package utiluties;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    static {
        String path = "configration.properties";
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
public static String getProperty(String key){
        return properties.getProperty(key);
}
}
