package com.milind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Logging from App!");
        System.out.println( "Hello World!" );
    }
}
