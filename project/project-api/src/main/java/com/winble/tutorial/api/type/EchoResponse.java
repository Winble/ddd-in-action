package com.winble.tutorial.api.type;

/**
 * Create on 2020/7/12
 *
 * @author bowenzhang
 */
public class EchoResponse {

    private ResponseStatus responseStatus;

    public EchoResponse() {
    }

    public EchoResponse(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
