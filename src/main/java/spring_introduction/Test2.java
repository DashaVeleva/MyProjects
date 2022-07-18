package main.java.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("main/resources/applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();

    }
}
