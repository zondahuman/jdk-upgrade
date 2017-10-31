package com.abin.lee.jdk.upgrade.eight.defaults;

/**
 * Created by abin on 2017/10/31 2017/10/31.
 * jdk-upgrade
 * com.abin.lee.jdk.upgrade.eight.defaults
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }


    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println("calculate : "+ formula.calculate(100));     // 100.0
        System.out.println("sqrt : "+ formula.sqrt(16));           // 4.0
    }
}
