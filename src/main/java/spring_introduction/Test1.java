package main.java.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/resources/applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getAge() );
        System.out.println(person.getSurname());

        context.close();
    }

}
