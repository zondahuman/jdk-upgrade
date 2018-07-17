package com.abin.lee.jdk.upgrade.eight.lambda;

import com.abin.lee.jdk.upgrade.common.JsonUtil;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by abin on 2017/11/1 2017/11/1.
 * jdk-upgrade
 * com.abin.lee.jdk.upgrade.eight.lambda
 */
public class LambdaInterfaceMold {




    public static void main(String[] args) {
        new Thread(()-> System.out.println("------")).start();



    }




    public interface InnerModel{
        abstract void exc();
    }


}
