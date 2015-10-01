package com.springapp;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.springapp.mvc.Person;

import javax.xml.ws.Response;
import java.net.URI;
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
        Person forPost = new Person();
        forPost.setAge(12);
        forPost.setName("liu ming he");

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        headers.add("Accept", "application/json");
        HttpEntity<Person> requestEntity = new HttpEntity<Person>(forPost, headers);

        ResponseEntity<Person> returnedPerson = new RestTemplate().exchange("http://localhost:8080/person/", HttpMethod.POST, requestEntity, Person.class);
        System.out.println(returnedPerson.getBody());
    }
}
