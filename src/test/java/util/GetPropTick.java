package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropTick {
    private static GetPropTick getPropTick= null;
    private String browser;
    private String host;
    private String user;
    private String pwd;

    private GetPropTick(){
        Properties properties = new Properties();
        String nameFile="tick.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream!= null){
            try {
                properties.load(inputStream);
                browser=properties.getProperty("browser");
                host=properties.getProperty("host");
                user=properties.getProperty("user");
                pwd=properties.getProperty("pwd");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetPropTick getInstance(){
        if (getPropTick == null)
            getPropTick=new GetPropTick();
        return getPropTick;
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }


}
