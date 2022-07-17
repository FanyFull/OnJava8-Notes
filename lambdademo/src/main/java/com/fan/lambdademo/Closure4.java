package com.fan.lambdademo;

import java.util.function.IntSupplier;

public class Closure4 {
    IntSupplier makefun(final int x) {
        final int i = 0;
        return () -> x + i; // 等同 final 效果
    }
}
