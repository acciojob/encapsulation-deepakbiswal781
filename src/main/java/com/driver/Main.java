package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly t=new RWOnly();
        t.setName("Deepak");
        System.out.println(t.getName());

    }
}