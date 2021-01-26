package PropertiesManager;

import java.io.*;
import java.util.Properties;

public class PropertiesManager {

    public static String getPropertiesValue(String Key){
        Properties prop = new Properties();
        File file = new File("src/main/resources");
        try {
            prop.load(new FileInputStream(file.getAbsolutePath()+"/properties.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(Key);
    }

    public void setPropertieValue(String key, String value){
        Properties props = new Properties();
        File file = new File("src/main/resources");
        FileInputStream in = null;
        try {
            in = new FileInputStream(file.getAbsolutePath()+"/properties.properties");
            props.load(in);
            in.close();
            FileOutputStream out = new FileOutputStream(file.getAbsolutePath()+"/properties.properties");
            props.setProperty(key, value);
            props.store(out, null);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
