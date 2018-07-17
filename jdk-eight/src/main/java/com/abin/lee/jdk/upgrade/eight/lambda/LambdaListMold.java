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
public class LambdaListMold {

    public static void doThread(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("execute .. runnable...common.");
            }
        };
        new Thread(runnable).start();
    }

    public static void doThreadByLambda(){
        new Thread(() -> System.out.println("execute .. runnable...lambda"));
    }

    @Test
    public void doSort(){
        List<Integer> list = Lists.newArrayList(5,1,7,2,6,3,4);
        //排序
        Collections.sort(list,new Comparator<Integer>() {
            //使用新的排序规则 根据第二个字符进行逆序排
            @Override
            public int compare(Integer a,Integer b){
               return a.compareTo(b);
            }
        });
        System.out.println(JsonUtil.toJson(list));
    }

    @Test
    public void doSortByLambda(){
        List<Integer> list = Lists.newArrayList(5,1,7,2,6,3,4);
        System.out.println(JsonUtil.toJson(list));
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println(JsonUtil.toJson(list));
    }

    @Test
    public void doInteratorByLambda(){
        List<Integer> list = Lists.newArrayList(5,1,7,2,6,3,4);
        System.out.println("list=" + JsonUtil.toJson(list));
        List<Integer> listArray = Lists.newArrayList();
        list.forEach(value -> listArray.add(value));
        System.out.println("listArray=" + JsonUtil.toJson(listArray));
    }

    @Test
    public void doMethod1(){
        new Thread(()-> System.out.println("44444"));
    }
    public int add(int x, int y) {
        return x + y;
    }


    public static void main(String[] args) {
        doThread();
        doThreadByLambda();

    }


}
