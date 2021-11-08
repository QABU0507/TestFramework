package Day20_Framework.Commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalConfig {

    //Day 24 content-- using this global config class. we can select the required url to input login credentails and check for invalid login

    private static GlobalConfig config = null;
    private Properties prop;
    private FileInputStream Fin;

    private GlobalConfig() throws IOException {
        try {
            prop = new Properties();
            Fin = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties"); // this line place the current directory and concatnate the remaining path
            prop.load(Fin);
            Fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static GlobalConfig getProperties() throws IOException {
        if (config == null) {
            config = new GlobalConfig();
        }
        return config;
    }

    public String get(String Key){
        return prop.getProperty(Key);
    }

    public void set(String key, String Value){
        prop.setProperty(key,Value);
    }
}
