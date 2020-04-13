package com.winble.tutorial.infrastructure.util;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Properties;

/**
 * @author bowenzhang
 */
@Component
public class ConfigUtil {
    public String getConfig() throws IOException {
//        InputStream inputStream = new BufferedInputStream(new FileInputStream("classpath:config.properties"));
//        Properties properties = new Properties();
//        properties.load(inputStream);
//        return properties.toString();
        return "test";
    }
}
