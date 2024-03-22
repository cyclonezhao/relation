package zy.relation.dao.mybatis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zy.relation.dao.mybatis.interceptor.MyInterceptor;

import java.util.Properties;

@Configuration
public class MybatisConfiguration {
    @Bean
    public MyInterceptor myInterceptor() {
        MyInterceptor mybatisInterceptor = new MyInterceptor();
        Properties properties = new Properties();
        // 可以调用properties.setProperty方法来给拦截器设置一些自定义参数
        mybatisInterceptor.setProperties(properties);
        return mybatisInterceptor;
    }
}
