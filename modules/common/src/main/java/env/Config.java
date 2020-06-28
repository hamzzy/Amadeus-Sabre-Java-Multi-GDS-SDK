package env;

import java.util.Properties;

public class Config {

    private Properties properties;
    private String config;

    public Config() {
        this.properties = System.getProperties();
    }

    public Config(Properties properties) {
        this.properties = properties;
    }

    public String getConfig(String keyword) {
        return properties.getProperty(keyword);
    }

    public Properties getProperties(String keyword) {
        return (Properties) properties.get(keyword);
    }

}
