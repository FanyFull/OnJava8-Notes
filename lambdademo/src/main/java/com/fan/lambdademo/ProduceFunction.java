package com.fan.lambdademo;

import java.util.function.Function;

/**
 * 高阶函数只是一个消费或产生函数的函数
 */

interface FuncSS extends Function<String, String> {
} // [1] 使用继承，可以轻松的地为专用接口创建别名

public class ProduceFunction {
    // produce 是高阶函数
    static FuncSS produce() {
        return s -> s.toLowerCase(); // [2] 使用 Lambda 可以在方法中返回函数
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }

}
