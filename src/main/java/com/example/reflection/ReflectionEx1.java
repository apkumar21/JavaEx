/*


 */

package com.example.reflection;

import java.lang.reflect.Method;

public class ReflectionEx1 {

    public static void main(String a[]) throws ClassNotFoundException {
        String hello = "Hello";

        //Class<String> test0 = hello.getClass(); compiler error

        //approach 1
        Class<? extends String> classRef1 = hello.getClass();
        Class<?> classRef2 = String.class;
        //approach 2
        String className = "java.lang.String";
        //approach 3
        Class<?> classRef3 = Class.forName(className);
        System.out.println(classRef3.getMethods());
        for(Method m:classRef3.getMethods()){
            System.out.println(m.getName());
        }
    }

}
