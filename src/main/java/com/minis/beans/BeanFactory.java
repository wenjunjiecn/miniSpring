package com.minis.beans;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException, ClassNotFoundException;

    boolean isSingleton(String name);

    boolean isPrototype(String name);

    Class<?> getType(String name);

    void registerBean(String beanID, BeanDefinition beanDefinition);
}
