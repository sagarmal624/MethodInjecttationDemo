package com.sagarandcompany.MethodInjectionDemo;

import com.sagarandcompany.MethodInjectionDemo.annotation.Person;
import com.sagarandcompany.MethodInjectionDemo.xml.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MethodInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MethodInjectionDemoApplication.class, args);
        // Xml Based Employee class example
        Employee employee = context.getBean(Employee.class);
        System.out.println("Before Changing in address instance...>>>---" + employee.getAddress().toString());
        Address address = employee.getAddress();
        address.setCity("Delhi");
        employee.setAddress(address);
        System.out.println("After Changing in address instance..and getting address from bean again.................... Here you can see...  you will get new address instacne.>>>---" + employee.getAddress().toString());
        System.out.println("Again getting address bean from container......... Here you can see...  you will get new address instacne.............");
        Employee emp = context.getBean(Employee.class);
        System.out.println(emp.getAddress().toString());


        // annotation Person class example
        System.out.println("............................................annotation example.....................................");
        Person person = context.getBean(Person.class);
        System.out.println("Before Changing in address instance...>>>---" + person.getAddress().toString());
        Address address1 = person.getAddress();
        address1.setCity("Delhi");
        person.setAddress(address1);
        System.out.println("After Changing in address instance..and getting address from bean again.................... Here you can see...  you will get new address instacne.>>>---" + person.getAddress().toString());
        System.out.println("Again getting address bean from container......... Here you can see...  you will get new address instacne.............");
        Person person1 = context.getBean(Person.class);
        System.out.println(person1.getAddress().toString());


    }
}
