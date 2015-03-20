package tutorial.selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;


/**
 * Created by fede on 3/17/15.
 */
public class LoggingDemo {

static Logger log = Logger.getLogger(LoggingDemo.class);

    public static void main (String[] args){
//        BasicConfigurator.configure();
        Properties log4jprop = new Properties();
        log4jprop.setProperty("log4j.rootLogger", "DEBUG, CA");
        log4jprop.setProperty("log4j.appender.CA", "org.apache.log4j.ConsoleAppender");
        log4jprop.setProperty("log4j.appender.CA.layout", "org.apache.log4j.PatternLayout");
        log4jprop.setProperty("log4j.appender.CA.layout.ConversionPattern", "%d{yyyy-MM-dd} -- %-10p %c - %m%n");
        PropertyConfigurator.configure(log4jprop);

        log.info("This message is a info");
        runMethod();
        log.debug("This message is a debug");
    }

    public static void runMethod() {
        log.info("This is from runMethod");
    }
}