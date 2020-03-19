package com.winble.tutorial.infrastructure.util;

import com.winble.tutorial.infrastructure.context.BaseContext;

public class ContextUtil {
    private static class ThreadLocalHolder {
        private static final ThreadLocal<BaseContext> INSTANCE = new ThreadLocal<>();
    }

    public static BaseContext currentContext() {
        ThreadLocal<BaseContext> current = ThreadLocalHolder.INSTANCE;
        BaseContext context = current.get();
        if (context == null) {
            context = new BaseContext();
            current.set(context);
        }
        return context;
    }

    public static void closeContext() {
        ThreadLocal<BaseContext> current = ThreadLocalHolder.INSTANCE;
        current.remove();
    }
}
