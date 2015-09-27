package com.springapp.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController
{
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getPerson()
    {
        List<Person> persons = new ArrayList<Person>();

        Person p = new Person();
        p.setAge(12);
        p.setName("oeng");
        persons.add(p);

        p = new Person();
        p.setAge(32);
        p.setName("liu peng");
        persons.add(p);

        return persons;
    }

    //通过PathVariable来获取url路径中的值
    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("id") long id)
    {
        System.out.println("Will get user by id " + id);
        Person p = new Person();
        p.setAge(12);
        p.setName("oeng");

        return p;
    }

    //可以使用ResponseEntity来返回不同的HTTP响应码
    @RequestMapping(value = "/person/", method = RequestMethod.POST)
    public ResponseEntity<Person> createPerson(@RequestBody Person p)
    {
        System.out.println("Will create person for " + p.getName());
        return new ResponseEntity<Person>(HttpStatus.ACCEPTED);
    }

    //通过PathVariable来获取url路径中的值
    @RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
    public Person delPerson(@PathVariable("id") long id)
    {
        System.out.println("Will del user by id " + id);
        Person p = new Person();
        p.setAge(12);
        p.setName("oeng");

        return p;
    }

}
