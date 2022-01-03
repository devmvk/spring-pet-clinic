package com.devmvk.springpetclinic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component()
public class BeanLifeCycle implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public static final String BEAN_CONTEXT_NAME = "beanLifeCycle";
    public static final String BEAN_COMPONENT_NAME = "lifeCycle";

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory is set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Will be destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties is set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Sets application context");
    }

    @PostConstruct
    public void beanToBirth(){
        System.out.println("Bean about to give birth");
    }

    @PreDestroy
    public void beanToDie(){
        System.out.println("Bean about to die");
    }
}
