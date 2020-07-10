package com.winble.tutorial.presentation.controller;

import com.winble.tutorial.domain.shared.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/test")
    public CommonResult test(String text) {
        if ("test".equalsIgnoreCase(text)) {
            return new CommonResult();
        } else {
            CommonResult result = new CommonResult();
            result.setSuccess(false);
            return result;
        }
    }
}
