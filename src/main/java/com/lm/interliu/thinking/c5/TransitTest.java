package com.lm.interliu.thinking.c5;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liumeng09 on 2017/6/8.
 */
public class TransitTest {
    int a = 1;
    int b = 3;
    transient int  c = 4;
    transient Map<Object, Object> attributes = new HashMap<Object, Object>();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Map<Object, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<Object, Object> attributes) {
        this.attributes = attributes;
    }

    public static void main(String[] args) {
        TransitTest t = new TransitTest();
        t.attributes.put("1", "3");
        System.out.println(JSONObject.toJSONString(t));
    }
}
