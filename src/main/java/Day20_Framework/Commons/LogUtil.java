package Day20_Framework.Commons;

import java.util.logging.Logger;

public class LogUtil {
    private static Logger log = Logger.getLogger("Rediff Books");

    public static void info(String loginfo){
        log.info("logInfo");
    }
    public static void error(String logerror) {
        log.info("logerror");
    }
    public static void warn(String logwarn) {
        log.info("logwarn");
    }
}
