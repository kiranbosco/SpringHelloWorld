package org.spring.SampleHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context=new FileSystemXmlApplicationContext("bean.xml");
     
     Person person=(Person)context.getBean("personId");
     person.message();
     
     Address address=(Address)context.getBean(" "); 
     System.out.println(address);
     System.out.println(person);
    }
    }
