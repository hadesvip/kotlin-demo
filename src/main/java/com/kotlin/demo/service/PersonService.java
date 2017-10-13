package com.kotlin.demo.service;

import com.kotlin.demo.data.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public static void main(String[] args) {
        Person person = new Person("zhangsan", 1);
        System.out.println(person);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
    }
}
