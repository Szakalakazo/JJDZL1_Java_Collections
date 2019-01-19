package com.infoshare.academy.data.structures.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTask {

    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src\\main\\resources\\1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("field1"));

        Set<String> set = properties.stringPropertyNames();

        for (String o : set) {
            System.out.println(properties.getProperty(o));
        }

    }
}
