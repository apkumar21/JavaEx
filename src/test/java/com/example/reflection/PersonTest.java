package com.example.reflection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

   @Test
   void testFields(){

       Class<?> personClass = Person.class;

       Field [] fields= personClass.getFields(); //this will return only public fields defined in the class. hence return empty array

       assertEquals(1, fields.length);

       Field[] declaredFields = personClass.getDeclaredFields(); // returns declared fields of the class of type, private, public, protected or default

       assertEquals(3, declaredFields.length);


    }

    @Test
    void testModifiers() throws NoSuchFieldException {
        Class<?> personClass = Person.class;

       Field field = personClass.getField("test");

       int mod = field.getModifiers();

       boolean isPublic = Modifier.isPublic(mod);

       assertEquals(true, isPublic);

    }



}