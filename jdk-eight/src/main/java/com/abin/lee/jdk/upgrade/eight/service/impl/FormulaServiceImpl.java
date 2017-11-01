package com.abin.lee.jdk.upgrade.eight.service.impl;

import com.abin.lee.jdk.upgrade.eight.service.FormulaService;

/**
 * Created by abin on 2017/10/31 2017/10/31.
 * jdk-upgrade
 * com.abin.lee.jdk.upgrade.eight.defaults
 */
public class FormulaServiceImpl implements FormulaService{

    @Override
    public Integer calculate(int a) {
        return a+50;
    }

    @Override
    public double sqrt(int a) {
        return a+100;
    }



    public static void main(String[] args) {
        //        FormulaService formula = new FormulaService() {
//            @Override
//            public double calculate(int a) {
//                return sqrt(a * 100);
//            }
//        };


        FormulaService formula = new FormulaServiceImpl();
        System.out.println("calculate : "+ formula.calculate(100));     // 100.0
        System.out.println("sqrt : "+ formula.sqrt(16));           // 4.0
        System.out.println("sqrt : "+ FormulaService.find("abin"));           // 4.0
    }
}
