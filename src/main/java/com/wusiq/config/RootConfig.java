package com.wusiq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 可以用非Web的组件来充实完善RootConfig。在RootConfig里边，我们可以去定义一些跟Spring Web模块关系不是太紧密的Bean，就比
 * 如DataSource或者是HibernateTemplate这种与数据库相关的Bean。
 */
@Configuration
@ComponentScan(basePackages = {"com.wusiq"},excludeFilters = {@Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}
