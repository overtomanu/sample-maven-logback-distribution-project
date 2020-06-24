import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Hello world class to generate logging
public class HelloWorld {
	private static Logger logger = LoggerFactory.getLogger(HelloWorld.class.getName());
	 
    public static void main(String[] args) {
    	System.out.println(System.getProperty("user.dir"));
    	System.out.println(StringUtils.capitalize("hello world"));
    	for(int i = 1; i <= 999999; i++) {
            logger.error(StringUtils.capitalize("This is the " + i + " time I say 'Hello World'."));
            //Thread.sleep(100);
        }
    }
}
