import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author narochnaya
 * @date 09.01.2016
 */
public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Start application {}", args.length);
        LOGGER.info("Stop application {}", args.length);
    }
}
