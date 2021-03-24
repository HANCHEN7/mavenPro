package com.atguigu;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String results = hello.sayHello("litingwei");
        assertEquals("Hello litingwei!", results);     //断言
    }
}
