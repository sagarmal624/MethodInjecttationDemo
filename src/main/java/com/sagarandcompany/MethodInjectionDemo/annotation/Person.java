package com.sagarandcompany.MethodInjectionDemo.annotation;

import com.sagarandcompany.MethodInjectionDemo.Address;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private String email;
    private Address address;

    @Lookup
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
