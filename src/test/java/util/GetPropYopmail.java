package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropYopmail {
    private static GetPropYopmail getPropYopmail= null;
    private String browser;
    private String host;
    private String user;
    private String pwd;

    private GetPropYopmail(){
        Properties properties = new Properties();
        String nameFile="yopmail.properties";
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

    public static GetPropYopmail getInstance(){
        if (getPropYopmail == null)
            getPropYopmail=new GetPropYopmail();
        return getPropYopmail;
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
