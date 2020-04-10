package com.winble.tutorial.presentation.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Map;


/**
 * @author bowenzhang
 */
@Order(1)
@Aspect
@Component
public class MonitorAspect {
//    private ILog log = LogManager.getLogger(getClass());

//    @Around("@annotation(monitor)")
//    public Object around(ProceedingJoinPoint point, Monitor monitor) throws Throwable {
//        Map<String, String> tags = Maps.newHashMap();
//        tags.put("class_method", point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
//        StringBuilder content = new StringBuilder();
//        content.append(MessageFormat.format("Request: {0}\n", JSON.toJSONString(point.getArgs())));
//        long startTime = System.currentTimeMillis();
//        try {
//            Object response = point.proceed();
//            content.append(MessageFormat.format("Response: {0}\n", response != null ? JSON.toJSONString(response) : ""));
//            return response;
//        } catch (BaseException e) {
//            content.append(MessageFormat.format("Catch BaseException: {0}, message: {1}\n", e.getClass(), e.getMessage()));
//            throw e;
//        } catch (SQLException e) {
//            content.append(MessageFormat.format("Data access error, message: {1}\n", e.getMessage()));
//            log.error(monitor.value(), e, tags);
//            throw new InvokeInterfaceException(ErrorCodeEnum.DATABASE_ERROR.error());
//        } catch (Throwable e) {
//            content.append(MessageFormat.format("System error: {0}, message: {1}\n", e.getClass(), e.getMessage()));
//            log.error(monitor.value(), e, tags);
//            throw new InvokeInterfaceException(ErrorCodeEnum.SYSTEM_ERROR.error());
//        } finally {
//            long endTime = System.currentTimeMillis();
//            content.append(MessageFormat.format("Spend time: {0}ms", (endTime - startTime)));
//            log.info(monitor.value(), content.toString(), tags);
//        }
//    }
}
