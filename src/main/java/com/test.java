package com;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        new ProcessBuilder("whoami").start().getInputStream();
        new ProcessBuilder("测试消息").start().getInputStream();
    }
}
