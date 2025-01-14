package com.example.mvc.config;

import com.example.mvc.config.bean.MyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

/**
 * <p>
 *     desc
 * </p>
 * @author 杨帮东
 * @since 1.0
 * @date 2021/12/09 17:18
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors (InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        String[] include = {"/upload"};
        MappedInterceptor interceptor = new MappedInterceptor(include, null, new MyHandlerInterceptor());
        registry.addInterceptor(interceptor);
    }
}
