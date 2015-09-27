package com.springapp;

import org.springframework.web.client.RestTemplate;
import com.springapp.mvc.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RestTemplate template = new RestTemplate();
        Person p = template.getForObject("http://localhost:8080/person/{id}", Person.class, "123");
    }
}
