package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class GetPropTodoist {
    private static GetPropTodoist getPropTodoist= null;
    private String browser;
    private String host;
    private String user;
    private String pwd;

    private GetPropTodoist(){
        Properties properties = new Properties();
        String nameFile="todoist.properties";
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

    public static GetPropTodoist getInstance(){
        if (getPropTodoist == null)
            getPropTodoist=new GetPropTodoist();
        return getPropTodoist;
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
