package com.leyou.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MySpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())//把自己的拦截器加入进来
                .addPathPatterns("/user/**")//拦截路径
                .excludePathPatterns("/user/hello1");//排除的路径
    }
}
