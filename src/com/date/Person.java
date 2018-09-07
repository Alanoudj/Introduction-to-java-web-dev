package com.date;

import java.lang.reflect.Method;

public class Person {

    public String getPersonName() {
        return "Tahhan";
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getPersonName());


        //Reflection
        try{
            Class personClass = Class.forName("com.date.Person");
            Method method = personClass.getMethod("getPersonName");
            System.out.println(method.invoke(personClass.newInstance(), null));
        }catch (Exception e) {

        }

    }

}
