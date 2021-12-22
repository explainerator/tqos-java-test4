package com.github.explainerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

public class Main {
    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.error("Hello Error");
    }
}
