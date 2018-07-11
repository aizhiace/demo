package com.example.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * Java8新特性
 *
 * @author caizhaohui 2018/7/2
 */
@Slf4j
public class Java8NewFeatures {

    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        System.out.println("----------");
        log.info("Slf4j测试");
        log.error("main:1{}2{}3{}","A ","B ","C");
    }


}
