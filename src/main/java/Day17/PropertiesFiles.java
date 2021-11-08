package Day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles {

    public static Properties prop; // object declaration

    //once we execute the code, prop will be cretead, prop=null.. it enters the if loop and resturn the value
    //Again we execute the code, prop will hold a value(Key(all the urls)). it is notnull. if condition will not execute
    //so, new properties() line won't execute again and again there fore not creating multiple objects for same task(fetching url)

    public static String getConfigValue(String key) throws IOException {

        if(prop==null) {
            // we can access the properties file by property class
            prop = new Properties(); //object created for properties class
            // using a file directory can introduce an exception if filepath is changed so, we have to fetch the current directory inorder to avoid it
            System.out.println(System.getProperty("user.dir"));

            // Convert Config.properties to byteStream
            FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties"); // this line place the current directory and concatnate the remaining path
            prop.load(Fin);
            Fin.close();
        }
        return prop.getProperty(key);

        /*String url = prop.getProperty("QA");
        System.out.println(url);*/

        // usage of below line-- we don't have to change the env in the code. instead we can change it in config files and everytime we can access the updated url


    }
}
