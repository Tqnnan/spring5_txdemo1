package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 0:50,
 */

@Configuration//作为配置类替代xml文件
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {
}
