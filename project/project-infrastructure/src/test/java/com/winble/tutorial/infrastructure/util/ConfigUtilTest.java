package com.winble.tutorial.infrastructure.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

/**
 * @author bowenzhang
 */
@ContextConfiguration(classes = {ConfigUtil.class})
public class ConfigUtilTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ConfigUtil configUtil;

    @Test
    public void testGetConfig() throws IOException {
        System.out.println(configUtil.getConfig());
    }
}