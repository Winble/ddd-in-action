package com.winble.tutorial.presentation.service;

import com.winble.tutorial.presentation.TestService;

/**
 * Create on 2020/7/10
 *
 * @author bowenzhang
 */
public class TestServiceImpl implements TestService {

    public String test(String name) {
        return "test: " + name;
    }
}
