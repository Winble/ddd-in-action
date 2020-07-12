package com.winble.tutorial.api.type;

/**
 * Create on 2020/7/12
 *
 * @author bowenzhang
 */
public class ResponseStatus {

    private boolean success = true;

    private Integer code = 0;

    private String message = "Success";

    public static ResponseStatusBuilder builder() {
        return ResponseStatusBuilder.aResponseStatus();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static final class ResponseStatusBuilder {
        private boolean success = true;
        private Integer code = 0;
        private String message = "Success";

        private ResponseStatusBuilder() {
        }

        public static ResponseStatusBuilder aResponseStatus() {
            return new ResponseStatusBuilder();
        }

        public ResponseStatusBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public ResponseStatusBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        public ResponseStatusBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ResponseStatusBuilder but() {
            return aResponseStatus().success(success).code(code).message(message);
        }

        public ResponseStatus build() {
            ResponseStatus responseStatus = new ResponseStatus();
            responseStatus.setSuccess(success);
            responseStatus.setCode(code);
            responseStatus.setMessage(message);
            return responseStatus;
        }
    }
}
