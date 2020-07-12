package com.winble.tutorial.presentation.service;

import com.winble.tutorial.api.DemoService;
import com.winble.tutorial.api.type.EchoResponse;
import com.winble.tutorial.api.type.ResponseStatus;
import org.springframework.stereotype.Component;

/**
 * Create on 2020/7/12
 *
 * @author bowenzhang
 */
@Component(value = "demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public EchoResponse echo(String text) {
        EchoResponse response = new EchoResponse(ResponseStatus.builder().message("Hello " + text).build());
        return response;
    }
}
