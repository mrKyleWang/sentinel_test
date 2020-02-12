package top.kylewang.sentinel.config;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author KyleWang
 * @date 2020/02/11
 */
@Configuration
@Slf4j
public class WebConfig {

    @Bean
    public FilterRegistrationBean<Filter> sentinelFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter());
        registration.addUrlPatterns("/*");
        registration.setName("sentinelFilter");
        registration.setOrder(1);

        log.info("Sentinel servlet CommonFilter registered");

        return registration;
    }
}