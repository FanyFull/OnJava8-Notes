package com.fan.lambdademo;

import java.util.function.IntSupplier;

public class Closure2 {
    IntSupplier makefun(int x) {
        int i = 0;
        return () -> x + i;
    }
}
