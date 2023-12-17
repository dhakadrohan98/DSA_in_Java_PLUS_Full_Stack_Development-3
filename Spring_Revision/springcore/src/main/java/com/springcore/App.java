package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student student1 = (Student)context.getBean("student1");
       System.out.println(student1);
       System.out.println();
       Student student2 = (Student) context.getBean("student2");
       System.out.println(student2);
    }
}
