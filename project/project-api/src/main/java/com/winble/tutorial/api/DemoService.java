package com.winble.tutorial.api;

import com.winble.tutorial.api.type.EchoResponse;

/**
 * Create on 2020/7/12
 *
 * @author bowenzhang
 */
public interface DemoService {

    EchoResponse echo(String text);
}
