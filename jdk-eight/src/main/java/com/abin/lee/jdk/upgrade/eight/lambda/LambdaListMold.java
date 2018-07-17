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
        list.sort((item1, item2) -> item1.compareTo(item2));
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



    public static void main(String[] args) {


    }


}
