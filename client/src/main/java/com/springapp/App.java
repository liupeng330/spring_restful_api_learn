package com.springapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.springapp.mvc.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RestTemplate template = new RestTemplate();
        Map<String, String> map= new HashMap<String, String>();
        map.put("id", "123");
        ResponseEntity<Person> p = template.getForEntity("http://localhost:8080/person/{id}", Person.class, map);
        if(p.getStatusCode() != HttpStatus.OK)
        {
            System.out.println("Response should return 'OK'");
        }
        Person person = p.getBody();
        System.out.println(person);
    }
}
