package com.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.container.Main;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;

/**
 * @author qp
 * @date 2019/7/22 10:27
 */
@EnableDubbo
@EnableDubboConfiguration
@DubboComponentScan("com.springboot.service.impl")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProviderApplication.class);
        app.run(args);
        //dubbo Main独立运行，脱离web容器
        Main.main(args);
    }
}
