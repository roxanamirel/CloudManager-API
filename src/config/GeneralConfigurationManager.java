package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GeneralConfigurationManager {

    private static Properties generalProperties;
    private static final String CONFIG_PATH="/var/lib/one/workspace/CloudManager-API/src/config/config.properties";

    static {
        generalProperties = new Properties();
        try {
            generalProperties.load(new FileInputStream(CONFIG_PATH));
        } catch (IOException e) {
            System.out.println("Unable to load CONFIG_PATH file");
            System.exit(1);
        }
    }

    public static String getNodesWakeUpMechanism() {
        return generalProperties.getProperty("nodesWakeUpMechanism");
    }
    
    public static String getPingLocation() {
        return generalProperties.getProperty("pingLocation");
    }

}
