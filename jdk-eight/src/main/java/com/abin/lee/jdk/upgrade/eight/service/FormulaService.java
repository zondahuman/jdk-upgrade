package com.abin.lee.jdk.upgrade.eight.service;

/**
 * Created by abin on 2017/10/31 2017/10/31.
 * jdk-upgrade
 * com.abin.lee.jdk.upgrade.eight.defaults
 */
public interface FormulaService {

    Integer calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    static String find(String message){

        return "hi, " + message;
    };


}
