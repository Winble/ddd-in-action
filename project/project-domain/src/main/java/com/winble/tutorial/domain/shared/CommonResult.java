package com.winble.tutorial.domain.shared;

/**
 * Create on 2020/7/10
 *
 * @author bowenzhang
 */
public class CommonResult {

    public CommonResult() {
    }

    public static CommonResultBuilder builder() {
        return CommonResultBuilder.aCommonResult();
    }

    private boolean success = true;

    private Integer code = 0;

    private String message = "Success";

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


    public static final class CommonResultBuilder {
        private boolean success = true;
        private Integer code = 0;
        private String message = "Success";

        private CommonResultBuilder() {
        }

        public static CommonResultBuilder aCommonResult() {
            return new CommonResultBuilder();
        }

        public CommonResultBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public CommonResultBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        public CommonResultBuilder message(String message) {
            this.message = message;
            return this;
        }

        public CommonResultBuilder but() {
            return aCommonResult().success(success).code(code).message(message);
        }

        public CommonResult build() {
            CommonResult commonResult = new CommonResult();
            commonResult.setSuccess(success);
            commonResult.setCode(code);
            commonResult.setMessage(message);
            return commonResult;
        }
    }

    @Override
    public String toString() {
        return "CommonResult{" +
            "success=" + success +
            ", code=" + code +
            ", message='" + message + '\'' +
            '}';
    }
}
