package com.springapp.mvc;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by peng on 9/26/15.
 */
@Component
public class Person implements Serializable
{
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    private String name;
    private int age;
}
