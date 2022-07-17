package com.fan.lambdademo;

import java.util.function.Function;

/**
 * 柯里化：将一个多参数的函数，转换为一系列单参数函数
 */

public class CurryingAndPartials {
    // 未柯里化
    static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + b; // [1]
        System.out.println(uncurried("Hi ", "Ho"));

        Function<String, String> hi = sum.apply("Hi "); // [2] // 得到一个单参数函数
        System.out.println(hi.apply("Ho"));

        // 部分说明
        Function<String, String> sumHi = sum.apply("Hup ");
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));
    }
}
