package start;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.logging.Logger;

public class SettingsStart {
    static SelectSetting setting = new SelectSetting();

    public static void main(String[] args) {
        System.out.println("test");

        while(true){
            int test = setting.SelectSetting();
            if(test == 3){
                break;
            }
        }
    }
}
